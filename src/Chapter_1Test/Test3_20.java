package Chapter_1Test;


import Chapter_1.LinkedList;

 
public class Test3_20 {
	
	
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insert("hello");
		list.insert("world");
		list.insert("one");
		list.insert("two");
		list.insert("three");
		int k = 4;
		list.deletete(k);
		for(String s : list)
			System.out.print(s + " ");
	}
	

}
