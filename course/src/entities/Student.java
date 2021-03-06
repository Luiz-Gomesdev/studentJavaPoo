package entities;

public class Student {
	    
    private String name;
    private String registration;
    private String courseName;
    private String[] disciplineName;
    private double[][] notesDisciplines;

    public Student() {
        disciplineName = new String[3]; //incremento do vetor [3]
        notesDisciplines = new double[3][4]; //incremento dos vetores [3][4]
    }

    public Student(String name, String registration, String courseName) {
        this.name = name;
        this.registration = registration;
        this.courseName = courseName;
        this.disciplineName = new String[3]; //incremento do vetor [3]
        this.notesDisciplines = new double[3][4]; //incremento dos vetores [3][4]
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String[] disciplineName) {
		this.disciplineName = disciplineName;
	}

	public double[][] getNotesDisciplines() {
		return notesDisciplines;
	}

	public void setNotesDisciplines(double[][] notesDisciplines) {
		this.notesDisciplines = notesDisciplines;
	}

	public void showInfo(){
    	System.out.println("Name: " + name);
        System.out.println("Registration: " + registration);
        System.out.println("Course Name: " + courseName);
        
        for (int i=0; i<notesDisciplines.length; i++){
            System.out.println("Course notes " + disciplineName[i]);
            for (int j=0; j<notesDisciplines[i].length; j++){
                System.out.print(notesDisciplines[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean approved(int index){
        
        if (obteraverage(index) >= 7){
            return true;
        } 
        
        return false;
    }
    
    private double obteraverage(int index){
        
        double sum = 0;
        
        for (int i=0; i<notesDisciplines[index].length; i++){
            sum += notesDisciplines[index][i];
        }
        
        double average = sum / 4;
        
        return average;
    }
    
    public void setDisciplineNamePos(int pos, String disciplineName){
        this.disciplineName[pos] = disciplineName;
    }
    
    public void setNamePosIJ(int posI, int posJ, double note){
        this.notesDisciplines[posI][posJ] = note;
    }
}
