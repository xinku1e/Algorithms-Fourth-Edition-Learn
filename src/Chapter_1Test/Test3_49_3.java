package Chapter_1Test;

import Chapter_1.Stack;
import edu.princeton.cs.algs4.Stopwatch;

class StackQueue3<Item>{
	private Stack<Item> s1 = new Stack<Item>();
	private Stack<Item> s2 = new Stack<Item>();
	private int N;
	private Stack<Item> s3 = new Stack<Item>();
	private Stack<Item> s4 = new Stack<Item>();
	
	public StackQueue3(int n) {
		N = n;
	}
	
	public void enqueue(Item item)	{
		while (!s1.isEmpty())
			s2.push(s1.pop());
		s2.push(item);
		while (!s2.isEmpty())
			s1.push(s2.pop());
		/*/
		 * 如果栈s1的元素个数为1000 把s1放入另外外一个栈s4
		 */
		if(s1.size() == N) copy(s1);
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
public class Test3_49_3 {
	
	public static void main(String[] args) {
		int N = 100000;
		
		StackQueue2<String> sq2 = new StackQueue2<String>();
		Stopwatch timer2 = new Stopwatch();
		for (int i = 0; i < N; i++) {
			sq2.enqueue(i + " ");
		}
		System.out.println(timer2.elapsedTime()+" seconds");
		System.out.print(sq2.dequeue() + " ");
		System.out.print(sq2.dequeue() + " ");
		System.out.print(sq2.dequeue() + "");
		System.out.println();
		for (int i = 0; i < N-5; i++)
			sq2.dequeue();
		System.out.print(sq2.dequeue() + "");
		System.out.print(sq2.dequeue() + "");
		System.out.println(timer2.elapsedTime()+" seconds");
		
		StackQueue3<String> sq3 = new StackQueue3<String>(1100);

		Stopwatch timer3 = new Stopwatch();
		for (int i = 0; i < N; i++) {
			sq3.enqueue(i + " ");
		}
		System.out.println(timer3.elapsedTime()+" seconds");
		System.out.print(sq3.dequeue() + " ");
		System.out.print(sq3.dequeue() + " ");
		System.out.print(sq3.dequeue() + "");
		System.out.println();
		for (int i = 0; i < N-5; i++)
			sq3.dequeue();
		System.out.print(sq3.dequeue() + "");
		System.out.print(sq3.dequeue() + "");
		System.out.println(timer3.elapsedTime()+" seconds");
		

		
	}

}
