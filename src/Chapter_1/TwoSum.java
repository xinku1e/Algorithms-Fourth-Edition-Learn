package Chapter_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class TwoSum {
	
	public static int count(int[] a) {
		int cnt = 0;
		int N = a.length;
		for(int i = 0; i < N; i++) 
			for(int j = i+1; j < N; j++)
				if(a[i] + a[j] == 0) cnt ++;
		
		
		return cnt;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int[] a = In.readInts(args[0]);
		//int[] a = {1,-1,2,4,-2,-4,9};
		//System.out.println(count(a));
		Stopwatch timer = new Stopwatch();
		int cnt = count(a);
		double time = timer.elapsedTime();
		System.out.println(cnt + " triples\n" + time + " seconds");
		
	}

}
