package practice1;

public class ClassInheritance {

	public static void main(String[] args) {
		// 부모 클래스
		Character marin = new Character();
		
		marin.age = 25;
		marin.name = "mett";
		
		marin.hello();
		String attackResult = marin.attack();
		System.out.println(attackResult);
		
		// 자식 클래스
		mainCharacter marin2 = new mainCharacter();
		
		marin2.age = 30;
		marin2.name = "smatt";
		marin2.move();
	}

}
