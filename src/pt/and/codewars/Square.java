package pt.and.codewars;

public class Square {
	public static boolean isSquare(int n) {
		double root = Math.pow(n, 0.5);
		return root == (int)root; // fix me!
	}
}
