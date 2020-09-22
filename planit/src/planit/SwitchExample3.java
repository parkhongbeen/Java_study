package planit;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String[] args) {
		int month;
		String result = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("분기를 찾고싶으신 달을 입력해주세요.");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 2: case 3:
			result = "1분기";
			break;
		case 4: case 5: case 6:
			result = "2분기";
			break;
		case 7: case 8: case 9:
			result = "3분기";
			break;
		case 10: case 11: case 12:
			result = "4분기";
			break;
		}
		System.out.println(result);
	}
}
