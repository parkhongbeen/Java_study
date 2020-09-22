package planit;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		final int RATE = 5000;
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.println("시간을 입력해주세요.");
		hours = input.nextInt();
		
		if (hours > 8) {
			pay = (RATE * 8) + (int) (1.5 * RATE * (hours - 8));
		} else {
			pay = RATE * hours;
		}
		System.out.println("받으실 임금은 " + pay + "원 입니다.");
	}
}
