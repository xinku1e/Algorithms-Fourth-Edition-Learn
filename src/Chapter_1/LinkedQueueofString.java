package Chapter_1;

public class LinkedQueueofString {
	private class Node{
		String item;
		Node next;
	}
	private Node first, last;
	
	private boolean isEmpty() {
		return first == null;
	}
	
	@SuppressWarnings("unused")
	private void enqueue(String item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else oldlast.next = last;
	}
	
	@SuppressWarnings("unused")
	private String dequeue() {
		String item = first.item;
		first = first.next;
		if(isEmpty()) last = null;
		return item;
	}
	
}
