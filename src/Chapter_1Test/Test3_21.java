package Chapter_1Test;

import java.util.Iterator;

import Chapter_1.LinkedList;

public class Test3_21 {

	public static boolean find(String key, LinkedList<String> list) {
		boolean result = false;
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next() == key) result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");
		String key = "d";
		System.out.println(find(key, list));
	}
		
}
