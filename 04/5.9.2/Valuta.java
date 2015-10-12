/**
* Valuta
*/

public class Valuta {
	private double valueNok = 0; // Verdi i forhold til norske kroner
	
	public Valuta(double valueNok) {
		this.valueNok = valueNok;
	}
	
	// Mulighet for å sjekke verdien til de ulike valutaene
	public double getValue() {
		return valueNok;
	}
	
	// Regner om til norske kroner fra den aktuelle valutaen
	public double toNok(double amount) {
		double nok = amount * valueNok;
		return nok;
	}
	
	// Regner om fra norske kroner til den aktuelle valutaen
	public double fromNok(double amount) {
		double val = amount / valueNok;
		return val;
	}
	
}