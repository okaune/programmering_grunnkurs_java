import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		
		while(true) {
		// Registrer tekstanalyse-objekter
		Tekstanalyse string1 = new Tekstanalyse();
		string1.setString(showInputDialog("Skriv inn en string du vil analysere:"));
		string1.addToArray(); // Analyserer hver bokstav i stringen og legger de i en array
		
		// Printer ut alle tegn i stringen med tilhørende verdi (brukes for å finne verdien til tegn)
		System.out.println(string1.returnValue());
		
		// Skriver ut stringen
		System.out.println("Analyserer denne stringen: '" + string1.getString() + "'");
		// Lister ut hvor mange bokstaver av hver type det er i stringen
		System.out.println(string1.outputArray());
		// Lister ut hvor mange unike bokstaver det er i stringen (regner ikke med tegn)
		System.out.println("Antall unike bokstaver: " + string1.uniqueChars());
		// Lister ut hvor mange bokstaver det er totalt i strengen (regner ikke med tegn)
		System.out.println("Totalt antall bokstaver: " + string1.totalChars());
		// Lister ut de bokstavene i strengen som forekommer flest ganger (regner ikke med tegn)
		System.out.println(string1.mostOccuringLetter());
		// Lister ut hvor mange prosent av teksten som ikke er bokstaver (altså tegn)
		System.out.println(string1.notLetters() + " av teksten er ikke bokstaver.");
		}
		
	}
}