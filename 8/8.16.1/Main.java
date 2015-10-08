class Main {
	public static void main(String[] args) {
		NyString string = new NyString("Dette er en test!");
		System.out.println(string.shortWord());
		System.out.println(string.removeLetter("e"));
	}
}