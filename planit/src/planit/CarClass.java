package planit;

public class CarClass {

	public static void main(String[] args) {		
		Car_1 c_2 = new Car_1("black", "auto", 20);
		System.out.println(c_2.color);
		System.out.println(c_2.gearType);
		System.out.println(c_2.door);
		
		Car_1 c_1 = new Car_1("white", "auto", 4);
		System.out.println("");
		System.out.println(c_1.color);
		System.out.println(c_1.gearType);
		System.out.println(c_1.door);
	}

}
