package Chapter_1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class Stack<Item> implements Iterable<Item> {
	
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private int N;
	
	public Stack() {}
	public Stack(Stack<Item> s) {
		Stack<Item> t = new Stack<Item>();
		for(Item item : s)
			t.push(item);
		for(Item item : t)
			push(item);
	}
	
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
	
	public Stack<Item> catenation(Stack<Item> s1, Stack<Item> s2) {
		Stack<Item> temp = new Stack<Item>();
		while (s1.size() > 0) {
			temp.push(s1.pop());
		}
		while (temp.size() > 0) {
			s2.push(temp.pop());
		}
		return s2;
	}
	
	private class StackIterator implements Iterator<Item>{
		int m = size();
		Node current = first;
		public boolean hasNext(){
			if (m != size())	throw new ConcurrentModificationException();
			return current != null;
			}
		public void remove() {}
		public Item next() {
			if (m != size())	throw new ConcurrentModificationException();
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
