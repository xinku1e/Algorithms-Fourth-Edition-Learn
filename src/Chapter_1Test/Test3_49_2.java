package Chapter_1Test;

import Chapter_1.Stack;
import edu.princeton.cs.algs4.Stopwatch;

class StackQueue2<Item>{
	private Stack<Item> s1 = new Stack<Item>();
	private Stack<Item> s2 = new Stack<Item>();
	private Stack<Item> s3 = new Stack<Item>();
	private Stack<Item> s4 = new Stack<Item>();
	
	public void enqueue(Item item)	{
		while (!s1.isEmpty())
			s2.push(s1.pop());
		s2.push(item);
		while (!s2.isEmpty())
			s1.push(s2.pop());
		/*/
		 * 如果栈s1的元素个数为1000 把s1放入另外外一个栈s4
		 */
		if(s1.size() == 1000) copy(s1);
	}
	
	public void copy(Stack<Item> t) {
		while (!s4.isEmpty())
			s3.push(s4.pop());
		while (!t.isEmpty())
			s3.push(s1.pop());
		while (!s3.isEmpty())
			s4.push(s3.pop());
	}
	
	public Item dequeue() {
		return s4.pop();
	}
	
}
public class Test3_49_2 {
	
	public static void main(String[] args) {
		StackQueue2<String> sq = new StackQueue2<String>();
		Stopwatch timer = new Stopwatch();
		for (int i = 0; i < 1000000; i++) {
			sq.enqueue(i + " ");
		}
		System.out.println(timer.elapsedTime()+" seconds");
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(timer.elapsedTime()+" seconds");
		
		
		
//		Stack<String> stack = new Stack<String>();
//		stack.push("a");
//		stack.push("b");
//		stack.push("c");
//		Stack<String> stack1 = new Stack<String>(stack);
//		stack1 = new Stack<String>(stack);
//		stack1 = new Stack<String>();
//		for(String s : stack)
//			System.out.print(s+" ");
//		System.out.println();
//		for(String s : stack1)
//			System.out.print(s+" ");
		
		
	}

}
