package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {
	public static void main(String[] args) {
		//��ӡN����lo��hi��֮�������
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
