import java.io.*;
import static javax.swing.JOptionPane.*;

class Main {
	public static void main(String[] args) throws IOException {
		Konto konto = new Konto(3000, "saldo.txt");
		Object[] options = {"Innskudd", "Uttak"};
		String input,
		transaksjoner = "";
		int val;
		
		do {
			if (!konto.getTransaksjoner(1).equals("\n")) {
				transaksjoner = "\n\nSiste transaksjoner:\n" + konto.getTransaksjoner(5);
			}
			
			val = showOptionDialog(null,
	                               "Kontobalanse: " + konto.getSaldo() + transaksjoner,
	                               "Transaksjon",
	                               YES_NO_OPTION,
	                               INFORMATION_MESSAGE,
	                               null,
	                               options,
	                               null);
			
			switch (val) {
				case 0:
					input = "I " + Integer.parseInt(showInputDialog("Hvor mye vil du sette inn?"));
					konto.writeFile(input, true);
					break;
				case 1:
					int uttak = Integer.parseInt(showInputDialog("Hvor mye vil du ta ut?"));
					if (konto.getSaldo() - uttak >= 0) {
						input = "U " + uttak;
						konto.writeFile(input, true);
					} else {
						showMessageDialog(null, "Kan ikke overtrekke konto!");
						//konto.writeFile("", false);
					}
					break;
				default:
					System.out.println("Program avsluttet!");
					break;
			}
			
		} while (val != -1);
			
	}
	
}