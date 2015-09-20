import static javax.swing.JOptionPane.*;

class Areal {
	public static void main(String[] args) {
		// Bruker input
		String inputLengde = showInputDialog("Lengde (cm):");
		String inputBredde = showInputDialog("Bredde (cm):");
		
		// Omregning fra string til double
		double lende = Double.parseDouble(inputLengde);
		double bredde = Double.parseDouble(inputBredde);
		
		if (lende > 0 && bredde > 0) {
			// Utregning av areal
			double areal = lende * bredde;
			// Print resultat
			showMessageDialog(null, "Arealet er " + areal + " cm2");
		} else {
			showMessageDialog(null, "Tall 0 eller mindre");
		}
	}
}