package Chapter_1;

import edu.princeton.cs.algs4.StdOut;


public class test {

	public static void main(String[] args) {
		int n = 50;

		Stack<Integer> stack = new Stack<Integer>();
		while (n > 0) {
		    stack.push(n % 2);
		    n = n / 2;
		}

		for (int digit : stack) {
		    StdOut.print(digit);
		}

		StdOut.println();
		
	}

}
