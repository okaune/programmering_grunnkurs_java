class Main {
	public static void main(String[] args) {
		Student[] studenter = {new Student("Bob", 2), new Student("Lars", 5), new Student("Karl", 3)};
		Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(studenter);
		
		System.out.println(oppgaveoversikt);
		
		oppgaveoversikt.nyStudent(new Student("Kari", 6));
		System.out.println(oppgaveoversikt);
		
		System.out.println(oppgaveoversikt.getAntOppg("Kari"));
		
		oppgaveoversikt.økAntOppg("Kari", 2);
		System.out.println(oppgaveoversikt.getAntOppg("Kari"));
	}
}