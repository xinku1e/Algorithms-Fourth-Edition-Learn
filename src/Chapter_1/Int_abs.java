package Chapter_1;

import edu.princeton.cs.algs4.StdIn;

public class Int_abs {
	
	public static int abs(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}

	public static void main(String[] args) {
		int a = StdIn.readInt();
		System.out.println(abs(a));

	}

}
