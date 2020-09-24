package planit;

class Name{
	static void print() { // 클래스 메소
		System.out.println("내 이름은 안드로이드입니다.");
	}
	void print2() {
		System.out.println("내 이름은 아이폰입니다.");
	}
}
public class StaticVoidExample {
	public static void main(String[] args) {
		Name.print();
		
		Name name = new Name();
		name.print2();
	}
}