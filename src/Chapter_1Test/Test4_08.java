package Chapter_1Test;

import java.util.Arrays;

import Chapter_1.BinarySearch;


public class Test4_08 {
	
	public static int TwoSum(int[] a) {
		int cnt = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++){
				if(BinarySearch.rank(-a[i],a) > 0 )
					cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 2 , -1, -2};
		System.out.println(TwoSum(a));
	}


}
