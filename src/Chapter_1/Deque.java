package Chapter_1;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class Deque<Item> implements Iterable<Item> {
	private class Node {
		Item item;
		Node next;	
		Node prev;	
	}
	private Node first;	
	private Node last;	
	private int N;
	
	 public Deque() {
	        first = null;
	        last = null;
	        N = 0;
	    }

		
	

	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void addFirst(Item item) {
		if (item == null) throw new IllegalArgumentException();
		if (isEmpty()) {
			first = new Node();
			first.item = item;
			last = first;
		} else {
			Node oldfirst = first;
			first = new Node();
			first.item = item;
			first.next = oldfirst;
			oldfirst.prev = first;
		}
		N++;
	}
	
	public void addLast(Item item) {
		if (item == null) throw new IllegalArgumentException();
		if (isEmpty()) {
			last = new Node();
			last.item = item;
			first = last;
		} else {
			Node oldlast = last;
			last = new Node();
			last.item = item;
			oldlast.next = last;
			last.prev = oldlast;
		}
		N++;
	}
	
	public Item removeFirst() {
		if (isEmpty())	throw new NoSuchElementException();
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Item removeLast() {
		if (isEmpty())	throw new NoSuchElementException();
		Item item = last.item;
		if (last.prev == null) {
			last = null;
			first = last;
		} else {
			last = last.prev;
			last.next = null;
		}
		N--;
		return item;
	}
	


	public Iterator<Item> iterator() {
		return new DequeIterator();
	}
	
	private class DequeIterator implements Iterator<Item> {
		public DequeIterator() {
			if (isEmpty())	throw new NoSuchElementException();
		}
		Node current = first;
		public boolean hasNext() { return current != null; }
		public void remove() { throw new UnsupportedOperationException(); }
		public Item next() {
			if (current == null) throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
	
	public static void main(String[] args) {
		Deque<String> deque = new Deque<String>();
        System.out.println(deque.size());
        deque.addFirst("haha");
        deque.addFirst("hehe");
        deque.addFirst("heihei");
        deque.addFirst("hiahia");
        deque.addFirst("houhou");
        System.out.println(deque.size());
        deque.removeFirst();
        System.out.println(deque.size());
        deque.removeLast();
        System.out.println(deque.size());
        Iterator<String> i = deque.iterator();
        while (i.hasNext()) System.out.println(i.next());

		
	}
	
}

