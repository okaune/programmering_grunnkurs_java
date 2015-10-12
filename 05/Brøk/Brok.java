class Brok {
	private int teller;
	private int nevner;
	
	public Brok(int teller, int nevner) {
		this.teller = teller;
		if(nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0");
		} else {
			this.nevner = nevner;
		}
		
	}
	
	public Brok(int teller) {
		this.teller = teller;
		nevner = 1;
	}
	
	public int getTeller() {
		return teller;
	}
	
	public int getNevner() {
		return nevner;
	}
	
	public void summer(Brok brok) {
		if(nevner != brok.nevner) {
			int fellesNevner = nevner * brok.nevner;
			teller *= brok.nevner;
			brok.teller *= nevner;
			nevner = fellesNevner;
			brok.nevner = fellesNevner;
		}
		
		teller += brok.teller;
		
		//Forkort
		forkort();
	}
	
	public void subtraher(Brok brok) {
		if(nevner != brok.nevner) {
			int fellesNevner = nevner * brok.nevner;
			teller *= brok.nevner;
			brok.teller *= nevner;
			nevner = fellesNevner;
			brok.nevner = fellesNevner;
		}
		
		teller -= brok.teller;
		
		//Forkort
		forkort();
	}
	
	public void multipliser(Brok brok) {
		teller *= brok.teller;
		nevner *= brok.nevner;
		
		//Forkort
		forkort();
	}
	
	public void divider(Brok brok) {
		teller *= brok.nevner;
		nevner *= brok.teller;
		
		//Forkort
		forkort();
	}
	
	public void forkort() {
		for (int i = 2; i <= teller; i++)  {
			while (teller % i == 0 && nevner % i == 0) {
				teller /= i;
				nevner /= i;
			}
		}
	}
}