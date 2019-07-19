package Chapter_1;

public class Date {
	private  final int year;
	private   final int month;
	private  final int day;
	
	public Date(String date) {
		String[] s = date.split("/");
		year = Integer.parseInt(s[0]);
		month = Integer.parseInt(s[1]);
		day = Integer.parseInt(s[2]);
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int year() {
		return year;
	}
	
	public int month() {
		return month;
	}
	
	public int day() {
		return day;
	}
	
	public String toString() {
		return year+"/"+month+"/" + day;
	}
	public static void main(String[] args) {
		Date data = new Date(2019,7,6);
		System.out.println(data);
	}
}
