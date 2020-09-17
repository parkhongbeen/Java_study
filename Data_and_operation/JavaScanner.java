import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("첫번째 정수 : "+num1);
		System.out.println("두번째 정수 : "+num2);
		System.out.print("num1과 num2의 합은: ");
		System.out.println(+num1+num2);
	}

}