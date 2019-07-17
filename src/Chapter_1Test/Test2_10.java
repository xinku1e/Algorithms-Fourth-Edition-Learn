package Chapter_1Test;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

class VisualCounter{
	private int N;
	int count = 0;
	
	public VisualCounter(int N, int max) {
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, max);
		StdDraw.setPenRadius(.008);
	}
	
	public void increment() {
		N++;
		count++;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, count);
	}
	
	public void reduce() {
		N++;
		count--;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, count);
	}
}
public class Test2_10 {
	public static void main(String[] args) {
		int T = 1000;
		VisualCounter vc = new VisualCounter(T,100);
		for(int i = 0; i < T; T++) {
			if(StdRandom.bernoulli(0.55)) vc.increment();
			else vc.reduce();
		}
		
	}

}
