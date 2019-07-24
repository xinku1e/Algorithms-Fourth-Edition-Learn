package Chapter_1Test;

import java.util.Iterator;

import Chapter_1.Stack;

/**
* ----------------------------------------------------------------
* public class Buffer
* ----------------------------------------------------------------
* 			Buffer()				����һ��ջ�����
* void	 	insert(char c) 			�ڹ��λ�ò����ַ�c
* char	 	delete() 			 	ɾ�������ع��λ�õ��ַ�
* void	 	left(int k)  			����������ƶ�k��λ��
* void 		right(int k)            ����������ƶ�k��λ��
* int 		size()					�������ַ�������
* ----------------------------------------------------------------
*/
class Buffer{
	private Stack<Character> left = new Stack<Character>();
	private Stack<Character> right = new Stack<Character>();
	
	public int size() {
		return left.size() + right.size();
	}
	
	public void insert(char c) {
		left.push(c);
	}
	
	public char	delete() {
		return left.pop();
	}
	
	public void	left(int k) {
		while (k-- > 0)
			right.push(left.pop());
	}
	
	public void right(int k) {
		while (k-- > 0)
			left.push(right.pop());
	}
	
	
}

public class Test3_44 {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		buffer.insert('a');
		buffer.insert('b');
		buffer.insert('c');
		buffer.left(1);
		buffer.insert('d');
		buffer.right(1);
		System.out.println(buffer.delete());
	}

}
