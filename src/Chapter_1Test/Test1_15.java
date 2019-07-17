package Chapter_1Test;

public class Test1_15 {
	
	public static int []  histogram(int [] a,int M)
	{
		int cnt = 0;
		int b[] = new int [M];
		for(int i=0; i<M ; i++) {
			cnt = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] == i)
					cnt ++;
			}
			b[i] = cnt;
		}
		
		return b;
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,6,7,8,2,4,6,7,8,4};
		int M = 10;
		int [] b = histogram(a,M);
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		
	}

}
