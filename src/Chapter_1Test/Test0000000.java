package Chapter_1Test;

public class Test0000000 {
	private int[] id;
	
	public Test0000000(int N) {
		id = new int [N];
		for(int i = 0; i < N; i++)
			id[i] = i;
	}
	
	public int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		id[root(p)] = root(q);
	}
	
	public void showid() {
		for(int i = 0; i < id.length; i++)
			System.out.print(i + ":" + id[i] + " ");
	}
	
	
	public static void main(String[] args) {
		int N = 10;
		Test0000000 t = new Test0000000(N);
		t.union(1, 5);
		t.union(1, 4);
		t.union(1, 3);
		t.union(1, 2);
		t.union(1, 2);
		t.union(6, 8);
		t.union(5, 8);
		t.showid();
		if(t.connected(8, 9))	System.out.println("Yes");
		else	System.out.println("NO");
	}
	

}
