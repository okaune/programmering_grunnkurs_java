import java.util.*;

class ArbTaker {
	private final Person personalia;
	private final int arbtakernr;
	private final int ansettelsesår;
	private int månedslønn;
	private int skatteprosent;
	
	public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, int månedslønn, int skatteprosent) {
		this.personalia = personalia;
		this.arbtakernr = arbtakernr;
		this.ansettelsesår = ansettelsesår;
		this.månedslønn = månedslønn;
		this.skatteprosent = skatteprosent;
	}
	
	public Person getPersonalia() {
		return personalia;
	}
	
	public int getArbtakernr() {
		return arbtakernr;
	}
	
	public int getAnsettelsesår() {
		return ansettelsesår;
	}
	
	public int getMånedslønn() {
		return månedslønn;
	}
	
	public void setMånedslønn(int månedslønn) {
		this.månedslønn = månedslønn;
	}
	
	public int getSkatteprosent() {
		return skatteprosent;
	}
	
	public void setSkatteprosent(int skatteprosent) {
		this.skatteprosent = skatteprosent;
	}
	
	public int skattetrekk() {
		return (månedslønn * (skatteprosent / 100));
	}
	
	public int bruttolønnÅr() {
		return månedslønn * 12;
	}
	
	public int skattetrekkÅr() {
		return skattetrekk() * 10.5;
	}
	
	public String fulltNavn() {
		return personalia.getEtternavn() + ", " + personalia.getFornavn();
	}
	
	public int alder() {
		return Calendar.getInstance().get(Calendar.YEAR) - personalia.getFødselsår();
	}
	
	public int ansattÅr() {
		return Calendar.getInstance().get(Calendar.YEAR) - ansettelsesår;
	}
	
	public boolean ansattMerEnn(int antÅr) {
		if (ansattÅr() > antÅr) {
			return true;
		} else {
			return false;
		}
	}
	
}