package planit;

class Car1 {
	public int speed;
	public int gear;
	public String color;
	
	void print() {
		System.out.println("색은: " + color + " 기어는: "+ gear +  " 속도는: " + speed);
	}
}

class CarTest{
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.color = "red";
		myCar.gear = 1;
		myCar.speed = 100;
		myCar.print();
	}
}
