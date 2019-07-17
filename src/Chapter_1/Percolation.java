package Chapter_1;

import edu.princeton.cs.algs4.StdRandom;

public class Percolation {
	
//	 public Percolation(int n)                // create n-by-n grid, with all sites blocked
//	   public void open(int row, int col)    // open site (row, col) if it is not open already
//	   public boolean isOpen(int row, int col)  // is site (row, col) open?
//	   public boolean isFull(int row, int col)  // is site (row, col) full?
//	   public  int numberOfOpenSites()       // number of open sites
//	   public boolean percolates()              // does the system percolate?
//	   public static void main(String[] args)   // test client (optional)
//	
	private boolean sites[];
	private int number = 0;
	private final int N;
	private final int top;
	private final int bottom;
	WeightedQuickUnionUF uf;
	
	public Percolation(int N) {
		if(N <= 0)
			throw new IllegalArgumentException();
		this.N = N;
		sites = new boolean[N*N+2];
		for(int i = 0; i < N*N+2; i++)
			sites[i] = false;
		uf = new WeightedQuickUnionUF(N*N+3);
		number ++;
		//分别连接第一行和最后一行所有结点的结点
		 top = N*N+1;
		 bottom = N*N+2;
		for(int i = 0; i < N; i++)
			uf.union(top, i+1);
		for(int i = 0; i < N; i++)
			uf.union(bottom, N*(N-1)+i+1);
	}
	
	public void open(int row, int col) {
		int p = (row-1)*N + col;
		int left = (row-1)*N + col - 1;
		int right = (row-1)*N + col + 1;
		int up = p - N;
		int bottom = p + N;
		
		if(isOpen(row, col))	return;
		sites[p] = true;
		if(isOpen(row, col - 1))	uf.union(p, left);
		if(isOpen(row, col + 1))	uf.union(p, right);
		if(row > 1 && isOpen(row-1, col) ) uf.union(p, up);
		if(row < N && isOpen(row+1, col)) uf.union(p, bottom);
		
	}
	
	public boolean isOpen(int row, int col) {
		return sites[(row - 1) * N + col];
	}
	
	public  int numberOfOpenSites() {
		 return number;
	}
	
	public boolean percolates() {
		
		return uf.connected(top, bottom);
	}
	
	
	public static void main(String[] args) {
		int N =  1000;
		for(int t = 0; t < 100; t++) {
			
			Percolation p = new Percolation(N);
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++) {
					if(StdRandom.bernoulli(0.6))p.open(i+1, j+1);
				}
					
	//		for(int i = 1; i < N*N+1; i++) {
	//			if((i-1)%N == 0)
	//				System.out.println();
	//			System.out.print(p.sites[i] + " ");
	//		}
	//		System.out.println();
	//		System.out.println();
			
			if(p.percolates()) System.out.println("Yes");
			else	System.out.println("No");
		}
	
	}
	

}
