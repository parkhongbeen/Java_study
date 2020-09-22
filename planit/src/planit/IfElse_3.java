package planit;

import java.util.Scanner;

public class IfElse_3 {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		grade = input.nextInt();
		
		if(grade >= 90)
			System.out.println("A");
		else
			if (grade >= 80)
			System.out.println("B");
			else
				if(grade >= 70)
					System.out.println("C");
				else
					if(grade >= 60)
						System.out.println("D");
					else
						System.out.println("F");
		
				

	}
}
