package Chapter_1Test;

public class Test1_13 {
	public static void main(String[] args) {
		int a[][] = {{1,3,5,4,7},{8,3,0,5,5},{9,7,5,4,5}};
		int b[][] = new int[a[0].length][a.length];
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++) {
				b[j][i] = a[i][j];
			}
	System.out.println("转置前：");	
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("转置后：");	
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
