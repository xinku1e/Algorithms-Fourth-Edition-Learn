package Chapter_1;

public class Array_Matrix_multiplication {
	public static void main(String[] args) {
		int [][] a = {{1,2,3}, {2,3,6}, {2,5,7}};
		int [][] b = {{3,4,7}, {3,6,8}, {5,3,6}};
		int [][]c = new int[3][3];
		int N = a.length;
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
			{
				c[i][j] = a[i][j] * b[i][j];
			}
			
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++)
			{
				System.out.printf("%d ",c[i][j]);
				
			}
			
		}
	}

}
