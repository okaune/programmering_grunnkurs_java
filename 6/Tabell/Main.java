import java.util.*;

class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] antall = new int[10];
		int tall;
		
		for(int i = 0; i < 1000; i++) {
			tall = random.nextInt(10);
			antall[tall] += 1;
		}
		
		for (int j = 0; j < antall.length; j++) {
			String stjerner = "";
			double num = antall[j];
			double numStjerner = Math.round(num/10);
			for (int k = 0; k < numStjerner; k++) {
				stjerner += "*";
			}
			System.out.println("Antall " + j + ": " + antall[j] + " " + stjerner);
		}
	}
}