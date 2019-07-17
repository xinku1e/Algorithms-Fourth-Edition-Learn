package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF {
	private int [] id;
	
	public QuickFindUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) 
			id[i] = i;
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pid)
				id[i] = qid;
		}
	}
	
	public void showid() {
		for(int i = 0; i < id.length; i++)
			System.out.print(i + ":" + id[i] + " ");
	}
	
	public static void main(String[] args) {
		int N = StdIn.readInt(); 				//读取触点数量
		QuickFindUF uf = new QuickFindUF(N);						//初始化N个分量
		while(!StdIn.isEmpty()) {	
			int p = StdIn.readInt();
			int q = StdIn.readInt();			//读取整数时
			if(uf.connected(p, q)) continue;	//如果已经联通则忽略
			uf.union(p, q);						//归并分量
			StdOut.println(p + " " + q);		//打印连接
		}
		
		uf.showid();
	}
}
