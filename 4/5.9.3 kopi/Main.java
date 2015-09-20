import java.util.*;
import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) {
		ArrayList<Spiller> spillere = new ArrayList<Spiller>();
		boolean newPlayer = true;
		
		do {
			String playerName = showInputDialog("Skriv inn navnet på neste spiller." + "\n" + "Skriv 'exit' når alle spillere er lagt til.");
			
			if (playerName.equals("exit")) {
				newPlayer = false;
			} else {
				Spiller nySpiller = new Spiller(playerName);
				spillere.add(nySpiller);
				nySpiller.setName(playerName); // Fungerer ikke
			}
		} while (newPlayer);
		
		
	}
}