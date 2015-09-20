class Main {
	public static void main(String[] args) {
		Brok brok1 = new Brok(7, 5);
		Brok brok2 = new Brok(5, 8);
		
		brok1.multipliser(brok2);
		printBrok(brok1);
		brok1.divider(brok2);
		printBrok(brok1);
		brok1.summer(brok2);
		printBrok(brok1);
		brok1.subtraher(brok2);
		printBrok(brok1);
	}
	
	public static void printBrok(Brok brok) {
		System.out.println(brok.getTeller() + "/" + brok.getNevner());
	}
}