package Chapter_1Test;

import Chapter_1.Stack;

public class Test3_42 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		Stack<String> t = new Stack<String>(s);
		for(String x : s)
			System.out.print(x + " ");
		System.out.println(s.size());
		for(String x : t)
			System.out.print(x + " ");
		System.out.println(t.size());
	}

}
