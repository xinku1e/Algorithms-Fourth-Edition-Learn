package Chapter_1;

import edu.princeton.cs.algs4.In;


public class ReadIntsWithQueue {
	
	public static int[] readInts(String name) {
		In in = new In(name);
		Queue<Integer>  queue = new Queue<Integer>();
		while(!in.isEmpty()) {
			queue.enqueue(in.readInt());
		}
		int N = queue.size();
		int[] a = new int [N];
		for(int i = 0; i < N; i++)
			a[i] = queue.dequeue();
		return a;
	}

	public static void main(String[] args) {
		int i[] = readInts(args[0]);
		for(int j : i)
			System.out.print(j+" ");
	}

}
