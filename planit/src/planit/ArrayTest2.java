package planit;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.print("평균값을 구할 사람의 수는?");
		int size = sc.nextInt();
		int[] score = new int[size];

		for (int i = 0; i < score.length; i++) {
			System.out.print("입력하신 점수는: ");
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.printf("평균 점수는 %d 입니다.", (total / score.length));

	}
}