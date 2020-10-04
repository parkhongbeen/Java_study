package planit;

class Ex7_1Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class SmartTv extends Ex7_1Tv {
	boolean caption;

	void displaycaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}