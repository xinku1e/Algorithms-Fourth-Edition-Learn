package Chapter_1Test;

import Chapter_1.Queue;

/*
 * ∏¥÷∆∂”¡–
 */
public class Test3_41 {
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		Queue<String> r = new Queue<String>(q);
		for(String s : q)
			System.out.print(s + " ");
		System.out.println(q.size());
		for(String s : r)
			System.out.print(s + " ");
		System.out.println(r.size());
		 
	}
}
