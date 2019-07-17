package Chapter_1;


public class Array_reverse {
	public static void main(String[] args) {
		
		int[] a = {1, 3, 45, 5, 6, 634, 33, 12};
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		
		for(Integer ints : s)
			System.out.print(ints+" ");
	}

}
