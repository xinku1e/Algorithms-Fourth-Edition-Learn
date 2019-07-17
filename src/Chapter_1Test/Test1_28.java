package Chapter_1Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1_28 {
	// 删除重复元素
	public static int[] distinct(int [] a) {
		Arrays.sort(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) b.add(a[i]);
			else if(a[i] == a[i-1]) continue;
			else b.add(a[i]);		
		}
		int c[] = new int [b.size()];
		for(int i = 0; i<b.size(); i++) {
			c[i] = b.get(i);
		}
		return c;
	}

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
		int a[] = {1,1,2,3,4,6,1,2,44,5,7,5};
		int b[] = distinct(a);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
//		int key = 5;
//		if(rank(key,b) == -1)
//			System.out.println("没找到");
//		else 
//			System.out.println("yes");
	}


}
