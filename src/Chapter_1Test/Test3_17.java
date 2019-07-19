package Chapter_1Test;

import Chapter_1.Date;
import Chapter_1.Queue;
import Chapter_1.Transcation;
import edu.princeton.cs.algs4.In;

public class Test3_17 {
	
	public static Transcation[] readTranscation(String name) {
		In in = new In(name);
		Queue<Transcation> q = new Queue<Transcation>();
		while(!in.isEmpty()) {
			Transcation t = new Transcation(in.readString());
			q.enqueue(t);
		}
		int N = q.size();
		Transcation[] trans = new Transcation[N];
		for(int i = 0; i < N; i++) {
			trans[i] = q.dequeue();
		}
		return trans;
			
	}
	
	public static void main(String[] args) {
		Transcation[] trans = readTranscation(args[0]);
		for(int i = 0; i < trans.length; i++) {
			System.out.println(trans[i].toString());
		}
	}

}
