class Tekstanalyse {
	private String originalString = "";
	private String string = "";
	private int[] antallTegn = new int[30];
	
	// Constructors
	public Tekstanalyse() {
		
	}
	
	public Tekstanalyse(String string) {
		originalString = string;
		this.string = string.toLowerCase();
	}
	
	// Set string
	public void setString(String string) {
		originalString = string;
		this.string = string.toLowerCase();
	}
	
	// Get string
	public String getString() {
		return originalString;
	}
	
	// Adds each char in the string to the right place in the array
	public void addToArray() {
		for (int i = 0; i < string.length(); i++) {
			char tegn = string.charAt(i);
			antallTegn[charToArrayNum(tegn)] += 1;
		}
	}
	
	// Converts char value to array number
	public int charToArrayNum(char c) {
		int verdi = c; // char til int
		int plass;
		if (verdi >= 97 && verdi <= 122) {
			plass = verdi - 97;
		} else if (verdi == 230) { // æ
			plass = 26;
		} else if (verdi == 248) { // ø
			plass = 27;
		} else if (verdi == 229) { // å
			plass = 28;
		} else {
			plass = 29;
		}
		return plass;
	}
	
	// Converts array number to char
	public String arrayNumToChar(int i) {
		String c = "";
		if (i >= 0 && i <= 25) {
			c += (char) (i + 97);
		} else if (i == 26) {
			c += "æ"; 
		} else if (i == 27) {
			c += "ø";
		} else if (i == 28) {
			c += "å";
		} else {
			c += "symbol(er)";
		}
		return c;
	}
	
	// Checks the total number of characters in the array
	public int totalChars() {
		int counter = 0;
		for (int i = 0; i < antallTegn.length - 1; i++) {
			counter += antallTegn[i];
		}
		return counter;
	}
	
	// Checks how many unique chars there are in the input, not counting symbols.
	public int uniqueChars() {
		int counter = 0;
		for (int i = 0; i < antallTegn.length - 1; i++) {
			if (antallTegn[i] != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	// Checks which char occurs the most
	public String mostOccuringLetter() {
		String letter = "";
		int num = 0;
		for (int i = 0; i < antallTegn.length - 1; i++) {
			if (antallTegn[i] > num) {
				num = antallTegn[i];
				letter = arrayNumToChar(i);
			} else if (antallTegn[i] == num) {
				letter += arrayNumToChar(i);
			}
		}
		return "Bokstav(er) som forekommer oftest er: " + letter + " med " + num + " gang(er).";
	}
	
	// Outputs how many of each number there are in the array
	public String outputArray() {
		String outputString = "";
		for (int i = 0; i < antallTegn.length; i++) {
			outputString += arrayNumToChar(i) + ": " + antallTegn[i] + "\n";
		}
		return outputString;
	}
	
	// Displays the unicode value of each char in the string
	public String returnValue() {
		String outputString = "";
		for (int i = 0; i < string.length(); i++) {
			char tegn = string.charAt(i);
			int verdi = tegn; // char til int
			outputString += "Tegn: " + tegn + ", Unicode-verdi: " + verdi + "\n";
		}
		return outputString;
	}
	
	public String notLetters() {
		int letters = 0;
		int percent = 100;
		int notLetters = antallTegn[29];
		for (int i = 0; i < antallTegn.length - 1; i++) {
			letters += antallTegn[i];
		}
		if (letters != 0) {
			percent = (notLetters * 100) / (letters + notLetters);
		}
		return percent + "%";
	}
	
}