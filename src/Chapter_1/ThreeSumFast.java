package Chapter_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSumFast {
	
	public static int count(int[] a) {
		int N = a.length;
		int cnt = 0;
		Arrays.sort(a);
		for(int i = 0; i < N; i++)
			for(int j = i+1; j < N; j++)
				if(BinarySearch.rank(-(a[i] + a[j]), a) > j) cnt++;
		return cnt;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int[] a = In.readInts(args[0]);
		//System.out.println(count(a));
		Stopwatch timer = new Stopwatch();
		int cnt = count(a);
		double time = timer.elapsedTime();
		System.out.println(cnt + " triples\n" + time + " seconds");
		
	}

}
