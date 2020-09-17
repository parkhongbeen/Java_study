package practice1;

public class Person {
	
	//멤버변수
	int age;
	String name;
	
	// hello1메서드
	public void hello1() {
		System.out.println("Hello1! my name is " + this.name);
	}
	
	// hello1메서드(매개변수)
	public void hello1(String to) {
		System.out.println("Hello1! " + to + " my name is " + this.name);
	}
	
	// hello2메서드(리턴값이 있는 메서드)
	public String hello2() {
		String hello = "Hello2! my name is " + this.name;
		return hello;
	}
	
	// hello2메서드(리턴값이 있고 매개변수가 있음)
	public String hello2(String to) {
		String hello = "Hello2! " + to + " my name is " + this.name;
		return hello;
	}
	
	// 기본 생성자
	Person(){
		name = "hongbeen";
		age = 28;
	}
	
	Person(String name1,int age1){
		name = name1;
		age = age1;
	}
	
}
