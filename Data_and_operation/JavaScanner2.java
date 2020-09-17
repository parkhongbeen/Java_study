import java.util.Scanner;

public class JavaScanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String englishname = sc.next();
		
		if(englishname.equals("hongbeen")) {
			System.out.println("나의 영어 이름은 "+englishname+"입니다.");
		}
	}

}