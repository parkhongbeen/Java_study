package planit;

public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displaycaption("Hello");
		stv.caption = true;
		stv.displaycaption("Hello, World");
	}

}
