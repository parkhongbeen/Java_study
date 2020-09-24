package planit;

public class Array_6 {

	public static void main(String[] args) {
		int twoD[][] = new int[4][]; int k = 0;
		twoD[0] = new int[1]; // 비정형 배열 생성
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];

		for (int i = 0; i < twoD.length; i++) // 비정형 배열 초기화
			for (int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = k;
				k++;
			}
		for (int i = 0; i < twoD.length; i++) { // 비정형 배열 출력
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[j][j] + " ");
			System.out.println();
		}
	}
}