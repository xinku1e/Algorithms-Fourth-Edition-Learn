package Chapter_1Test;

import edu.princeton.cs.algs4.StdIn;

public class Test1_05 {
	public static void main(String[] args) {
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
//		if(x <= 1.0 && x >= 0.0 && y >= 0.0 && x <= 1.0)
//			System.out.println(true);
//		else
//			System.out.println(false);
		System.out.println(x <= 1.0 && x >= 0.0 && y >= 0.0 && x <= 1.0);
	}

}
