package Chapter_1Test;

class StackDeque<Item>{
	/*
	 * Deque ¼ûTest3_32
	 */
	private Deque<Item> dq = new Deque<Item>();
	private int N;
	public boolean isEmpty() {
		return N == 0; 
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		dq.pushLeft(item);;
		N++;
	}
	
	public Item pop() {
		N--;
		return dq.popLeft();
	}
}

public class Test3_48 {
	
	public static void main(String[] args) {
		
		StackDeque<String> stack = new StackDeque<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
