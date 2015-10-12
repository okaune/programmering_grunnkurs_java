import static javax.swing.JOptionPane.*;

/**
*
* Mer generell variant av oppgaven som
* gjør den brukbar til å sammenlikne
* andre produkter enn bare kjøttdeigen.
*
*/

class Oppg3_12_4 {
	public static void main(String[] args) {
		// Produkt 1
		String inputPris1 = showInputDialog("Hva koster det første produktet?");
		String inputMasse1 = showInputDialog("Hvor mye veier det? (gram)");
		// Produkt 2
		String inputPris2 = showInputDialog("Hva koster det andre produktet?");
		String inputMasse2 = showInputDialog("Hvor mye veier det? (gram)");
		
		// Omformaterer variablene til noe vi kan bruke (sting til double)
		double pris1 = Double.parseDouble(inputPris1);
		double masse1 = Double.parseDouble(inputMasse1);
		double pris2 = Double.parseDouble(inputPris2);
		double masse2 = Double.parseDouble(inputMasse2);
		
		// Utregning
		double forhold1 = pris1 / masse1 * 1000;
		double forhold2 = pris2 / masse2 * 1000;
		double forskjell;
		
		if (forhold1 > forhold2) {
			forskjell = forhold1 - forhold2;
			showMessageDialog(null, String.format("Du sparer %.2f kr (pr. kg) på å kjøpe det andre produktet." , forskjell)); 
		} else if (forhold1 < forhold2) {
			forskjell = forhold2 - forhold1;
			showMessageDialog(null, String.format("Du sparer %.2f kr (pr. kg) på å kjøpe det første produktet.", forskjell));
		} else {
			showMessageDialog(null, "Begge produktene er like billige.");
		}
	}
}