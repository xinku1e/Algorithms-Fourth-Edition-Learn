package Chapter_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSum {
	
	public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
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
