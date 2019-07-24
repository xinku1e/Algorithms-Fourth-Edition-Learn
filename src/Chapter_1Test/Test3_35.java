package Chapter_1Test;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;

/**
 * ----------------------------------------------------------------
 * class RandomQueue<Item> implements Iterable<Item>
 * void		RandomQueue()			创建一个空的队列
 * boolean	isEmpty()				队列是否为空
 * int		size()					队列中的元素数量
 * void 	enqueue(Item item)		添加一个元素
 * Item 	dequeue()				删除并随机返回一个元素（取样且不放回）
 * Item 	sample()				随机返回一个元素但不删除它（取样且放回）
 * ----------------------------------------------------------------
 */

class RandomQueue<Item> implements Iterable<Item>{
	
	private Item[] a;
	private int last;
	private int N;
	
	public RandomQueue() {
		a = (Item[]) new Object[1];
	}
	
	public boolean isEmpty() {
		return N > 0;
	}
	
	public int size() {
		return N;
	}
	
	public void showValue() {
		for(int i = 0; i < N; i++)
			System.out.println("第" + (i+1) + "个结点：" + a[i]);
		System.out.println();
	}
	
	public void enqueeu(Item item) {
		a[last++] = item;
		N++;
		if(N == a.length)	resize(2*a.length);
	}
	
	private void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for(int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}
	
	public Item dequeue() {
		int x = StdRandom.uniform(0, N);
		Item item = a[x];
		a[x] = a[--N];
		a[N] = null;
		return item;
	}
	
	public Item sample() {
		int x = StdRandom.uniform(0, N);
		return a[x];
	}

	@Override
	public Iterator<Item> iterator() {
		return new RandomQueueIterator();
	}
	
	public class RandomQueueIterator implements Iterator<Item>{
		int n = N;
		Item[] b = (Item[])new Object[N];
		
		public RandomQueueIterator(){
			for(int i = 0; i < N; i++)
				b[i] = a[i];
		}
		public boolean hasNext() {return n > 0;}
		public Item next() {
			int x = StdRandom.uniform(0,n);
			Item item = b[x];
			b[x] = b[--n];
			return item;
		}
	}
}

public class Test3_35 {
	public static void main(String[] args) {
		RandomQueue<String> rq = new RandomQueue<String>();
		rq.enqueeu("a");
		rq.enqueeu("b");
		rq.enqueeu("c");
		System.out.println(rq.dequeue());
		System.out.println(rq.sample());
		rq.showValue();
		for(int i = 0; i < 10; i++) {
			for (String s : rq)
				System.out.print(s + " ");
			System.out.println();
		}
	}

}
