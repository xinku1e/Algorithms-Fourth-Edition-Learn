package Chapter_1Test;

import Chapter_1.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Test3_09 {

	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<String> vals = new Stack<String>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) ops.push(s);
			else if(s.equals(")")){
				String t1 = vals.pop();
				String t2 = vals.pop();
				
				vals.push("( "+ t2 +" "+ ops.pop() + " "+ t1 + " )");
			}
			else vals.push(s);
			
		}
		System.out.println(vals.pop());
		
	}
}
