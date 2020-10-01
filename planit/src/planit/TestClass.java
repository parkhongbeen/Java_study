package planit;

class TestClass {
	void instanceMethod1() {} // 인스턴스메서드
	static void staticMethod() {} // static메서드
	
	void instanceMethod() { // 인스턴스메서드 
		instanceMethod1(); // 다른 인스턴스메서드를 호출
		staticMethod(); // static메서드를 호출
	}
	
	static void sataticMethod() {
//		instanceMethod1(); // 에러!!인스턴메서드를 호출할 수 없
		sataticMethod();  // static메서드는 호출할 수 있음
	}
}
