package Chapter_1;

public class Array_average {
	
	public static void main(String[] args) {
		int[] a = {1, 4, 5, 6, 34, 66, 5};
		double sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		double average = sum/a.length;
		System.out.printf("数组元素的平均数为:%.5f\n",average);
		
	}
}
