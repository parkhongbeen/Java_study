package planit;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		final int YEARS = 3;
		final int QUARTERS = 4;
		double[][] rain = new double[YEARS][QUARTERS];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < YEARS; i++) {
			for (int j = 0; j < QUARTERS; j++) {
				System.out.println(i + "차년도 " + j + "분기 감수량");
				rain[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < YEARS; i++) {
			double total = 0.0;
			for (int j = 0; j < QUARTERS; j++) {
				total += rain[i][j];
			}
			System.out.println(i + "차년도 강수량은 " + total);
		}
	}
}
