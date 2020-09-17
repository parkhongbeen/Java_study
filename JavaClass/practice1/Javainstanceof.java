package practice1;

public class Javainstanceof {

	public static void main(String[] args) {
		unit parent = new unit();
		enemy child = new enemy();
		
		if(parent instanceof unit) {
			System.out.println("unit 클래스입니다.");
		}
		
		if(child instanceof Object) {
			System.out.println("enemy 클래스입니다.");
		}
		
		if(child instanceof unit) {
			System.out.println("child는 enemy클래스이지만, enemy클래스는 unit클래스의 자식클래스 이므로 이 문구가 출력됩니다.");
		}
		
		if(child instanceof Object) {
			System.out.println("child는 enemy클래스이지만, Object는 모든 클래스의 부모이므로 이 문구가 출력됩니다.");
		}

	}

}
