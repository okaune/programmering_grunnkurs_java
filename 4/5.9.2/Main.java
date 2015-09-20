/**
* Hovedfunksjonen
*/
import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
	
		Valuta usd = new Valuta(8.37);
		Valuta eur = new Valuta(9.37);
		Valuta sek = new Valuta(0.99);
		
		boolean toNok = true;
		double amount;
		
		String valutaTypeInput = showInputDialog("Velg valuta:" + "\n" 
										+ "1: dollar" + "\n" 
										+ "2: euro" + "\n" 
										+ "3: svenske kroner" + "\n" 
										+ "4: avslutt");
		int valutaType = Integer.parseInt(valutaTypeInput);
		
		if (valutaType != 4) {
			String toOrFromInput = showInputDialog("Hva vil du gjøre:" + "\n" 
											+ "1: Til nok" + "\n" 
												+ "2: Fra nok" + "\n");
			int toOrFrom = Integer.parseInt(toOrFromInput);
			
			if(toOrFrom == 1) {
				toNok = true;
			} else if (toOrFrom == 2) {
				toNok = false;
			}
		
			String amountInput = showInputDialog("Skriv inn beløpet du vil regne om:");
			amount = Double.parseDouble(amountInput);
		}
		
		
		switch (valutaType) {
			case 1:
				if(toNok) {
					showMessageDialog(null, String.format("%.2f dollar = %.2f nok", amount, usd.toNok(amount)));
					break;
				} else {
					showMessageDialog(null, String.format("%.2f nok = %.2f dollar", amount, usd.fromNok(amount)));
					break;
				}
			case 2:
			if(toNok) {
				showMessageDialog(null, String.format("%.2f euro = %.2f nok", amount, eur.toNok(amount)));
				break;
			} else {
				showMessageDialog(null, String.format("%.2f nok = %.2f euro", amount, eur.fromNok(amount)));
				break;
			}
			case 3:
			if(toNok) {
				showMessageDialog(null, String.format("%.2f sek = %.2f nok", amount, sek.toNok(amount)));
				break;
			} else {
				showMessageDialog(null, String.format("%.2f nok = %.2f sek", amount, sek.fromNok(amount)));
				break;
			}
			default:
				break;
		}
		
		
	
	}
}