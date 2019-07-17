package Chapter_1;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
	
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private int N;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size() {
		return N;
	}
	public void add(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	private class BagIterator implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext() {return current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	public static void main(String[] args) {
		
		Bag<String> bag = new Bag<String>();
		bag.add("to");
		bag.add("be");
		bag.add("or");
		for(String s : bag)
			System.out.print(s + " ");
			
	}
	

}
