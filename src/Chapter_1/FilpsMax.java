package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class FilpsMax {
	public static Counter max(Counter x, Counter y)
	{
		if(x.tally() > y.tally())	return x;
		else return y;
	}
	
	public static void main(String[] args) {
		int t = StdIn.readInt();
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		for(int i = 0; i < t; i++) {
			if(StdRandom.bernoulli(0.5))
				heads.increment();
			else tails.increment();
		}
		
		System.out.println(max(heads,tails)+" wins");
	}

}
