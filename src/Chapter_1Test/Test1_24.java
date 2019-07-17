package Chapter_1Test;

import edu.princeton.cs.algs4.StdIn;

public class Test1_24 {

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;
		System.out.println(a + " " + b);
		return getGCD(b, a % b);
	}

	public static void main(String[] args) {
		int m = StdIn.readInt();
		int n = StdIn.readInt();
		System.out.println(getGCD(m, n));
	}
}
