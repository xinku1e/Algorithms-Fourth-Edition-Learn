package Chapter_1Test;

import Chapter_1.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Test3_04 {
	//parentheses
	public static void main(String[] args) {
		boolean result = true;
		String temp;
		Stack<String> stack = new Stack<String>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if(s.equals("(") || s.equals("{") || s.equals("["))
				stack.push(s);
			else if(s.equals(")")) {
				temp  = stack.pop();
				if(!temp.equals("(")) result = false;
			}
			else if(s.equals("]")) {
				temp  = stack.pop();
				if(!temp.equals("[")) result = false;
			}
			else if(s.equals("}")) {
				temp  = stack.pop();
				if(!temp.equals("{"))  result = false;
			}
				
			
		}
		
		System.out.println(result);
		
	}
}
