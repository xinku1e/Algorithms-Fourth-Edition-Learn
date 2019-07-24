package Chapter_1Test;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;


/**
 * ---------------------------------------------------
 * class RandomBag<Item> implements Iterable<Item>
 * void		RandomBag()		创建一个空的背包
 * boolean	isEmpty()		背包是否为空
 * int		size()			背包中的元素数量
 * void 	add(Item item)	添加一个元素
 * ---------------------------------------------------
 */
class RandomBag<Item> implements Iterable<Item>{
	private Item[] a;
	private int N;
	
	public RandomBag() {
		a = (Item[]) new Object[1];
	}
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void add(Item item) {
		a[N++] = item;
		if (N == a.length) resize(2*a.length);
	}
	
	public void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for (int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}
	
	public void showValue() {
		int i = 1;
		int n = N;
		while (n > 0) {
			System.out.println("第"+i+"个结点的值：" + a[--n]);
			i++;
		}
	}
	
	


	public Iterator<Item> iterator() {
		return new RandomBagIterator();
	}
	
	private class RandomBagIterator implements Iterator<Item>{
		private int n = N;
		Item[] b = (Item[])new Object[N];
		
		public RandomBagIterator() {
			for(int i = 0; i < N; i++)
				b[i] = a[i];
		}
		public boolean hasNext() {return n > 0;}
		public void remove() {}
		public Item next() {
			int x = StdRandom.uniform(0, n);
			Item item = b[x];
			b[x] = b[--n];
			return item;
		}
	}
}

public class Test3_34 {
	
	public static void main(String[] args) {
		RandomBag<String> bag = new RandomBag<String>();
		bag.add("a");
		bag.add("b");
		bag.add("c");
		bag.add("d");
		bag.showValue();
		for(int i = 0; i < 10; i++) {
			for(String s : bag) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

}
