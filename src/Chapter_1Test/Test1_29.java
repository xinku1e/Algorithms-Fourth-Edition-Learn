package Chapter_1Test;

import java.util.Arrays;

public class Test1_29 {
	//等值键
	
	public static int BinarySearch(int key, int[] a)
    {
		
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]) hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }
	
	public static int rank(int key, int[] a) {
		
		int mid = BinarySearch(key,a);
		int m = mid;
		while(a[mid] == a[m]) {
			m--;
		}
		
		return m+1;
		
	}
		
	
	public static int count(int key, int[] a) {
		int mid = BinarySearch(key,a);
		int m = mid;
		while(a[mid] == a[m]) {
			m--;
		}
		int n = mid;
		while(a[mid] == a[n]) {
			n++;
		}
		return mid-m+n-mid-1;
		
	}

	public static void main(String[] args) {
		int[] a = {7,2,3,3,4,8,6,3,2,10,4,3,5,1,2};
		int key = 3;
		Arrays.sort(a);
		
		for(int i = 0; i< a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();

		if(BinarySearch(key,a) == -1) System.out.println("元素不在数组中");
		else {
			int i = rank(key,a);
			int j = count(key,a);
			System.out.println(i);
			 System.out.println(j);
			Arrays.sort(a);
			for(int t = i; t< i+j; t++)
				System.out.print(a[t]+" ");
		}
		
	}
}
