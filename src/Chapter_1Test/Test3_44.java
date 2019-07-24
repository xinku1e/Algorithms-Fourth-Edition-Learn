package Chapter_1Test;

import java.util.Iterator;

import Chapter_1.Stack;

/**
* ----------------------------------------------------------------
* public class Buffer
* ----------------------------------------------------------------
* 			Buffer()				创建一块空缓冲区
* void	 	insert(char c) 			在光标位置插入字符c
* char	 	delete() 			 	删除并返回光标位置的字符
* void	 	left(int k)  			将光标向左移动k个位置
* void 		right(int k)            将光标向右移动k个位置
* int 		size()					缓冲区字符的数量
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
