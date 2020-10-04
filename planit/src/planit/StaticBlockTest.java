package planit;

public class StaticBlockTest {
	static int[] arr = new int[10]; //명시적 초기화
	
	static { // 클래스 초기화 블록 - 배열 arr을 난수로 채움
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
}
