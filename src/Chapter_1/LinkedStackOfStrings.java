package Chapter_1;

public class LinkedStackOfStrings{
	
	private class Node{
		String item;
		Node next;
	}
	
	private Node first = null;
	
	public boolean isEmpty() {
		return first == null;
	}
		
	public void push(String item) {
		Node oldfirst = first;
		first = new Node();	
		first.item = item;
		first.next = oldfirst;
	}
	
	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public static void main(String[] args) {
		LinkedStackOfStrings b = new LinkedStackOfStrings();
		b.push("three");
		b.push("two");
		b.push("one");
		System.out.println(b.first.item);
		System.out.println(b.first.next.item);
		System.out.println(b.first.next.next.item);
		//System.out.println(b.first.next.next.next.item);
	}
}
	
	
	
