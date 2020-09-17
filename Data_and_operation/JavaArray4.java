public class JavaArray4 {
		public int[][] AddMetrix(int[][] A, int[][] B) {
			int[][] result = {};		
			result = new int[A.length][A[0].length];
			
			
//			 A[0][0] = 1;
			
			
			for(int i=0; i<A.length; i++) {
				for(int j=0; j<A[i].length; j++) {
				result[i][j] = A[i][j] + B[i][j];
				}
				
    	}
			return result;
	}
}