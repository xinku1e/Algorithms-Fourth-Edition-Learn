package Chapter_1Test;

public class Test2_06 {
	
	public static boolean isCircularRotation(String s1,String s2) {
		return s1.length() == s2.length() && (s2+s2).contains(s1);
	}
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "elloh";
		
		System.out.println(Test2_06.isCircularRotation(s1, s2));
		
	}

}
