class Main {
	public static void main(String[] args) {
		Tekstbehandling test = new Tekstbehandling("Jeg er en liten tullepike. En skikkelig tøs!");
		System.out.println("Gjennomsnittslengde på ord: " + test.getAverageWordLength());
		System.out.println("Gjennomsnittlig antall ord periode: " + test.getAverageWordCount());
		System.out.println("Antall ord: " + test.getWordCount());
		System.out.println(test.findAndReplace("tøs", "engel"));
		System.out.println(test.getString());
		System.out.println(test.getUpperCase());
	}
}