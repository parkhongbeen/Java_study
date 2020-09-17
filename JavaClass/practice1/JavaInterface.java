package practice1;

public class JavaInterface {
	public static void main(String[] args) {
		innerClass a = new innerClass();
		a.hello(); // interface를 implements한 기능
		a.goodbye(); // interface를 implements한 기능
	}
}

interface rule {
	public void hello();
}

interface rule2 {
	public void goodbye();
}

class innerClass implements rule, rule2 {

	@Override
	public void hello() {
		System.out.println("hello!");
	}

	@Override
	public void goodbye() {
		System.out.println("good bye!");
	}
}