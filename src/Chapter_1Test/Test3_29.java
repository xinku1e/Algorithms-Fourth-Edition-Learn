package Chapter_1Test;

import java.util.Iterator;

class CircleLinkQueue<Item> implements Iterable<Item>{
	
	private class Node{
		Item item;
		Node next;
	}
	
	private Node last;
	private int N; //数量
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node temp = new Node();
		temp.item = item;
		if(isEmpty()) {
			last = temp;
			last.next = last;
		}
		else {
			temp.item = item;
			temp.next = last.next;
			last.next = temp;
		}
		N++;
	}
	
	public Item dequeue() {
		if(isEmpty())	return null;
		Item item = last.next.item;
		last.next = last.next.next;
		N--;
		if(isEmpty()) last = null;
		return item;
	}

	public Iterator<Item> iterator() {
		return new CircleLinkQueueIterator();
	}
	
	private class CircleLinkQueueIterator implements Iterator<Item>{
		Node current = last.next;
		int n = N;
		public boolean hasNext(){return n > 0;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			n--;
			return item;
		}
	}
	
}

public class Test3_29 {
	public static void main(String[] args) {
		CircleLinkQueue<String> q = new CircleLinkQueue<String>();
		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		q.enqueue("d");
		q.enqueue("e");
		q.enqueue("f");
		System.out.println(q.size());
		System.out.print(q.dequeue()+ "出队列， 剩余个数： ");
		System.out.println(q.size());
		System.out.print(q.dequeue()+ "出队列， 剩余个数： ");
		System.out.println(q.size());
		
		Iterator<String> itor = q.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " ");
		}
		
		
	}

}

