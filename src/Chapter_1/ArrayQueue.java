package Chapter_1;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class ArrayQueue <Item> implements Iterable<Item>{
	
	private Item[] a;
	private int N;
	//private int first;
	//private int last;
	
	public ArrayQueue() {
		a = (Item[])new Object[1];
	}
	public boolean isEmpty() {
		return N == 0;
	}
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Item[] b = (Item[])new Object[N+1];
		b[0] = item;
		for(int i = 0; i < N; i++)
			b[i+1] = a[i];
		a = b;
		N++;
		if(N == a.length) resize(a.length*2);
 	}
	
	public Item dequeue() {
		Item item = a[--N];
		a[N] = null;
		if(N == a.length/4)	resize(a.length/2);
		return item;
	}
	
	public void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for(int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}

	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() {return i > 0;}
		public void remove() {}
		public Item next() {return a[--i];}
	}
	
	public static void main(String[] args) {
		ArrayQueue<String> queue = new ArrayQueue<String>();

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
