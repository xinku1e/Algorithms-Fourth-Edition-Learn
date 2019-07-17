package Chapter_1Test;


public class Test1_27 {
	
	public static double binomial(int N, int k, double p)
	{	System.out.println(1);
		if(N == 0 && k == 0) return 1.0;
		if(N < 0 || k < 0)	return 0.0;
		return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
	}
	
	public static void main(String[] args) {
		double a = binomial(100, 50, 0.25);
		System.out.println(a);
		
	}

}
