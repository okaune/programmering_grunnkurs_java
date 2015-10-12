import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		Spiller spillerA = new Spiller("Spiller A");
		Spiller spillerB = new Spiller("Spiller B");
		
		int counter = 0;
		
		while (!spillerA.erFerdig() && !spillerB.erFerdig()) {
			if (counter % 2 == 0) {
				System.out.println(spillerA.getPlayerName() + ":");
				System.out.println("Terningkast: " + spillerA.kastTerningen());
				System.out.println("Totalsum: " + spillerA.getSumPoeng());
				System.out.println("\n");
			} else {
				System.out.println(spillerB.getPlayerName() + ":");
				System.out.println("Terningkast: " + spillerB.kastTerningen());
				System.out.println("Totalsum: " + spillerB.getSumPoeng());
				System.out.println("\n");
			}
			counter++;
		}
		
		
	}
}