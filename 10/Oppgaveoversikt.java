class Oppgaveoversikt {
	private Student[] studenter;
	private int antStud = 0;
	
	public Oppgaveoversikt(Student[] studenter) {
		this.studenter = studenter;
		antStud = studenter.length;
	}
	
	public int getAntStud() {
		return antStud;
	}
	
	public int getStudentIndex(String student) {
		int index = 0;
		for (int i = 0; i < studenter.length; i++) {
			if (studenter[i].getNavn().equals(student)) {
				index = i;
			}
		}
		return index;
	}
	
	public int getAntOppg(String student) {
		return studenter[getStudentIndex(student)].getAntOppg();
	}
	
	public void nyStudent(Student student) {
		Student[] nyStudent = new Student[studenter.length + 1];
		for (int i = 0; i < studenter.length; i++) {
			nyStudent[i] = studenter[i];
		}
		nyStudent[studenter.length] = student;
		studenter = new Student[nyStudent.length];
		for (int i = 0; i < nyStudent.length; i++) {
			studenter[i] = nyStudent[i];
		}
		antStud += 1;
	}
	
	public void økAntOppg(String student, int økning) {
		studenter[getStudentIndex(student)].økAntOppg(økning);
	}
	
	public String toString() {
		String output = antStud + "\n";
		for (int i = 0; i < studenter.length; i++) {
			output += studenter[i] + "\n";
		}
		return output;
	}
}