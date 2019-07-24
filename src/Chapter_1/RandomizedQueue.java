package Chapter_1;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;

///**
// * ----------------------------------------------------------------
// * class RandomQueue<Item> implements Iterable<Item>
// * void		RandomQueue()			创建一个空的队列
// * boolean	isEmpty()				队列是否为空
// * int		size()					队列中的元素数量
// * void 	enqueue(Item item)		添加一个元素
// * Item 	dequeue()				删除并随机返回一个元素（取样且不放回）
// * Item 	sample()				随机返回一个元素但不删除它（取样且放回）
// * ----------------------------------------------------------------
// */

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private Item[] a;
	private int last;
	private int N;
	
	public RandomizedQueue() {
		a = (Item[]) new Object[1];
		N = 0;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	

	
	public void enqueue(Item item) {
		if (item == null) throw new IllegalArgumentException();
		a[last++] = item;
		N++;
		if (N == a.length)	resize(2*a.length);
	}
	
	private void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for (int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}
	
	public Item dequeue() {
		if (isEmpty())	throw new NoSuchElementException();
		int x = StdRandom.uniform(0, N);
		Item item = a[x];
		a[x] = a[--N];
		a[N] = null;
		return item;
	}
	
	public Item sample() {
		if (isEmpty())	throw new NoSuchElementException();
		int x = StdRandom.uniform(0, N);
		return a[x];
	}

	@Override
	public Iterator<Item> iterator() {
		return new RandomQueueIterator();
	}
	
	private class RandomQueueIterator implements Iterator<Item> {
		int n = N;
		Item[] b = (Item[])new Object[N];
		
		public RandomQueueIterator() {
			if (isEmpty())	throw new NoSuchElementException();
			for(int i = 0; i < N; i++)
				b[i] = a[i];
		}
		public boolean hasNext() { return n > 0; }
		public void remove() { throw new UnsupportedOperationException(); }
		public Item next() {
			if (n == 0) throw new NoSuchElementException();
			int x = StdRandom.uniform(0,n);
			Item item = b[x];
			b[x] = b[--n];
			return item;
		}
	}
	public static void main(String[] args) {
		 RandomizedQueue<String> rq = new RandomizedQueue<String>();
	        System.out.println(rq.isEmpty());
	        System.out.println(rq.size());
	        rq.enqueue("a");
	        rq.enqueue("b");
	        rq.enqueue("c");
	        rq.enqueue("d");
	        rq.enqueue("e");
	        System.out.println(rq.size());
	        rq.dequeue();
	        rq.dequeue();
	        
	        Iterator<String> iter = rq.iterator();
	        while (iter.hasNext()) System.out.println(iter.next());
	        System.out.println();
	        Iterator<String> iter2 = rq.iterator();
	        while (iter2.hasNext()) System.out.println(iter2.next());

	}
}
