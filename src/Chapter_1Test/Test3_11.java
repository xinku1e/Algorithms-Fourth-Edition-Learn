package Chapter_1Test;

import Chapter_1.Stack;

public class Test3_11 {
	public static double EvaluatePostfix(String postfix){
		String[] s = postfix.split("\\s+");
		Stack<Double> vals = new Stack<Double>();
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("+"))	vals.push(vals.pop() + vals.pop());
			else if(s[i].equals("-"))	vals.push(vals.pop() - vals.pop());
			else if(s[i].equals("*"))	vals.push(vals.pop() * vals.pop());
			else if(s[i].equals("/"))	{
				double v1 = vals.pop();
				double v2 = vals.pop();
				vals.push(- (v2 / v1));
				}
			else vals.push(Double.parseDouble(s[i]));		
			}
		return vals.pop();
	}
	public static void main(String[] args) {
		String s = Test3_10.InfixTopostfix("( ( 1 + 2 ) * ( ( 8 / 4 ) * ( 5 - 3 ) ) )");
		System.out.println(EvaluatePostfix(s));
	}

}
