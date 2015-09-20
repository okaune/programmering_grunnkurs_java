import static javax.swing.JOptionPane.*;

class TilSekunder {
	public static void main(String[] args) {
		// Bruker input
		String inputTime = showInputDialog("Antall timer:");
		String inputMin = showInputDialog("Antall minutter:");
		String inputSek = showInputDialog("Antall sekunder:");
		// String til double
		double time = Double.parseDouble(inputTime);
		double min = Double.parseDouble(inputMin);
		double sek = Double.parseDouble(inputSek);
		// Omregning
		min = min + time * 60;
		sek = sek + min * 60;
		
		showMessageDialog(null, sek + " sekunder");
	}
}