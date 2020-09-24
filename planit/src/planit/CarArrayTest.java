package planit;

public class CarArrayTest {

	public static void main(String[] args) {
		final int NUM_CARS = 5;
		// 객체 배열 생성합니다.
		Car[] cars = new Car[NUM_CARS];

		// 배열의 각 원소에 Car객체를 생성하여 대입합니다.
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
	}

}
