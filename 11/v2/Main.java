import java.io.*;
import static javax.swing.JOptionPane.*;
import java.util.regex.*;

class Main {
	public static void main(String[] args) throws IOException {
		String transaksjonerFile = "transaksjoner.txt";
		String saldoFile = "saldo.txt";
		Konto konto = new Konto(3000, transaksjonerFile, saldoFile);
		Object[] options = {"Innskudd", "Uttak", "Utfør"};
		String input,
		transaksjoner = "";
		int val;
		
		BufferedReader br = new BufferedReader(new FileReader(transaksjonerFile));     
		do {
			transaksjoner = "\n\nTransaksjoner:\n" + konto.getTransaksjoner();
			
			val = showOptionDialog(null,
	                               "Kontobalanse: " + konto.getSaldo() + transaksjoner,
	                               "Transaksjon",
	                               YES_NO_CANCEL_OPTION,
	                               INFORMATION_MESSAGE,
	                               null,
	                               options,
	                               null);
			
			switch (val) {
				case 0:
					input = "I " + Integer.parseInt(showInputDialog("Hvor mye vil du sette inn?"));
					konto.writeFile(input, transaksjonerFile, true);
					break;
				case 1:
					input = "U " + Integer.parseInt(showInputDialog("Hvor mye vil du ta ut?"));
					konto.writeFile(input, transaksjonerFile, true);
					break;
				case 2:
					if (!(konto.getSaldo() + konto.getTransaksjonerValue() < 0)) {
						konto.setSaldo(konto.getSaldo() + konto.getTransaksjonerValue());
					}
					konto.writeFile("", transaksjonerFile, false);
					break;
				default:
					System.out.println("Program avsluttet!");
					break;
			}
			
		} while (val != -1);
			
	}
	
}