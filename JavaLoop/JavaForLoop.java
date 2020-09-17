import java.util.Scanner;

public class JavaForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; true; i++) {
			String word = sc.next();
			System.out.println("입력값은: " + word);
			if(word.equals("끝")) {
				break;
			}
		
		}
	}
}
