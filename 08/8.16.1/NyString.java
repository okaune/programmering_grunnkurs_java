class NyString {
	private final String string;
	
	public NyString(String string) {
		this.string = string;
	}
	
	String getString() {
		return string;
	}
	
	String[] getWords() {
		String[] ord = string.split(" ");
		return ord;
	}
	
	String shortWord() {
		String[] ord = getWords();
		String shortWord = "";
		for (int i = 0; i < ord.length; i++) {
			shortWord += ord[i].charAt(0);
		}
		return shortWord;
	}
	
	String removeLetter(String letter) {
		String newString = string.replace(letter, "");
		return newString;
	}
	
}