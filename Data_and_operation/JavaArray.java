
public class JavaArray {

	public static void main(String[] args) {
		int [ ][ ]practice1 = new int[3][3];
		int num=0;
		for(int i=0;i<3;i++){ //줄이 3개이므로 3번 동작 
		   for(int j=0;j<3;j++){ //배열에 숫자를 하나씩 입력하기 위한 반복문 
		      practice1[i][j]=num++;
		   }
		}
		// 출력
		for(int i=0; i<practice1.length; i++) {
			for(int j=0; j<practice1.length; j++) {
				System.out.print(practice1[i][j]);
			}
			System.out.println("");
		}
		
		
	}
}