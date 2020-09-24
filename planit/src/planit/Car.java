package planit;

class Car {
	public int speed; // 속도
	public int mileage; // 주행거리
	public String color; // 색상

	public Car(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
	}
	public String toString() {
		return "속도:" + speed + " 주행거리:" + mileage + " 색상:" + color;
	}
}
