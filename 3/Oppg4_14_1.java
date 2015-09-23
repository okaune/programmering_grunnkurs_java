/**
*
* Gangetabell
*
*/

// Importing JOptionPane
import static javax.swing.JOptionPane.*;

class Oppg4_14_1 {
	public static void main(String[] args) {
		
		// Hvilket tall vil brukeren starte fra?
		String startInput = showInputDialog("Hvilken tabell vil du starte fra?");
		// Hvilket tall vil brukeren slutte på?
		String endInput = showInputDialog("Hvilken tabell vil du stoppe ved?");
			
		// Omgjøring fra string til int
		int start = Integer.parseInt(startInput);
		int end = Integer.parseInt(endInput);
		
		if (start>end) {
			showMessageDialog(null, "Du kan ikke slutte på et lavere tall enn det du starter på"); // Checks if the second number is lager than the first
		} else {
		
			// Initier result
			String result = "";
		
			// Loop gjennom tebellen og skriv ut for alle verdiene i tabellen
			for(int i = start; i < end + 1; i++) {
				result += i + " gangen:" + "\n"; // Adds a "header" when a new table is started
				
				for ( int j = 1; j <= 10; j++) {
					int svar = i * j; // Multiplies the table (i) and the current number (j) 
					result += i + " * " +  j + " = " + svar + "\n"; // Adds the a line to the result string
				}
				
				result += "\n"; // Empty line between tables
			}
			// Skriv ut resultat
			System.out.println(result);
			//showMessageDialog(null, result);
		}
		
	}
}