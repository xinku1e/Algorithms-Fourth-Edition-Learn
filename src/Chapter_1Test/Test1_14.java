package Chapter_1Test;



public class Test1_14 {

	public static int lg(int N)
	{
		int m = 1;
		int cnt = -1;
		while(m<=N) {
			m = m*2;
			cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(lg(2));
	}

}
