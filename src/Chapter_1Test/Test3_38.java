package Chapter_1Test;

/**
 * ----------------------------------------------------------------
 * class GeneralizedQueue<Item>
 * boolean	isEmpty()				�����Ƿ�Ϊ��
 * int		size()					�����е�Ԫ������
 * void 	insert(Item item)		���һ��Ԫ��
 * Item 	delete(int k)			ɾ���������������ĵ�k��Ԫ��
 * ----------------------------------------------------------------
 */

class GeneralizedArrayQueue<Item>{
	private Item[] a;
	private int N;
	private int last;
	
	public GeneralizedArrayQueue() {
		a = (Item[])new Object[1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	public void insert(Item item) {
		a[last++] = item;
		N++;
		if(N == a.length) 	resize(2*a.length);
	}
	
	public Item delete(int key) {
		Item item = a[key-1];
		a[key-1] = null;
		for(int i = key-1; i < N; i++)
			a[i] = a[i+1];
		a[--N] = null;
		return item;
			
	}
	
	public void showValue() {
		for(int i = 0; i < N; i++) {
			System.out.println("��" + (i+1) + "��Ԫ�أ�" + a[i]);
		}
	}

	private void resize(int capacity) {
		Item[] b = (Item[])new Object[capacity];
		for(int i = 0; i < N; i++)
			b[i] = a[i];
		a = b;
	}
}
	
class GeneralizedListQueue<Item>{
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private Node last;
	private int N;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void insert(Item item) {
		if(isEmpty()) {
			last = new Node();
			last.item = item;
			first = last;
		}else {
			Node oldlast = last;
			last = new Node();
			last.item = item;
			oldlast.next = last;
		}
		N++;
	}
	
	public Item delete(int key) {
		Node current = first;
		Item item;
		if(key == 1) {
			item = first.item;
			first = first.next;
		}else {
			while(key-- > 2) {
				current = current.next;
			}
			item = current.next.item;
			current.next = current.next.next;
		}
		N--;
		return item;
			
	}
	
	public void showValue() {
		Node current = first;
		int i = 0;
		while(current != null) {
			System.out.println("��" + (i+1) + "��Ԫ�أ�" + current.item);
			current = current.next;
			i++;
		}
	}


}

public class Test3_38 {
	public static void main(String[] args) {
//		GeneralizedArrayQueue<String> gaq = new GeneralizedArrayQueue<String>();
//		gaq.insert("a");
//		gaq.insert("b");
//		gaq.insert("c");
//		gaq.insert("d");
//		gaq.showValue();
//		System.out.println(gaq.delete(2));
//		gaq.showValue();
		GeneralizedListQueue<String> glq= new GeneralizedListQueue<String>();
		glq.insert("a");
		glq.insert("b");
		glq.insert("c");
		glq.insert("d");
		glq.showValue();
		System.out.println("ɾ���� " + glq.delete(1));
		glq.showValue();
		
		
	}
}

