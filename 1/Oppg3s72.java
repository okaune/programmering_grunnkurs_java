// Oppgave for å øve på regneoperasjoner og bruk av %

class Oppg3s72 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 3;
		int d = 2;
		double p = 2.8;
		double q = 3.3;

		System.out.println("a) " + c + d * a);
		System.out.println("b) " + a * b / c + a);
		System.out.println("c) " + c % d);
		System.out.println("d) " + d % c);
		System.out.println("e) " + p % q);
		System.out.println("f) " + q % p);
		System.out.println("g) " + c % d % a + b / c);
	}
}
