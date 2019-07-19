package Chapter_1Test;

import Chapter_1.LinkedList;
import Chapter_1.Stack;


public class Test3_30 {

	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();

		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
		
	}

}
