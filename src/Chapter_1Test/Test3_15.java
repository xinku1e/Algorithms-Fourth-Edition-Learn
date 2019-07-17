package Chapter_1Test;

import Chapter_1.Queue;

public class Test3_15 {
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.enqueue("4");
		q.enqueue("5");
		q.enqueue("6");
		int k = 3;
		int N = q.size();
		for(int i = 0; i < N - k ; i++) 
			q.dequeue();
		System.out.println(q.dequeue());
	}

}
