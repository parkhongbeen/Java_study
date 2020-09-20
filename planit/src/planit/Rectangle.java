package planit;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {		
		double h;
		double w;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in);
		System.out.println("h값과 w값을 입력해주세요.");
		h = input.nextDouble();
		w = input.nextDouble();
		
		area = h * w;
		perimeter = 2 * ( + w);
		// println
		System.out.println("사각형의 넓이는 " + area + " 사각형의 둘레는 " + perimeter);
		// print
		System.out.print("사각형의 넓이는 " + area);
		System.out.print("사각형의 둘레는 " + perimeter);

	}

}
