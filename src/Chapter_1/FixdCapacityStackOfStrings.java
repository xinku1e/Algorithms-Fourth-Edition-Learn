package Chapter_1;

public class FixdCapacityStackOfStrings {
	private String[] s;
	private int N = 0;
	
	public FixdCapacityStackOfStrings(int capacity) {
		s = new String[capacity];
	}
	
	public void push(String item) {
		s[N++] = item;
	}
	
	public String pop() {
		//return s[--N];
		String item = s[--N];
		s[N] = null;
		return item;
	}
	public boolean isFull() {
		return N== s.length;
	}
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public static void main(String[] args) {
		FixdCapacityStackOfStrings stack = new FixdCapacityStackOfStrings(100);
		stack.push("to");
		stack.push("be");
		stack.push("or");
		stack.push("not");
		stack.push("to");
		System.out.println(stack.pop());
		stack.push("be");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("that");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("is");
		System.out.println(stack.pop());		
		System.out.println(stack.pop());
		
		
	}
}