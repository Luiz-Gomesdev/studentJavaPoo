package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		
		System.out.println("==== STUDENT INFORMATION ====");
		System.out.print("Name: ");
		st.setName(sc.nextLine());
		System.out.print("Registration Number: ");
		st.setRegistration(sc.nextLine());
		System.out.print("Course: ");
		st.setCourse(sc.nextLine());
		
		System.out.print("Enter number Disciplines: ");	
		int n = sc.nextInt();
		
		for (int i=1; i<= n; i++) {
			System.out.print("Enter the discipline name " + i + " : ");
			sc.next();
			st.setDiscipline(sc.nextLine());
		}
				
		
		System.out.println(st);
		
		
		sc.close();
	}

}
