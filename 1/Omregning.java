import static javax.swing.JOptionPane.*;

class Omregning {
	public static void main(String[] args) {
		// Bruker input for antall tommer
		String inputTomme = showInputDialog("Lengde (tommer):");
		// Konvertering fra string til double
		double tomme = Double.parseDouble(inputTomme);
		// Utregning av cm (1 tomme = 2.54cm)
		double cm = tomme * 2.54;
		// Print resultat (1 tomme(r) = 2.54 cm)
		showMessageDialog(null, tomme + " tomme(r) = " + cm + " cm");
	}
}
