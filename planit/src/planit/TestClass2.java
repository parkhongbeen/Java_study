package planit;

class TestClass2 {
	int iv; // 인스턴스 변
	static int cv; //클래스변
	
	void instanceMethod() { //인스턴스메소
		System.out.println(iv); //인스턴스변수사용가능
		System.out.println(cv); //클래스변수사용가능
	}

	static void staticMethod() { //static메서드
//		System.out.println(iv); //에러!!인스턴스사용불가능
		System.out.println(cv); //클래스변수사용가능
	}
}
