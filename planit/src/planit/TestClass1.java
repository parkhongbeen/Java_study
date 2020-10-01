package planit;

public class TestClass1 {

	public static void main(String[] args) {
		//
		TestClass2 tc = new TestClass2();
		tc.iv = 1; //iv변수 생성
		TestClass2.cv = 10; // cv변수 생성

		tc.instanceMethod();
		TestClass2.staticMethod();
	}
}
