package planit;

class Tv {
	String color;
	boolean power;
	int channel;

	public void power() {
		power = !power;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}
}


public class TvControl {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelUp();
		System.out.println("현재 채널은 " + tv.channel + "번 입니다.");

		tv.channelDown();
		System.out.println("현재 채널은 " + tv.channel + "번 입니다.");

		tv.power();
		System.out.println("현재 tv의 상태는 " + tv.power + " 입니다.\n");

		Tv tv2 = new Tv();
		tv2.channel = 170;
		tv2.channelUp();
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다.");

		tv.channelDown();
		System.out.println("현재 채널은 " + tv2.channel + "번 입니다.");

		tv.power();
		System.out.println("현재 tv의 상태는 " + tv2.power + " 입니다.\n");

	}
}
