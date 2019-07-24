package Chapter_1Test;

import Chapter_1.Queue;

public class Test3_37 {
	/*
	 * Ô¼Éª·òÎÊÌâ
	 */
	public static void main(String[] args) {
		int N = 7,
		M = 2;
				         
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 0; i < N; i++)
			q.enqueue(i);
		int k = 1;
		while (!q.isEmpty()) {
			int x = q.dequeue();
			if (k == M) {
				k = 1;
				System.out.print(x+" ");
			}else {
				q.enqueue(x);
				k++;
			}
				
		}
		
				        
		
		    
	}

}
