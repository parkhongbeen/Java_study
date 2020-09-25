package planit;

public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.Kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.Kind = "Spade";
		c2.number = 4;

		
		System.out.println("c1의 모양:" + c1.Kind + " c1의 숫자:" + c1.number);
		System.out.println("c1의 모양:" + c2.Kind + " c2의 숫자:" + c2.number);
	}
}
