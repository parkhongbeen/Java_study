package planit;

public class Array_5 {

	public static void main(String[] args) {
		int twoDarray[][] = { { 12, 34, 56 }, { 23, 45, 67, 89 }, { 123, 456 } };
		for (int i = 0; i < twoDarray.length; i++) {
			System.out.println("twoDarry[" + i + "[열의 길이는" + twoDarray[i].length + "이다.");
		}
	}
}
