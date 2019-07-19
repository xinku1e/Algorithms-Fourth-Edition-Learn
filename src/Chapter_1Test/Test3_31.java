package Chapter_1Test;

import java.util.Iterator;

class DoubldeLinkedList<Item> implements Iterable<Item>{
	private class DoubleNode{
		Item item;
		DoubleNode next;
		DoubleNode prev;
	}
	
	private DoubleNode first;
	private int N;
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}

	
	public void insertHead(Item item){
		DoubleNode oldfirst = first;
		first = new DoubleNode();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public void insertTail(Item item) {
		if(isEmpty()) {
			first = new DoubleNode();
			first.item = item;
		}else {
			DoubleNode current = first;
			while(current.next != null)
				current = current.next;
			current.next = new DoubleNode();
			current.next.item = item;
		}
		N++;
	}
	
	public void deleteHead() {
		if(isEmpty()) 
			throw new IllegalArgumentException("链表为已为空");
		else {
			first = first.next;
			N--;
		}
	}
	
	public void deleteTail() {
		if(isEmpty()) 
			throw new IllegalArgumentException("链表为已为空");
		else {
			DoubleNode cnt = first;
			while(cnt.next.next != null)
				cnt = cnt.next;
			cnt.next = null;
		}
		N--;
	}

	public Iterator<Item> iterator() {
		return new DoubleListIterator();
	}
	
	private class DoubleListIterator implements Iterator<Item>{
		DoubleNode cnt = first;
		public boolean hasNext(){return cnt != null;}
		public Item next() {
			Item item = cnt.item;
			cnt = cnt.next;
			return item;
		}
	}
}

public class Test3_31 {
	
	public static void main(String[] args) {
		DoubldeLinkedList<String> list = new DoubldeLinkedList<String>();
		list.insertHead("a");
		list.insertHead("b");
		list.insertHead("c");
		list.insertTail("d");
		list.insertTail("e");
		list.deleteHead();
		list.deleteTail();
		
		for(String s : list)
			System.out.print(s + " ");
	}
	

}
