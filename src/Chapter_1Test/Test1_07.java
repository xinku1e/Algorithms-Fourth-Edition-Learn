package Chapter_1Test;

public class Test1_07 {

		public static void main(String[] args) {
			
//			int sum = 0;
//			for(int i=1; i<4; i++)
//				for(int j=0; j<i; j++)
//					sum++;
//			System.out.println(sum);
			
			int sum = 0;
			for(int i=1; i<10; i*=2)
				for(int j=0; j<i; j++)
					sum++;
			System.out.println(sum);
		}
}
