package Chapter_1Test;

import Chapter_1.Stack;

public class Test3_05 {

	public static void main(String[] args) {
		//��ӡN�Ķ����Ʊ�ʾ
		Stack<Integer> stack = new Stack<Integer>();
		int N = 50;
		while(N > 0) {
			stack.push(N%2);
			N /= 2;
		}
		for(Integer i : stack)
			System.out.print(i);
	}
}
