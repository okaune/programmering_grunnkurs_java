import java.util.Random;

class MinRandom {
	
	Random random = new Random();
	
	public int nesteHeltall(int nedre, int ovre) {
		ovre -= nedre;
		return random.nextInt(ovre) + nedre;
	}
	
	public double nesteDesimaltall(double nedre, double ovre) {
		ovre -= nedre;
		return random.nextDouble() * ovre + nedre;
	}
}