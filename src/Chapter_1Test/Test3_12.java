package Chapter_1Test;

import Chapter_1.Stack;

public class Test3_12 {
	
	public static Stack<String> copy(Stack<String> stack){
		Stack<String> temp = new Stack<String>();
		Stack<String> stackcopy = new Stack<String>();
		for( String s : stack)
			temp.push(s);
		for( String s : temp)
			stackcopy.push(s);
		return stackcopy;
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("to");
		stack.push("be");
		stack.push("or");
		stack.push("not");
		Stack<String> stackcopy = copy(stack);
		for(String s : stack)
			System.out.print(s+" ");
		System.out.println();
		for(String s : stackcopy)
			System.out.print(s+" ");
	}
}
