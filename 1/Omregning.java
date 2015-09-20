import static javax.swing.JOptionPane.*;

class Omregning {
	public static void main(String[] args) {
		// Bruker input
		String inputTomme = showInputDialog("Lengde (tommer):");
		// Omregning fra string til double
		double tomme = Double.parseDouble(inputTomme);
		// Utregning av cm
		double cm = tomme * 2.54;
		// Print resultat
		showMessageDialog(null, cm + " cm");
	}
}