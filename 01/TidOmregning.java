import static javax.swing.JOptionPane.*;

class TidOmregning {
	public static void main(String[] args) {

		// Definerer navnevariabler for bruk i utskrift av svaret
		String hourText;
		String minText;
		String secText;

		// Bruker input (antall sekunder)
		String inputSec = showInputDialog("Antall sekunder:");

		// Konvertering fra String til double
		int sec = Integer.parseInt(inputSec);
		int secStart = sec;

		// Utregning
		int hour = sec / 3600; // Finner antall timer
		sec = sec % 3600; // Finner resten etter å ha regnet ut timer
		int min = sec / 60; // Finner antall minutter
		sec = sec % 60; // Finner resten etter å ha regnet ut minutter (resterende sekuner)

		// Sjekker entall eller flertall i benevning
		hourText = (hour == 1) ? " time " : " timer ";
		minText = (min == 1) ? " minutt " : " minutter ";
		secText = (sec == 1) ? " sekund" : " sekunder";

		// Vis resultat
		showMessageDialog(null, secStart
								+ " sekunder = "
								+ hour
								+ hourText
								+ min
								+ minText
								+ sec
								+ secText);
	}
}
