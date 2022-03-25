package entities;

import java.util.Arrays;

public class Student {
	
	private String name;
	private String registration;
	private String course; 
	private String discipline;
	private double[][] notesDisciplines;
	
	
	public Student() {
	}
	
	public Student(String name, String registration, String course, String discipline, double[][] notesDisciplines) {
		super();
		this.name = name;
		this.registration = registration;
		this.course = course;
		this.discipline = discipline;
		this.notesDisciplines = notesDisciplines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public double[][] getNotesDisciplines() {
		return notesDisciplines;
	}

	public void setNotesDisciplines(double[][] notesDisciplines) {
		this.notesDisciplines = notesDisciplines;
	}

	public void approved(double note) {
		if (note >= 7) {
			System.out.println("Approved student with grade " + note);
		}else {
			System.out.println("Failed student with grade " + note);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", registration=" + registration + ", course=" + course + ", discipline="
				+ discipline + ", notesDisciplines=" + Arrays.toString(notesDisciplines) + "]";
	}
	
	
}
