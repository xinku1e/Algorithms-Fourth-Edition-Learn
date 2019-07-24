package Chapter_1Test;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;


class LinkedListMTF<Item> implements Iterable<Item>{
	private class Node{
		Item item;
		Node next;
	}
	
	private Node first;
	private int N;
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}

	
	public void insertHead(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public void insertTail(Item item) {
		if(isEmpty()) {
			first = new Node();
			first.item = item;
		}else {
			Node current = first;
			while(current.next != null)
				current = current.next;
			current.next = new Node();
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
			Node cnt = first;
			while(cnt.next.next != null)
				cnt = cnt.next;
			cnt.next = null;
		}
		N--;
	}
	
	public void remove(Item key) {
	//Test1.3.26
		Node current = first;
		first = null;
		N = 0;
		while (current !=null) {
			/*
			 * 把所有和key不同的元素插入到新链表中
			 */
			if (!current.item.equals(key)) {
				Node oldhead = first;
				first = new Node();
				first.item = current.item;
				first.next = oldhead;
				N++;
			}
			current = current.next;
		}
		
		
	}

	public Iterator<Item> iterator() {
		return new DoubleListIterator();
	}
	
	private class DoubleListIterator implements Iterator<Item>{
		Node cnt = first;
		public boolean hasNext(){return cnt != null;}
		public Item next() {
			Item item = cnt.item;
			cnt = cnt.next;
			return item;
		}
	}
}

public class Test3_40 {
	/*
	 * 前移编码 MoveToFront
	 * 
	 */
	public static void main(String[] args) {
		LinkedListMTF<String> list= new LinkedListMTF<String>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			list.remove(s);
			list.insertHead(s);
			for(String s2 : list)
				System.out.print(s2 + " ");
			System.out.println();
		}
		
	
		
	}

}
