package pt.and.codewars;

public class BitCounting {

	public static int countBits(int n){
		// Show me the code!
		String binary = "";
		while (n != 0) {
			binary += (n % 2 == 0) ? "0" : "1";
			n = n / 2;
		}
		return binary.length() - binary.replace("1", "").length();
	}

}
