import java.util.*;

class Main {
	public static void main(String[] args) {
		// Oppretter en random (brukes for å generere tilfeldige temperaturer)
		Random random = new Random();
		
		// Opretter objektet januar
		Temperaturer januar = new Temperaturer(31);
		
		// Setter tilfeldige verdier for hver time i januar
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 24; j++) {
				januar.setTemp(i, j, random.nextInt(50) - 20);
			}
		}
		
		// Henter gjennomsnittstemperatur for valgt time alle dager i måneden (parameter er time, 3 er kl. 3 - 24 er midnatt)
		System.out.println(String.format("Gjennomsnittstemperaturen for kl. 3 denne måneden er %d grader.", januar.getTempTime(3)));
		
		// Henter gjennomsnittstemperatur for valgt dag (parameter er dato, 1 er første dag)
		System.out.println(String.format("Gjennomsnittstemperaturen for 1. januar er %d grader.", januar.getTempDag(1)));
		
		// Henter gjennomsnittstemperatur for måneden
		System.out.println(String.format("Gennomsnittstemperaturen for januar er %d grader.", januar.getTempManed()));
		
		// Skriver ut hvor mange døgn som ligger i ulike kategorier (0 - 4)
		System.out.println(String.format("Antall dager gjennomsnittstemperaturen lå mellom 5 og 10 grader i januar er %d dager.", januar.tempKategori(3)));
		
	}
}