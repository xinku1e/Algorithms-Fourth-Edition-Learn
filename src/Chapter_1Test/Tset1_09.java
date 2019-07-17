package Chapter_1Test;

import edu.princeton.cs.algs4.StdIn;

public class Tset1_09 {

	public static void main(String[] args) {
/*		int N = 100;
		ArrayList<Integer> b = new ArrayList<Integer>();
		int quotien = N;
		int remainder = 0;
		int t = 0;
		while(quotien != 0) {
			 t = quotien;
			quotien = quotien/2;
			remainder = t%2;
			b.add(remainder);			
		}
		String end = b.toString();
		
		
		System.out.println(end);
	*/
		int N = StdIn.readInt();
		String s = "";
		for(int i = N; i>0; i /= 2)
			s = (i%2) +s;
		System.out.println(s);
		
	}
	

}
