import static javax.swing.JOptionPane.*;

class Oppg3_12_3 {
	
	// Tester for skuddår
	// 2000 er skuddår
	// 100 er ikke skuddår
	// 1856 er skuddår
	
	
	public static void main(String[] args) {
		// Få årstall fra bruker
		String yearInput = showInputDialog("Er det et skuddår?\nSkriv inn årstall du vil sjekke:");
		// Gjør om fra string til int
		int year = Integer.parseInt(yearInput);
		
		// Sjekk om årstallet er et skuddår
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				showMessageDialog(null, year + " er et skuddår." );
			} else {
				showMessageDialog(null, year + " er ikke et skuddår." );
			}
		} else if (year % 4 == 0) {
			showMessageDialog(null, year + " er et skuddår." );
		} else {
			showMessageDialog(null, year + " er ikke et skuddår." );
		}
	}
}