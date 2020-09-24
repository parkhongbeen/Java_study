package planit;


public class example_test {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car(100, 1000, "red");
		cars[1] = new Car(150, 5000, "black");
		cars[2] = new Car(200, 10000, "blue");
		
		for (int i=0; i<3; i++) {
			System.out.println(cars[i]);
		}
	}
}
