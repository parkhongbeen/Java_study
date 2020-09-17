class JavaArray2 {
	int[][] AddMetrix(int[][] A, int[][] B) {
	int[][] result = {};		
	result = new int[A.length][A[0].length];

	for(int i=0; i<A.length; i++) {
		for(int j=0; j<A[i].length; j++) {
			result[i][j] = A[i][j] + B[i][j];
			}
		}		
	return result;
	}
		
    public static void main(String[] args) {
        JavaArray2 c = new JavaArray2();
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        int[][] answer = c.AddMetrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 && 
                answer[1][0] == 7 && answer[1][1] == 9) {
        	for(int i=0; i<answer.length; i++) {
        		for(int j=0; j<answer[0].length; j++)
        			System.out.println(answer[i][j]);
        	}
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}

// 2line: AddMetrix는 2중배열안에 A(이중배열), B(이중배열)
// 3line: result는 빈배열
// 5line: result는 A행의 길이, A열의 길이
// 7line: 이중포문을 돌림
// 9line: A[i][j] + B[i][j] 값을 result[i][j]에 넣어줌
