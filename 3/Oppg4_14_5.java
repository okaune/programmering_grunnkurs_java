import static javax.swing.JOptionPane.*;

class Oppg4_14_5 {
	public static void main (String[] args) {
		
		do {
			// Tall fra bruker
			String tallInput = showInputDialog("Skriv inn et tall du vil sjekke om er et primtall");
			
			// Gjør om fra string til int
			int tall = Integer.parseInt(tallInput);
			
			if (isPrime(tall)) {
				showMessageDialog(null, tall + " er et primtall! " + "☺");
			} else {
				showMessageDialog(null, tall + " er ikke et primtall " + "☹");
			}
		} while (true);

	}
	
	
	static boolean isPrime(int tall) {
		if (tall <= 1) {
			return false;
		} else if (tall <= 3) {
			return true;
		} else if (tall % 2 == 0 || tall % 3 == 0) {
			return false;
		} else {
			int i = 5;
			while (i * i <= tall) {
				if (tall % i == 0 || tall % (i + 2) == 0) {
					return false;
				}
				i = i + 6;
			}
			return true;
		}
	}
}