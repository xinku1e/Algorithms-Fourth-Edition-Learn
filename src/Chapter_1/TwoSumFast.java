package Chapter_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class TwoSumFast {
	
	public static int count(int[] a) {
		Arrays.sort(a);
		int N = a.length;
		int cnt = 0;
		for(int i = 0; i < N; i++) 
			if(BinarySearch.rank(-a[i], a) > i ) cnt ++;
		
		
		return cnt;
	}

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int[] a = In.readInts(args[0]);
		//int[] a = {1,-1,2,4,-2};
		//System.out.println(count(a));
		Stopwatch timer = new Stopwatch();
		int cnt = count(a);
		double time = timer.elapsedTime();
		System.out.println(cnt + " triples\n" + time + " seconds");
	}
}
