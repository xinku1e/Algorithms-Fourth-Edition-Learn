package Chapter_1Test;

import Chapter_1.Queue;
import Chapter_1.Stack;

public class Test3_06 {
	
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		queue.enqueue("be");
		queue.enqueue("or");
		queue.enqueue("not");
		Stack<String> stack = new Stack<String>();
		while(!queue.isEmpty()) {
			stack.push(queue.dequeue());
		}
		while(!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		for(String s : queue)
			System.out.print(s+" ");
	}

}
