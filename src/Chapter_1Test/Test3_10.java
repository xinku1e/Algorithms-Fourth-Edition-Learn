package Chapter_1Test;

import Chapter_1.Stack;



public class Test3_10 {
	public static  String InfixTopostfix(String infix) {
		
		String s[] = infix.split("\\s+");
		Stack<String> ops = new Stack<String>();
		Stack<String> vals = new Stack<String>();
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("("));
			else if(s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/")) ops.push(s[i]);
			else if(s[i].equals(")")){
				String t1 = vals.pop();
				String t2 = vals.pop();
				vals.push(t2 + " " + t1 + " " + ops.pop());
			}
			else vals.push(s[i]);
		}
		return vals.pop();
		
	}
	public static void main(String[] args) {
		//InfixTopostfix
		String infix = "( ( 1 + 2 ) * ( ( 8 / 4 ) * ( 5 - 6 ) ) )";
		
		System.out.println(InfixTopostfix(infix));
		
		
		
		
		
		
		
		

//		for(String s2 : s1)
//			System.out.println(s2);
	}

}
