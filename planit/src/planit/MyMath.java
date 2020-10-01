package planit;

class MyMath {
	void printGugudan(int dan) {
		if (!(2<=dan && dan <=9))
			return;
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	long max(long a, long b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	long add(long a, long b) {
		long result = a + b;
		return result;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	long divide(long a, long b) {
		return a / b;
	}

}
