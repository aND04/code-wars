package pt.and.codewars;

public class JadenCase {

	public static String toJadenCase(String phrase) {
		// TODO put your code below this comment
		String result = "";
		if (phrase == null || phrase == "")
			result = null;
		else {
			for (String word : phrase.split(" ")) {
				result += word.replace(word, word.substring(0, 1).toUpperCase() + word.substring(1)) + " ";
			}
			result = result.substring(0, result.length() -1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.err.println(toJadenCase("most trees are blue"));
	}

}
