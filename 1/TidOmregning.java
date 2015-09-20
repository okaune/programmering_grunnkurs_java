import static javax.swing.JOptionPane.*;

class TidOmregning {
	public static void main(String[] args) {
		
		// Definerer navnevariabler
		String hourText;
		String minText;
		String secText;
		
		// Bruker input
		String inputSec = showInputDialog("Antall sekunder:");
		
		// Omregning til double
		int sec = Integer.parseInt(inputSec);
		int secSave = sec;
		
		// Utregning
		int hour = sec / 3600;
		sec = sec % 3600;
		int min = sec / 60;
		sec = sec % 60;
		
		// Sjekker entall eller flertall i benevning
		hourText = (hour == 1) ? " time " : " timer ";
		minText = (min == 1) ? " minutt " : " minutter ";
		secText = (sec == 1) ? " sekund" : " sekunder";
		
		// Vis resultat
		showMessageDialog(null, secSave
								+ " sekunder = "
								+ hour
								+ hourText
								+ min
								+ minText
								+ sec
								+ secText);
	}
}