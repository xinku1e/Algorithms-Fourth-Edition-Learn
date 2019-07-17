package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Accmulator {
	
	private double total = 0;
	private int N = 0;
	public void addDataValue(double val) {
		total += val;
		N++;
	}
	
	public double mean() {
		return total/N;
	}
	
	public String toString() {
		return "mean("+N+" values"+") :"+String.format("%7.5f", mean());
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int T = StdIn.readInt();
		Accmulator a = new Accmulator();
		for(int i = 0; i < T; i++) {
			a.addDataValue(StdRandom.random());
		}
		System.out.println(a);
	}
}
