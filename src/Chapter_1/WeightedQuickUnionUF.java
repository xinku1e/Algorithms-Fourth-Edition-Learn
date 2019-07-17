package Chapter_1;



public class WeightedQuickUnionUF {
	private int[] id;
	private int[] sz;
	private int count;
	
	public WeightedQuickUnionUF(int N) {
		count = N;
		id = new int[N];
		sz = new int[N];
		for(int i = 0; i < N; i++)
			id[i] = i;
		for(int i = 0; i < N; i++)
			sz[i] = 1;                                                           
	}
	
	public int count() {
		return count;
	}
	
	public int find(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	public void union(int p, int q) {
		int i = find(p);
		int j = find(q);
		if(i == j)	return;
		if(sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		}
		else {
			id[j] = i;
			sz[i] += sz[j]; 
		}
		
		count --;
	}
	
	public void showid() {
		for(int i = 0; i < id.length; i++) {
			System.out.print(i + ":" + id[i] + " ");
			
		}
		System.out.println();
		for(int i = 0; i < sz.length; i++) {
			System.out.print(i + ":" + sz[i] + " ");
			
		}
		
	}
	
	public static void main(String[] args) {
		int N = 10;
		WeightedQuickUnionUF t = new WeightedQuickUnionUF(N);
		t.union(1, 2);
		t.union(3, 4);
		t.union(5, 6);
		t.union(7, 8);
		t.union(1, 4);
//		t.union(6, 8);
//		t.union(5, 8);
		t.showid();
		if(t.connected(5, 6))	System.out.println("Yes");
		else	System.out.println("NO");
	}
	
}
