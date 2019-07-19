package Chapter_1Test;

import Chapter_1.LinkedList;

public class Test3_27 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(5);
		list.insert(6);
		list.insert(9);
		list.insert(29);
		list.insert(222);
		System.out.println(list.max());
	}

}
