package practice1;

public class Javaoverride {

	public static void main(String[] args) {
		Parent a = new Parent();
		child b = new child();
		
//		a.ac1(); // private으로 정의되어 있어서 참조불
		a.ac2();
		a.ac3();
		a.ac4();
	}

}

// 메인 클래스