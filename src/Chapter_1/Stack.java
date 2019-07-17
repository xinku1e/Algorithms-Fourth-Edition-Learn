package Chapter_1;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class Stack<Item> implements Iterable<Item> {
	
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private int N;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Item peek() {
		return first.item;
	}
	
	private class StackIterator implements Iterator<Item>{
		Node current = first;
		public boolean hasNext(){ return current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
	
	public Iterator<Item> iterator() {
		
		return new StackIterator();
	}
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				System.out.print(s.pop()+" ");
		}
		
		System.out.println("("+s.size()+" left on stack)");  
		for(String s1 : s)
			System.out.print(s1+" ");
		System.out.println("\n"+s.peek());
	}
	
	


}
