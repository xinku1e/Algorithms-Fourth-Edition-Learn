package Chapter_1;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class ResizingArrayStack<Item> implements Iterable<Item>{
	private Item [] a;
	private int N;
	
	public ResizingArrayStack() {
		a = (Item[])new Object[1];
	}
	
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		a[N++] = item;
		if(N == a.length) resize(2*a.length);
	}
	
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if(N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}
	
	public void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity]; 
		for(int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}
	
	public Iterator<Item> iterator(){
		return  new ReverseArrayIterator();
	}
	
	public class ReverseArrayIterator implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() {return i > 0;}
		public void remove(){}
		public Item next() {return a[--i];}
	}
	
	public static void main(String[] args) {
		ResizingArrayStack<String> s = new ResizingArrayStack<String>();

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				System.out.print(s.pop()+" ");
		}
		
		System.out.println("("+s.size()+" left on stack)");  
		for(String s1 : s)
			System.out.print(s1+" ");
	}
	

}
