package Chapter_1;

import java.util.Arrays;

public class StaticSETofInts {
	private int [] a;
	
	public StaticSETofInts(int [] keys) {
		a = new int[keys.length];
		for(int i = 0; i < keys.length; i++)
			a[i] = keys[i];
		Arrays.sort(a);
	}
	
	public boolean contains(int key) {
		return BinarySearch(key) != -1;
	}
	
	public int BinarySearch(int key) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			int mid = (hi - lo)/2 + lo;
			if(key < a[mid])	hi = mid-1;   	
			else if (key > a[mid])	lo = mid+1;
			else return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int [] a = {1,23,4,56,7,4,5,6,7};
		int key = 5;
		StaticSETofInts set = new StaticSETofInts(a);
		if(set.contains(key))	System.out.println("YES");
		else	System.out.println("NO");
		
	}
}
