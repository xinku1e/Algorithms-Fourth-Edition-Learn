package Chapter_1;

import edu.princeton.cs.algs4.StdIn;

public class Evaluate {
	
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if(s.equals("(")) ;
			else if(s.equals("+"))	ops.push(s);
			else if(s.equals("*"))	ops.push(s);
			else if(s.equals(")")){
				if(ops.pop().equals("+"))
					vals.push(vals.pop()+vals.pop());
				else if(ops.pop().equals("*"))
					vals.push(vals.pop()*vals.pop());
			}
			else
				vals.push(Double.parseDouble(s));
		}
		System.out.println(vals.pop());
	}

}
