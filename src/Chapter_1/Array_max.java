package Chapter_1;

import java.util.Arrays;

public class Array_max {
	
public static void main(String[] args) {
	

	//	��������������ʼ������ķ���
		/*
		 * double[] a = new int [100]; for(int i = 0; i < 100; i++) { a[i] = 0.0; }
		 */
	//	int[] b  = {1, 2, 3, 4, 5, 6};
	double[] a = {1.2, 4.0, 4.1, 3.6, 4.9, 6.0};
	//�ҳ��������Ԫ��
	double max = a[0];
	for(int i = 1; i < a.length; i++)
	{
		if(a[i] > max) {
			max = a[i];
		}
	}

		System.out.println(Arrays.toString(a)+" max = : "+max);
	
	}
}
