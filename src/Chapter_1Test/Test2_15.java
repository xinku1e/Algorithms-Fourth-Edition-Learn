package Chapter_1Test;

import edu.princeton.cs.algs4.In;

public class Test2_15 {
	
	public static int [] readInts(String name) {
		In in = new In(name);
		String input = in.readAll();
		String[] words = input.split("\\s+");
		int[] ints = new int[words.length];
		for(int i = 0; i < words.length; i++)
			ints[i] = Integer.parseInt(words[i]);
		return ints;
	}
	
	public static void main(String[] args) {

		int[] i = readInts(args[0]);
		for(int t = 0; t < i.length; t++)
			System.out.print(i[t]+" ");
	}

}
