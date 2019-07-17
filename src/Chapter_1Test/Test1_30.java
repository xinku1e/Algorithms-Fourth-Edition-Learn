package Chapter_1Test;

public class Test1_30 {
	
	public static int getGCD(int a, int b) {
		if(b == 0) return a;
		return getGCD(b,a%b);
	}
	
	
	public static void main(String[] args) {
		int M = 3;
		int N = 3;
		boolean a[][] = new boolean [M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(getGCD(i,j)==1)
					a[i][j] = true;
				else
					a[i][j] = false;
			}
		}
		
		for(int i = 0; i < M; i++) {
			System.out.println();
			for(int j = 0; j < N; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
