package Chapter_1;

import java.util.Arrays;

public class Array_copy {
	public static void main(String[] args) {
		int[] a = {1, 3, 45, 5, 6, 634, 33, 12};
		int N = a.length;
		int[] b = new int[N];
		
		for(int i = 0; i<N; i++)
		{
			b[i] = a[i];
		}
		
		System.out.println("数组a： "+Arrays.toString(a));
		System.out.println("数组b： "+Arrays.toString(b));
	}
	

}
