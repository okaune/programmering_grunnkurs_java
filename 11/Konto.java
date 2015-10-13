import java.util.*;
import java.io.*;

class Konto {
	private final int startSaldo;
	private final String filename;
	
	public Konto(int startSaldo, String filename) {
		this.startSaldo = startSaldo;
		this.filename = filename;
	}
	
	public int getStartSaldo() {
		return startSaldo;
	}
	
	public int getSaldo() throws IOException {
		int saldo = startSaldo;
		String file = readFile();
		String val;
		String[] transaksjoner = file.split("\n");
		for(int i = 0; i < transaksjoner.length; i++) {
			StringTokenizer transaksjon = new StringTokenizer(transaksjoner[i], " ");
			while(transaksjon.hasMoreTokens()) {
				val = transaksjon.nextToken();
				if(val.equals("U")) {
					saldo -= Integer.parseInt(transaksjon.nextToken());
				} else if (val.equals("I")) {
					saldo += Integer.parseInt(transaksjon.nextToken());
				} else {
					System.out.println("Noe er feil?");
				}
			}
		}
		return saldo;
	}
	
	public String readFile() throws IOException {
		BufferedReader file = new BufferedReader(new FileReader(filename));
		
		String output = "";
		String readLine = file.readLine();
		while(readLine != null) {
			output += readLine + "\n";
			readLine = file.readLine();
		}
		file.close();
		
		return output;
	}
	
	public void writeFile(String input, boolean append) throws IOException {
		FileWriter prepFile = new FileWriter(filename, append);
		PrintWriter write = new PrintWriter(new BufferedWriter(prepFile));
		write.println(input);
		write.close();
	}
}