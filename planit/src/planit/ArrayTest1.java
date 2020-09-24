package planit;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];

		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("입력한 숫자: ");
			scores[i] = sc.nextInt();
		}
		for (int j = 0; j < STUDENTS; j++) {
			total += scores[j];
		}
		System.out.println("평균 성적은 " + (total / STUDENTS) + "점 입니다.");
	}

}
