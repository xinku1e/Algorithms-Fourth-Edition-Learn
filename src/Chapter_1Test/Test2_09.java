package Chapter_1Test;

import Chapter_1.Counter;

public class Test2_09 {
	
	 public static int rank(int key, int[] a,Counter c)
	    {
	        int lo = 0;
	        int hi = a.length - 1;
	        while(lo <= hi) {
	        	c.increment();
	            int mid = lo + (hi - lo) / 2;
	            if(key < a[mid]) hi = mid - 1;
	            else if(key > a[mid]) lo = mid + 1;
	            else return mid;
	        }

	        return -1;
	    }
	 public static void main(String[] args) {
		 int[] a = {1,2,21,3,4,5,65,76,87,98,45,65,76};
		Counter c = new Counter("binary search");
		rank(1,a,c);
		System.out.println(c);
		
	}

}
