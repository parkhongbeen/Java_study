package planit;

public class Car2Class {
	String color;
	String gearType;
	int door;
	
	Car2Class() {
		this("black", "auto", 10);
	}
//	
//	Car2Class(String color){
//		this(color, "auto", 10);
//	}
//	
	Car2Class(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
