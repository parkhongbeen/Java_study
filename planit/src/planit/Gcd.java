package planit;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		int x, y, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 입력해주세요.(큰수, 작은수)");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대공약수는 %d입니다.", x);
	}
}
