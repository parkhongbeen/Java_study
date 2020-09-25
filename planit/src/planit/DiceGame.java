package planit;

import java.util.Scanner;

class DiceGame {
	int diceFace, userGuess;

	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1; // 1부터 6사이의 난수를 생성
	}

	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt(); // 입력받은값을 반환
	}

	private void checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
	}

	public void startPlaying() {
		int userGuess = getUserInput("예상값을 입력하세요.");
		RollDice(); // 같은 클래스에 있는 메소드는 객체 필요 없음
		checkUserGuess();
	}
}
