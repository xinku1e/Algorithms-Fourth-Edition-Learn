package Chapter_1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls {
	public static void main(String[] args) {
			
		int T  = StdIn.readInt();
		int SIDES = 6;
		Counter[] rolls = new Counter[SIDES+1];
		for(int i = 1; i <= SIDES; i++) 
			rolls[i] = new Counter(i+"'s");
		for(int t = 0; t < T; t++) {
			int result = StdRandom.uniform(1,SIDES+1);
			rolls[result].increment();
		}
		
		for(int i = 1; i <= SIDES; i++)
			System.out.println(rolls[i]);
		
	}
}
