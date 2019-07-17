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
		int N = StdIn.readInt(); 				//��ȡ��������
		QuickFindUF uf = new QuickFindUF(N);						//��ʼ��N������
		while(!StdIn.isEmpty()) {	
			int p = StdIn.readInt();
			int q = StdIn.readInt();			//��ȡ����ʱ
			if(uf.connected(p, q)) continue;	//����Ѿ���ͨ�����
			uf.union(p, q);						//�鲢����
			StdOut.println(p + " " + q);		//��ӡ����
		}
		
		uf.showid();
	}
}
