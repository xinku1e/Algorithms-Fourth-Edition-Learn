package Chapter_1Test;

import java.util.Arrays;

public class Test1_22 {
	
	public static int rank(int key, int [] a) {
		return rank(key,a, 0, a.length-1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi) {
		if(lo > hi) return -1;
		System.out.println(lo+" "+hi);
		int mid =lo + (hi - lo)/2;
		if(key < a[mid])	return rank(key, a, lo, mid-1);
		else if (key > a[mid])	return rank(key, a, mid+1, hi);
		else return mid;
	}
	
	public static void main(String[] args) {
		int a[] = {12,32,34,4,54,5,3,2,3,4,65,574,76,67,87,98,90,87,56,45,345,234,234,234,234,2374,};
		Arrays.sort(a);
		int key = 88979;
		if(rank(key,a) == -1)
			System.out.println("Ã»ÕÒµ½");
		else 
			System.out.println("yes");
	}

}
