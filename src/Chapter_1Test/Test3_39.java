package Chapter_1Test;

/**
* ----------------------------------------------------------------
* public class CircularQueue<Item>
* ----------------------------------------------------------------
* boolean 	isEmpty() 			 	�����Ƿ�Ϊ��
* boolean 	isFull() 			 	�����Ƿ�����
* boolean 	enqueue(Item e)        	���һ��Ԫ�� ���������������false
* Item 		dequeue()              	ɾ��������һ��Ԫ��
* ----------------------------------------------------------------
*/
class CircularQueue<Item>{
	int CAPACITY;	//��������
	int N;			//Ԫ������
	public CircularQueue(int n) {
		CAPACITY = n;
		a = (Item[])new Object[n];
	}
	private Item[]  a;
	private int first;
	private int last;
	
	public boolean isEmpty() {
		return N == 0;
	}
	public boolean isFull() {
		return N == CAPACITY;
	}
	
	public void enqueue(Item item) {
		if(N == CAPACITY) return;
		a[last++] = item;
		if (last == CAPACITY) last = 0;
		N++;
	}
	
	public Item dequeue() {
		if(isEmpty()) throw new IllegalArgumentException("�޷��ӿն�����ɾ��Ԫ��");
		Item item = a[first];
		a[first++] = null;
		if(first == CAPACITY) first = 0;
		N--;
		return item;
	}
}

public class Test3_39 {
	public static void main(String[] args) {
		CircularQueue<String> cq = new CircularQueue<String>(5);
		cq.enqueue("a");
		cq.enqueue("b");
		cq.enqueue("c");
		cq.enqueue("d");
		cq.enqueue("e");
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.enqueue("f");
		cq.enqueue("g");
		cq.enqueue("h");
		cq.enqueue("i");
		cq.enqueue("j");
		
	}
	

}
