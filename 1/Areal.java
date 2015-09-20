import static javax.swing.JOptionPane.*; // Importerer swing biblioteket

class Areal {
	public static void main(String[] args) {
		// Bruker input for lengde og bredde (mottas som en String)
		String inputLengde = showInputDialog("Lengde (cm):");
		String inputBredde = showInputDialog("Bredde (cm):");

		// Konvertering fra string til double
		double lende = Double.parseDouble(inputLengde);
		double bredde = Double.parseDouble(inputBredde);

		if (lende > 0 && bredde > 0) {
			// Utregning av areal
			double areal = lende * bredde;
			// Print resultat
			showMessageDialog(null, "Arealet er " + areal + " cm2");
		} else {
			// Gir ikke mening å ha negative lengder, så skriver ut feilmelding.
			showMessageDialog(null, "Enten lengden eller bredden er 0 eller mindre.");
		}
	}
}
