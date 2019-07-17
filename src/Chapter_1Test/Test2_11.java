package Chapter_1Test;

class SmartDate{
	private final int year;
	private final  int month;
	private final int day;
	
	public SmartDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		if(year < 0 || year > 10000 || month < 1 || month > 12 || day < 0 || day >31)
			throw new IllegalArgumentException("Date is illegal");
	}
	
	public String dayOfTheWeek(int day) {
		
		return null;
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
}
public class Test2_11 {
	public static void main(String[] args)  {
		SmartDate date = new SmartDate(2011,-1,2);
		System.out.println(date);
		
	}

}
