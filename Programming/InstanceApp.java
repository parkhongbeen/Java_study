import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p1.write("Hello 2");
		p1.close();
		
//		PrintWriter.write("result.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");

		
	}

}
