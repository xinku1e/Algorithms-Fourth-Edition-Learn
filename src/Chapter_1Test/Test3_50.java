package Chapter_1Test;

import java.util.Iterator;

import Chapter_1.Stack;

public class Test3_50 {
	public static void main(String[] args) {
		
	Stack<String> stack= new Stack<String>();
	stack.push("a");
	stack.push("b");
	stack.push("c");
	Iterator<String> itor = stack.iterator();
	stack.pop();
	System.out.println(itor.next());
	System.out.println(itor.next());
	System.out.println(itor.next());
	
	
	}
}
