package planit;

public class Car_1 {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수

	Car_1() {
	} // 기본생성자 !잊지말고 넣어줘야 함!

	Car_1(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
