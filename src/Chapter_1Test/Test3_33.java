package Chapter_1Test;

import java.util.Iterator;

/**
 * ----------------------------------------------------
 * class Deque<Item> implements Iterable<Item>
 * ----------------------------------------------------
 * boolean	isEmpty()
 * int		size()					双向队列中元素的数量
 * void		pushLeft(Item item)		向左端添加一个元素
 * void		pushRight(Item item)	向右端添加一个元素
 * Item 	popLeft()				从左端删除一个元素
 * Item 	popRight()				从右端删除一个元素
 *
 */
class Deque<Item> implements Iterable<Item>{
	private class Node{
		Item item;
		Node next;	
		Node prev;	
	}
	
	private Node first;	//头结点
	private Node last;	//尾结点
	private int N;	//size
	
	public Item showSecond() {
		Node current = first;
		current = current.next;
		current = current.next;
		Item item = current.prev.item;
		return item;
	}
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void pushLeft(Item item) {
		if (isEmpty()) {
			first = new Node();
			first.item = item;
			last = first;
		}else {
			Node oldfirst = first;
			first = new Node();
			first.item = item;
			first.next = oldfirst;
			oldfirst.prev = first;
		}
		N++;
	}
	
	public void pushRight(Item item) {
		if (isEmpty()) {
			last = new Node();
			last.item = item;
			first = last;
		}else {
			Node oldlast = last;
			last = new Node();
			last.item = item;
			oldlast.next = last;
			last.prev = oldlast;
		}
		N++;
	}
	
	public Item popLeft() {
		if (isEmpty())	throw new IllegalArgumentException("无法从空队列中删除元素");
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Item popRight() {
		if (isEmpty())	throw new IllegalArgumentException("无法从空队列中删除元素");
		Item item = last.item;
		if (last.prev == null) {
			last = null;
			first = last;
		}else {
			last = last.prev;
			last.next = null;
		}
		N--;
		return item;
	}
	
	public void showValue() {
		int i = 1;
		Node current = first;
		while(current != null) {
			System.out.println("第"+i+"个结点的值：" + current.item);
			current = current.next;
			i++;
		}
	}
	

	public Iterator<Item> iterator() {
		return new DequeIterator();
	}
	
	private class DequeIterator implements Iterator<Item>{
		Node current = first;
		public boolean hasNext() {return current != null;}
		public void remove() {}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
	
	
	
}


/**
 * ----------------------------------------------------
 * class ResizingArrayDeque<Item> implements Iterable<Item>
 * ----------------------------------------------------
 * boolean	isEmpty()
 * int		size()					双向队列中元素的数量
 * void		pushLeft(Item item)		向左端添加一个元素
 * void		pushRight(Item item)	向右端添加一个元素
 * Item 	popLeft()				从左端删除一个元素
 * Item 	popRight()				从右端删除一个元素
 *
 */
class ResizingArrayDeque<Item> implements Iterable<Item>{
	private Item[] a;
	private int N;
	private int first;
	private int last;
	
	public ResizingArrayDeque() {
		a = (Item[])new Object[1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void pushLift(Item item) {
		if (isEmpty()) {
			a[last++] = item;
		}else {
			Item[] b = (Item[])new Object[a.length];
			for (int i = first + 1; i < last + 1; i++)
				b[i] = a[i-1];
			a = b;
			a[first] = item;
			last++;
		}
		N++;
		if (N == a.length)	resize(2*a.length);
		
	}
	
	public void pushRight(Item item) {
		a[last++] = item;
		N++;
		if (N == a.length) resize(2*a.length);
		
	}
	
	public Item popLeft() {
		if (isEmpty())	throw new IllegalArgumentException("无法从空队列中删除元素");
		Item item = a[first];
		a[first++] = null;
		N--;
		if (N == a.length/4) resize(a.length/2);
		return item;
	}
	
	public Item popRight(){
		if (isEmpty())	throw new IllegalArgumentException("无法从空队列中删除元素");
		Item item = a[last];
		a[last--] = null;
		N--;
		if (N == a.length/4) resize(a.length/2);
		return item;
	}
	
	private void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for(int i = first; i < last; i++) {
			b[i-first] = a[i];
		}
		a = b;
		first = 0;
		last = N;
		
	}
	
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<Item>{
		int n = first;
		public boolean hasNext() {return first != last;}
		public Item next() {
			return a[first++];
		}
	}
	
}

public class Test3_33 {
	
	public static void main(String[] args) {
		Deque<String> dq = new Deque<String>();
//		dq.pushLeft("a");
//		dq.pushLeft("b");
//		dq.pushLeft("c");
		dq.pushLeft("a");
		dq.pushRight("b");
		dq.pushRight("c");
		dq.showValue();
		dq.popRight();
		
		
//		System.out.println(dq.showSecond());
		
		for(String s : dq)
			System.out.print(s + " ");
		
//		ResizingArrayDeque<String> aq = new ResizingArrayDeque<String>();
//		aq.pushLift("a");
//		aq.pushLift("b");
//		aq.pushLift("c");
////		aq.popLeft();
////		aq.popLeft();
////		aq.popLeft();
//		aq.popRight();
//		aq.popRight();
//		aq.popRight();
//		aq.popRight();
//		
//		for(String s : aq)
//		System.out.print(s + " ");
	}
	

}
