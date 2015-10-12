import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		// Opretter en Person
		Person bob = new Person("Bob", "Hansen", 1964);
		// Opretter en ArbTaker
		ArbTaker jobbeBob = new ArbTaker(bob, 2336536, 1988, 200, 30);
		
		Object[] options = {"Lukk", "Månedslønn", "Skatteprosent"};
		int valg;
		int verdi;
		do {
			valg = showOptionDialog(null,
	                               "Hvilken verdi vil du endre?",
	                               "Endre innhold i ArbTaker",
	                               YES_NO_CANCEL_OPTION,
	                               INFORMATION_MESSAGE,
	                               null,
	                               options,
	                               null);
			
			switch (valg) {
				case 1:
					verdi = Integer.parseInt(showInputDialog("Ny månedslønn:"));
					jobbeBob.setMånedslønn(verdi);
					showMessageDialog(null, "Ny månedslønn: " + jobbeBob.getMånedslønn() + "\n" +
											"Skattetrekk: " + jobbeBob.skattetrekk() + "\n" +
											"Bruttolønn per år: " + jobbeBob.bruttolønnÅr());
					break;
				case 2:
					verdi = Integer.parseInt(showInputDialog("Ny skatteprosent:"));
					jobbeBob.setSkatteprosent(verdi);
					showMessageDialog(null, "Ny skatteprosent: " + jobbeBob.getSkatteprosent() + "\n" +
											"Skattetrekk: " + jobbeBob.skattetrekk() + "\n" +
											"Skattetrekk per år: " + jobbeBob.skattetrekkÅr());
					break;
				default:
					System.out.println("Lukket");
			}
		} while (valg > 0);
	}
}