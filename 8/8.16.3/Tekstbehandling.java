import java.util.*;

class Tekstbehandling {
	private String string;
	private String[] words;
	
	public Tekstbehandling(String string) {
		this.string = string;
	}
	
	public String getString() {
		return string;
	}
	
	public String getUpperCase() {
		return string.toUpperCase();
	}
	
	public int getWordCount() {
		words = string.split(" ");
		return words.length;
	}
	
	public int getAverageWordLength() {
		StringTokenizer analyse = new StringTokenizer(string, ",.!?;: ");
		int averageLength = 0;
		while (analyse.hasMoreTokens()) {
			averageLength += analyse.nextToken().length();
		}
		averageLength = averageLength / getWordCount();
		return averageLength;
	}
	
	public int getAverageWordCount() {
		StringTokenizer analyse = new StringTokenizer(string, ".!:?");
		int averageWordCount = 0;
		int period = 0;
		while (analyse.hasMoreTokens()) {
			averageWordCount += analyse.nextToken().split(" ").length;
			period++;
		}
		averageWordCount /= period;
		return averageWordCount;
	}
	
	public String findAndReplace(String find, String change) {
		return string.replace(find, change);
	}
}