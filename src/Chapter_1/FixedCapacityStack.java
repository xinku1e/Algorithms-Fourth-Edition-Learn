package Chapter_1;

import edu.princeton.cs.algs4.StdIn;

public class FixedCapacityStack<Item> {
	private Item[] a;
	private int N = 0;//size
	
	public FixedCapacityStack(int capacity){
		a = (Item[])new Object[capacity];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size()
	{
		return N;
	}
	
	public void push(Item item) {
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		return item;
	}
	
	public static void main(String[] args) {
		FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				System.out.print(s.pop()+" ");
		}
		
		System.out.println("("+s.size()+" left on stack)");  
	}

}
