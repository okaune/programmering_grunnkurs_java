class Main {
	public static void main(String[] args) {
		// Opretter en Person
		Person bob = new Person("Bob", "Hansen", 1964);
		// Opretter en ArbTaker
		ArbTaker jobbeBob = new ArbTaker(bob, 2336536, 1988, 200, 30);
	}
}