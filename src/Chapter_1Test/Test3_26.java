package Chapter_1Test;

import Chapter_1.LinkedList;

public class Test3_26 {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("a");
		list.insert("b");
		list.insert("a");
		list.insert("a");
		list.insert("a");
		list.insert("a");

		list.insert("a");
		String key = "a";
		list.remove(key);
		//list.remove(key);
		for(String s : list)
			System.out.print(s + " ");
		
	}

}
