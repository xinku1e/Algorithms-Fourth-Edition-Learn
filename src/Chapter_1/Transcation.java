package Chapter_1;

public class Transcation {
	private final String name;
	private final Date date;
	private final double money;
	
	public Transcation(String t) {
		String[] trans = t.split("-");
		name = trans[0];
		date = new Date(trans[1]);
		money = Double.parseDouble(trans[2]);
	}
	
	public Transcation(String name, Date date, double money) {
		this.name = name;
		this.date = date;
		this.money = money;
	}
	
	public String name() {
		return name;
	}
	
	public Date date() {
		return date;
	}
	
	public double money() {
		return money;
	}
	
	public String toString() {
		return name + " " + date.toString() + " " + money;
	}
	
	public static void main(String[] args) {
		String name = "many";
		double money = 100.25;
		Date date = new Date("2019/2/14");
		Transcation t1 = new Transcation(name,date,money);
		System.out.println(t1);
		
		Transcation t2 = new Transcation("many-2019/2/14-100.25");
		System.out.println(t2);
	}

}
