package planit;
import java.util.Scanner;

public class TestPlanIt_3 {
	public static void main(String[] args) {
		int year;
		
		Scanner inputsc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		year = inputsc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
