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
		
		// Henter referanser til tabeller
		int[] januarDag = januar.getTempDag();
		int[] januarTime = januar.getTempTime();
		int[] januarKategori = januar.tempKategori();
		
		// Henter gjennomsnittstemperatur for valgt dag (parameter er dato, 1 er første dag)
		for (int i = 0; i < januarDag.length; i++) {
			System.out.println(String.format("Gjennomsnittstemperaturen for %d. januar er %d grader.", i + 1, januarDag[i]));
		}
		
		// Henter gjennomsnittstemperatur for alle timer i måneden
		for (int i = 0; i < januarTime.length; i++) {
			System.out.println(String.format("Gjennomsnittstemperaturen for kl. %d denne måneden er %d grader.", i + 1, januarTime[i]));
		}
		
		// Henter gjennomsnittstemperatur for måneden
		System.out.println(String.format("Gennomsnittstemperaturen for januar er %d grader.", januar.getTempManed()));
		
		// Skriver ut hvor mange døgn som ligger i ulike kategorier (0 - 4)
		for (int i = 0; i < januarKategori.length; i++) {
			System.out.println(String.format("Antall dager gjennomsnittstemperaturen lå i kategori %d i januar er %d dager.", i + 1, januarKategori[i]));
		}
	}
}