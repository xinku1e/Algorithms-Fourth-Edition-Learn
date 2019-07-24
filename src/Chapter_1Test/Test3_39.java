package Chapter_1Test;

/**
* ----------------------------------------------------------------
* public class CircularQueue<Item>
* ----------------------------------------------------------------
* boolean 	isEmpty() 			 	队列是否为空
* boolean 	isFull() 			 	队列是否已满
* boolean 	enqueue(Item e)        	添加一个元素 如果队列已满返回false
* Item 		dequeue()              	删除并返回一个元素
* ----------------------------------------------------------------
*/
class CircularQueue<Item>{
	int CAPACITY;	//队列容量
	int N;			//元素数量
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
		if(isEmpty()) throw new IllegalArgumentException("无法从空队列中删除元素");
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
