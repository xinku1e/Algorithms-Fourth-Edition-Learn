package Chapter_1;

public class Counter {
		private int count = 0;
		private final String name;

		public Counter(String id) {
			name = id;
		}
		
		public void increment() {
			count ++;
			
		}
		
		public int tally() {
			return count;
			
		}
		
		public String toString() {
			return count+" "+name;
		}
		
		public static void main(String[] args) {
			Counter heads = new Counter("heads");
			Counter tails = new Counter("tails");//触发构造函数
			heads.increment();
			heads.increment();
			tails.increment();
			System.out.println(heads+" "+tails);//自动调用toString方法
			System.out.println(heads.tally()+tails.tally());
			
		}
}
