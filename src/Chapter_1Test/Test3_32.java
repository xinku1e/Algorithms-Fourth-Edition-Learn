package Chapter_1Test;

import java.util.Iterator;

import Chapter_1.Stack;


/**
* -----------------------------------------------------
* public class Steque<Item> implements Iterable<Item>
* -----------------------------------------------------
* boolean isEmpty() 
* void push(Item e)           添加一个元素到头部
* Item pop()                  从头部删除一个元素
* void enqueue(Item e)          添加一个元素到尾部
* -----------------------------------------------------
*/

class Steque<Item> implements Iterable<Item>{
	private class Node{
			Item item;
			Node next;
	}
	
	private Node first;
	private Node last;
	private int N;
	
	public boolean isEmpty(){
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
		if(first.next == null)
			last = first;
		N++;
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
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
	}

	public Steque<Item> catenation(Steque<Item> s1, Steque<Item> s2) {
		while (s2.size() > 0) {
			s1.enqueue(s2.pop());
		}
		return s1;
	}
	public Iterator<Item> iterator() {
		return new StequeIterator();
	}
	
	private class StequeIterator implements Iterator<Item> {
		Node current = first;
		public boolean hasNext() {return current != null;}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}

public class Test3_32 {
	public static void main(String[] args) {
		Steque<String> sq = new Steque<String>();
		sq.push("a");
		sq.push("b");
		sq.push("c");
		sq.push("d");
		sq.pop();
		sq.push("c");
		sq.enqueue("e");
		for(String s : sq)
			System.out.print(s + " ");
	}

}
