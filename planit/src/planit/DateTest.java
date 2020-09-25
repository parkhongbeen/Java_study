package planit;


class Date {
	private int year, day;
	private String month;

	public void setDate(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public void printDate() {
		System.out.println(year + "년 " + month + " " + day + "일");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		year = y;
	}

	public String getMonth() {
		return month;
	}
 
	public void setMonth(String m) {
		month = m;
	}
	// 나머지 접근자와 변경자
}

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		date.setDate(2020, "3월", 2);
		date.printDate();
		date.setYear(2000);
		date.printDate();
	}
}