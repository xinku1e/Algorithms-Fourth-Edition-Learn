package Chapter_1Test;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class Test1_23 {
	
	public static int rank(int key, int [] a) {
		return rank(key,a, 0, a.length-1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi) {
		if(lo > hi) return -1;
		//System.out.println(lo+" "+hi);
		int mid =lo + (hi - lo)/2;
		if(key < a[mid])	return rank(key, a, lo, mid-1);
		else if (key > a[mid])	return rank(key, a, mid+1, hi);
		else return mid;
	}
	
	public static void main(String[] args) {
		
		
		char m = '-';
		@SuppressWarnings("deprecation")
		int a[] = In.readInts(args[0]);
		Arrays.sort(a);
		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if(m == '+' && rank(key,a) == -1)
				System.out.println(key);
			if(m == '-' && rank(key,a) !=-1)
				System.out.println(key);
		}
	}		

}
