package planit;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("모음인지 아닌지 확인을 위해 입력해주세요.");
		input = sc.next();
		
		switch (input) {
		case "ㅏ": case "ㅑ": case "ㅓ": case "ㅕ":
		case "ㅜ": case "ㅠ": case "ㅗ": case "ㅛ":
		case "ㅡ": case "ㅣ":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("모음이 아닙니다.");
		}
	}

}
