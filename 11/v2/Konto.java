import java.util.*;
import java.io.*;

class Konto {
	private final String transaksjonerFile;
	private final String saldoFile;
	
	public Konto(int startSaldo, String transaksjoner, String saldo) {
		transaksjonerFile = transaksjoner;
		saldoFile = saldo;
		try {
			BufferedReader br = new BufferedReader(new FileReader(saldoFile));
			if (br.readLine() == null) {
				setSaldo(startSaldo);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public int getSaldo() throws IOException {
		int saldoVal = Integer.parseInt(readFile(saldoFile));
		return saldoVal;
	}
	
	public void setSaldo(int saldo) throws IOException {
		writeFile("" + saldo, saldoFile, false);
	}
	
	public String getTransaksjoner() throws IOException {
		String output = "";
		String fileLines[] = readFile(transaksjonerFile).split("\n");
		for(int i = fileLines.length - 1; i >= 0; i--) {
			output += fileLines[i] + "\n";
		}
		return output;
	}
	
	public int getTransaksjonerValue() throws IOException {
		int verdi = 0;
		String file = readFile(transaksjonerFile);
		String val;
		String[] transaksjoner = file.split("\n");
		for(int i = 0; i < transaksjoner.length; i++) {
			StringTokenizer transaksjon = new StringTokenizer(transaksjoner[i], " ");
			while(transaksjon.hasMoreTokens()) {
				val = transaksjon.nextToken();
				if(val.equals("U")) {
					verdi -= Integer.parseInt(transaksjon.nextToken());
				} else if (val.equals("I")) {
					verdi += Integer.parseInt(transaksjon.nextToken());
				} else {
					System.out.println("Noe er feil?");
				}
			}
		}
		return verdi;
	}
	
	public String readFile(String filename) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader(filename));
		
		String output = "";
		String readLine = file.readLine();
		while(readLine != null) {
			output += readLine;
			readLine = file.readLine();
			if (readLine != null) {
				output += "\n";
			}
		}
		file.close();
		
		return output;
	}
	
	public void writeFile(String input, String filename, boolean append) throws IOException {
		FileWriter prepFile = new FileWriter(filename, append);
		PrintWriter write = new PrintWriter(new BufferedWriter(prepFile));
		write.println(input);
		write.close();
	}
}