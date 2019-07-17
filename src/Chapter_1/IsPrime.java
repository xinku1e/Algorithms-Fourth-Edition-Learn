package Chapter_1;

public class IsPrime {
	public static boolean isPrime(int x){
		if(x<2)
			return false;
		for(int i=2; i<x-1; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
}
