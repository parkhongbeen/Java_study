package planit;

import java.util.Scanner;

public class Metropolis {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens;
		int riches;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수도입니까?(수도:1 수도아님:0)");
		isCapital = (sc.nextInt() == 1) ? true : false;
		System.out.println("인구(단위: 백만)");
		citizens = sc.nextInt();
		System.out.println("부자의 수(단위: 백만)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) || (riches > 100);
		
		System.out.println("메트로폴리스 여부: " + isMetro);
		
	}

}
