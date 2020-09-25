package planit;

public class StudentResult {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStudent("smatt", 100, 90);
		st.printStudent();
		
		st.setJava(50);
		
		st.setMath(30);
		
		st.setName("hongbeen");

		st.printStudent();
		System.out.println(st.toString());
	}
}
