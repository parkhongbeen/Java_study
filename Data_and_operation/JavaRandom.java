import java.util.Random;

public class JavaRandom {

	public static void main(String[] args) {
		Random random = new Random();
		int r_number = random.nextInt(10);
		
		System.out.println(r_number);
	}

}
