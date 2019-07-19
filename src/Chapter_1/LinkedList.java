package Chapter_1;

import java.util.Iterator;


public class LinkedList<Item> implements Iterable<Item> {
	
	private class Node{
		Item item;
		Node next;
	}
	public Node head;
	private int N;
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void  insert(Item item) {
		if(isEmpty())	{
			head = new Node();
			head.item = item;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node();
			temp.next.item = item;
		}
		N++;
		
	
	}
	
	public void removeAfter(Node a) {
		//Test1.3.24
		if(a.next == null) return;
		a.next = null;
	}
	
	public void insertAfter(Node a, Node b) {
		//Test1.3.25
		if(a == null || b == null) return;
		b.next = a.next;
		a.next = b;
	}
	
//	public void remove(Item key) {
//		//Test1.3.26
//		if(head.item .equals(key)) head = head.next;
//		Node current = head;
//		while(current.next.next != null) {
//			if(current.next.item.equals(key)) current.next = current.next.next;
//			current = current.next;		
//		}
//		if(current.next.item.equals(key)) current.next = null;
//	}
	
	public void remove(Item key) {
	//Test1.3.26
		Node current = head;
		head = null;
		while(current.next !=null) {
			if(!current.item.equals(key)) {
				Node oldhead = head;
				head = new Node();
				head.item = current.item;
				head.next = oldhead;
			}
			current = current.next;
		}
		
		
	}
	
	
	public  int max() {
		//Test3_27
		if(isEmpty()) return 0;
		int Max = (int)head.item;
		LinkListIterator itor = new LinkListIterator();
		while(itor.hasNext()) {
			if((int)itor.next() > Max) Max = (int)itor.next();
		}
		return Max;
	}
	

	


	
	public void deleteHead() {
		head = head.next;
		N--;
	}
	
	public void deletetail() {
		
	}
	
	
	public void deletete(int k) {
		//Test1.3.20
		Node current = head;
		if(k == 1) deleteHead();
		else {
			while(k > 2) {
				current = current.next;
				k--;
			}
		}
		current.next = current.next.next;
		
	}


	

	public Iterator<Item> iterator() {
		return new LinkListIterator();
	}
	
	private class LinkListIterator implements Iterator<Item>{
		Node current = head;
		public boolean hasNext() {return current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("hello");
		list.insert("world");
		list.deleteHead();
		for(String s : list)
			System.out.print(s + " ");
	}
	
}




