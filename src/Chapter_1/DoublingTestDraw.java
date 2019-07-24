package Chapter_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class DoublingTestDraw {
	
	public static double timeTrial(int N) {
		int MAX = 10000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		Stopwatch timer = new Stopwatch();
		int cnt = ThreeSumFast.count(a);
		return timer.elapsedTime();
	}
	
	public static void main(String[] args) {
		
		StdDraw.setXscale(0, 1000000);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(.015);
		
		for (int N = 250; true; N += N) {
			double time = timeTrial(N);
			
			StdDraw.setPenColor(StdDraw.DARK_GRAY);
			StdDraw.point(N, time);
			
			System.out.printf("%7d %5.1f\n", N, time);
		}
	}

}
