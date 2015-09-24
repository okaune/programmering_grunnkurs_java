/**
*
* Spillervalg
* 	Samme program som oppgaven, men skrevet 
* 	om til å kunne gjelde et valgfritt antall 
*	spillere.
*
*/

import static javax.swing.JOptionPane.*;

class Spillervalg {
	public static void main(String[] args) {
		int antall = Integer.parseInt(showInputDialog("Hvor mange spillere er det?"));
		Spiller[] spillere = new Spiller[antall];
		
		for (int i = 0; i < spillere.length; i++) {
			spillere[i] = new Spiller("Spiller " + (i + 1));
		}
		
		boolean run = true;
		String resultString = "";
		
		while (run) {
			for (int i = 0; i < spillere.length; i++) {
				System.out.println(spillere[i].getPlayerName() + ":");
				System.out.println("Terningkast: " + spillere[i].kastTerningen());
				System.out.println("Totalsum: " + spillere[i].getSumPoeng());
				System.out.println("\n");
				
				if (spillere[i].getSumPoeng() >= 100) {
					run = false;
					resultString = spillere[i].getPlayerName() + " vant!";
				}
			}
			
			System.out.println("--------------------\n"); // Printer en strek mellom rundene!
				
		}
		
		System.out.println(resultString);
		
	}
}