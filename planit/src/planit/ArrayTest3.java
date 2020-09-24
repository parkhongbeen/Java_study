package planit;

import java.util.Scanner;

public class ArrayTest3 {
	
	final static int STUDENTS = 5;

	public static void main(String args[]) {
		int[] scores = new int[STUDENTS];
		getValues(scores);
		getAverage(scores);
	}

	private static void getValues(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("점수를 입력해주세오: ");
			array[i] = sc.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total = 0;
		for (int i = 0; i< array.length; i++) {
			total += array[i];
		}
		System.out.println("평균점수: " + total);
	}
}
