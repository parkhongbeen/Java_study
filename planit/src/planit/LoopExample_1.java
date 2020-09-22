package planit;

import java.util.Scanner;

public class LoopExample_1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력해주세요.");
		n = sc.nextInt();

		int i = 1;
		while (i<9) {
			System.out.printf("%d * %d = %d \n", n, i, n * i);
			i++;
		}
	}
}