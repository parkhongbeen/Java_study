package planit;

public class InheritanceTest {
	public static void main(String[] args){
		Circle c = new Circle();
		
		c.mp.x = 1;
		c.mp.y = 2;
		c.r = 3;
		System.out.println(c.toString());
		
		System.out.println("c.x = " + c.mp.x);
		System.out.println("c.y = " + c.mp.y);
		System.out.println("c.r = " + c.r);
	}

}
