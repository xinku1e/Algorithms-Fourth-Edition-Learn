package Chapter_1;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class ArrayQueue1<Item> implements Iterable<Item> {
	
	private Item a[];
	private int N;//队列元素数量
	private int head;
	private int tail;
	
	public ArrayQueue1() {
		a = (Item[])new Object[1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		a[tail++] = item;
		N++;
		if(N == a.length) resize(2*a.length);
	}
	
	public Item dequeue() {
		int t = head;
		Item item = a[head++];
		a[t] = null;
		N--;
		if(N == a.length/4) resize(a.length/2);
		return item;
	}
	
	public void resize(int capacity) {
		Item [] b = (Item[])new Object[capacity];
		for(int i = head; i < tail; i++) 
			b[i-head] = a[i];
		a = b;
		head = 0;
		tail = N;
	}

	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<Item>{
		private int i = head;
		public boolean hasNext() {return i < tail;}
		public void remove() {}
		public Item next() {return a[i++];}
	}
	
	public static void main(String[] args) {
		ArrayQueue1<String> queue = new ArrayQueue1<String>();

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-"))
				queue.enqueue(item);
			else if(!queue.isEmpty())
				System.out.print(queue.dequeue()+" ");
		}
		
		System.out.println("("+queue.size()+" left on stack)");  
		for(String s : queue)
			System.out.print(s+" ");
	}


}
