package Chapter_1Test;

import java.util.Iterator;

class ResizingArrayQueueOfString implements Iterable<String>{
	
	
	private String[] a;
	private int N;
	private int head;
	private int tail;
	
	public ResizingArrayQueueOfString() {
		a = new String[1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(String s) {
		a[tail++] = s;
		N++;
		if(N == a.length) resize(2 * a.length);
	}
	
	public String dequeue() {
		int t = head;
		String s =a[head++];
		a[t] = null;
		N--;
		if(N == a.length/4) resize(a.length/2);
		return s;
	}
	
	public void resize(int capacity) {
		String[] b = new String[capacity];
		for(int i = head; i < tail; i++)
			b[i - head] = a[i];
		a = b;
		head = 0;
		tail = N;	
	}

	public Iterator<String> iterator() {
		return new ArrayQueueIterator();
	}
	
	private class ArrayQueueIterator implements Iterator<String>{
		int i = head;
		public boolean hasNext() { return i != tail;}
		public String next() {
			return a[i++];
		}
	}
	
	
	
}

public class Test3_14 {
	
	public static void main(String[] args) {
		ResizingArrayQueueOfString q = new ResizingArrayQueueOfString();
		q.enqueue("to");
		q.enqueue("be");
		q.enqueue("or");
		q.enqueue("not");
		
		for(String s : q)
			System.out.print(s +" ");
		
	}

}
