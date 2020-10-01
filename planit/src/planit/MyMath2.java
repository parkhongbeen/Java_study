package planit;

public class MyMath2 {
	long a, b; // this.a, this.b
	
	public MyMath2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	long add() { //인스턴스 메서드
		return a + b; // return this.a + this.b;
	}
	static long add(long a, long b) { // 클래스메서드(static메서드)
		return a + b;
	}

}
