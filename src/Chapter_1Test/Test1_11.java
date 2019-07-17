package Chapter_1Test;

public class Test1_11 {
	public static void main(String[] args) {
		boolean a[][] = {{true,false,true,true,false},{true,false,true,true,true},{true,false,true,true,false}};
		System.out.print("  ");
		for(int t=0; t<a[0].length; t++) {
			System.out.print(t+1+" ");
		}
		System.out.println();
		for(int i=0; i<a.length;i++) {
			System.out.print(i+1+" ");
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j])
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
