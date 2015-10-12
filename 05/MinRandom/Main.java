class Main {
	public static void main(String[] args) {
		MinRandom random = new MinRandom();
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nesteHeltall(3, 8));
			System.out.println(String.format("%.2f", random.nesteDesimaltall(3.8, 10.25)));
		}
	}
}