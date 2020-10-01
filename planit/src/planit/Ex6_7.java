package planit;

public class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000;
		// 지역변수 x의 생명주기는 메소드내부이지만 참조변수에서는 값이 복사
		System.out.println("change() : x = " + d.x);
	}
}