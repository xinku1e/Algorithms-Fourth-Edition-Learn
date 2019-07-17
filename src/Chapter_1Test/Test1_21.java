package Chapter_1Test;

import edu.princeton.cs.algs4.StdIn;

public class Test1_21 {
   public static void main(String[] args) {
	   System.out.println("你要输入几位球手的数据");
	   int n = StdIn.readInt();
	   StdIn.readLine();//过滤/n
	   String [] s = new String[n] ;
	   
	   for(int i = 0; i < n; i++)
	   {
		   s[i] = StdIn.readLine();
	   }
	   
	   for(int i = 0; i < n; i++)
	   {
		   String [] t = s[i].split("\\s+");
		   System.out.printf("%s %.3f %.3f %.3f\n",t[0],Double.parseDouble(t[1]),Double.parseDouble(t[2]),Double.parseDouble(t[1])/Double.parseDouble(t[2]) );
	   }
	   
	   
	   
   }
}
