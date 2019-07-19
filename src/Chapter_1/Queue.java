package Chapter_1;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class Queue<Item> implements Iterable<Item> {
	
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private Node last;
	private int N;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty())	first = last;
		else	oldlast.next = last;
		N++;
		
	}
	
	public Item dequeue() {
		if(isEmpty()) return null;
		Item item = first.item;
		first = first.next;
		if(isEmpty())	last = null;
		N--;
		return item;
	}
	
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<Item>{
		Node current = first;
		public boolean hasNext() {return current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

	
	
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();

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
