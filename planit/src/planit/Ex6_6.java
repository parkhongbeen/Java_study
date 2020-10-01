package planit;

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		System.out.println("main() : x = " + d.x);
		change(d.x);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);  // 지역변수 x의 생명주기는 메소드내부
	}
}
