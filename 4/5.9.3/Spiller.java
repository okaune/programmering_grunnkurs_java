import java.util.*;

class Spiller {
	private String name = "";
	private int sumPoeng = 0;
	Random terning = new Random(); // Registrerer terning som en random
	

	public Spiller(String name) {
		this.name = name;
	}
	
	public String getPlayerName() {
		return name;
	}
	
	public int getSumPoeng() {
		return sumPoeng;
	}
	
	public int kastTerningen() {
		int terningkast = terning.nextInt(6) + 1;
		if (terningkast != 1) {
			this.sumPoeng += terningkast;
			return terningkast;
		} else {
			this.sumPoeng = 0;
			return terningkast;
		}
	}
	
	public boolean erFerdig() {
		if (sumPoeng >= 100) {
			return true;
		} else {
			return false;
		}
	}
}