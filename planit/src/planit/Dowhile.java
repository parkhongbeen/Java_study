package planit;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		int answer = 59;
		int guess;
		int tries = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력해주세요.");
			guess = sc.nextInt();
			tries++;
			if (guess > answer) 
				System.out.println("입력한 숫자가 answer보다 큽니다.");
			
			if (guess < answer) 
				System.out.println("입력한 숫자가 answer보다 작습니다.");
		}while (guess != answer);
					System.out.printf("축하합니다. 시도횟수: %d", tries);
	}
}
	
