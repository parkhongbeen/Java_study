package planit;

class Student {
	private String name;
	private int java;
	private int math;

	public void setStudent(String n, int j, int m) {
		name = n;
		java = j;
		math = m;
	}
	public void printStudent() {
		System.out.println("이름은: " + name + "\n자바성적은: " + java + "\n수학성적은: " + math);
		System.out.println(" ");
	}
	public int getJava() {
		return java;
	}
	public void setJava(int j) {
		java = j;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int m) {
		math = m;
	}
	public void total(int j, int m) {
		System.out.println(j + m);
	}
	public void ave(int j, int m) {
		System.out.println((j + m) / 2);
	}
	
	@Override
	public String toString() {
		String str = "이름: " + name;
		str += "\n자바성적: " + java;
		str += "\n수학성적: " + math;
		return str;
	}
	
	
}