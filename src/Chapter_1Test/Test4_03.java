package Chapter_1Test;

import Chapter_1.ThreeSum;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Test4_03 {

    public static double timeTrial(int N) { // Time ThreeSum2.count() for N
                                            // random 6-digit ints.
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(-MAX, MAX);
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }
    
    public static void drawStandard(int[] n, double[] time,int length) {
    	StdDraw.setXscale(-0.5, n[length-1]);
        StdDraw.setYscale(-0.5, time[length-1]*1000);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.010);
        for(int i =0; i < length; i++) {
        	StdDraw.point(n[i], time[i]*1000);
        }
        
    }

 

    public static void main(String[] args) {
        int MAX = 2000;
        int i = 0;
        
        int[] arrN = new int[1000];
        double[] timeN = new double[1000];
        for (int N = 0; N <= MAX; N = N+10) {
            double time = timeTrial(N);
            StdOut.printf("%7d %5.7f\n", N, time);
            arrN[i] = N;
            timeN[i++] = time;
        }
        drawStandard(arrN, timeN, i);
   
       
    }
}