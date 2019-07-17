package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {
	public static void main(String[] args) {
		//打印N个（lo，hi）之间的整数
		int N = StdIn.readInt();
		double lo = StdIn.readDouble();
		double hi = StdIn.readDouble();
		for(int i = 0; i < N; i++)
		{
			double x = StdRandom.uniform(lo,hi);
			System.out.printf("%.2f\n",x);
		}
	}

}
