package Chapter_1Test;

import Chapter_1.Queue;
import Chapter_1.Stack;

public class Test3_47 {
	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<String>();
		s1.push("a");
		s1.push("b");
		Stack<String> s2 = new Stack<String>();
		s1.push("c");
		s1.push("d");
		for(String s : s1.catenation(s1, s2))
			System.out.print(s + " ");
		System.out.println();
		
		Queue<String> q1 = new Queue<String>();
		q1.enqueue("a");
		q1.enqueue("b");
		Queue<String> q2 = new Queue<String>();
		q1.enqueue("c");
		q1.enqueue("d");
		for(String s : q1.catenation(q1, q2))
			System.out.print(s + " ");
		System.out.println();
		
		Steque<String> sq1 = new Steque<String>();
		sq1.enqueue("a");
		sq1.enqueue("b");
		Steque<String> sq2 = new Steque<String>();
		sq1.enqueue("c");
		sq1.enqueue("d");
		for(String s : sq1.catenation(sq1, sq2))
			System.out.print(s + " ");
		System.out.println();
		
	}

}
