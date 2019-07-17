package Chapter_1Test;


public class Test1_20 {
	
	public static int factorial(int N)
	{
		if (N == 1)	return N;
		
		
		return N*factorial(N-1);
	}
	

	public static void main(String[] args) {
		int N = 10;
		double m;
		m = Math.log(factorial(N));
		System.out.println(m);
		//System.out.println(factorial(N));
	}
}
