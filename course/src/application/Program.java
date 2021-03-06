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
		System.out.print("Course Name: ");
		st.setCourseName(sc.nextLine());
		System.out.print("Registration Number: ");
		st.setRegistration(sc.nextLine());
		
	
		
		for (int i=0; i< st.getDisciplineName().length; i++) {
			System.out.print("Enter the discipline name " + i + " : ");
			st.setDisciplineNamePos(i, sc.next());
		}
		
		
		for (int i=0; i<st.getNotesDisciplines().length; i++){
            System.out.println("Getting course grades " + st.getDisciplineName()[i]);
            for (int j=0; j<st.getNotesDisciplines()[i].length; j++){
                System.out.println("Enter the note " + (j+1));
                st.setNamePosIJ(i, j, sc.nextDouble());
            }
        }
		
		
		st.showInfo();
        
        for (int i=0; i<st.getDisciplineName().length; i++){
            if (st.approved(i)){
                System.out.println("Discipline " + st.getDisciplineName()[i] + " - was approved");
            } else {
                System.out.println("Discipline " + st.getDisciplineName()[i] + " - disapproved");
            }
        }
		
		
		sc.close();
	}

}
