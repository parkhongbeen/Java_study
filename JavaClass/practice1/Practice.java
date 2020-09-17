package practice1;

public class Practice{

	public static void main(String[] args){
    	Person hongbeen = new Person(); // 기본생성자로 객체생성.
        Person uzi = new Person("uzi", 28); // 매개변수가 있는 생성자가 호출됨.
        
        hongbeen.hello1();
        hongbeen.hello1("uzi");
        
        System.out.println(uzi.hello2());
        System.out.println(uzi.hello2("hongbeen"));
	}
}