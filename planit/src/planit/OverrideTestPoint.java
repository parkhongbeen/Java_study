package planit;

class OverrideTestPoint {
	int x;
	int y;
	
	public OverrideTestPoint(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public String toString() {
		return "x:" + x + ", y:" + y;
	}
}

//class Mypoint3D extends OverrideTestPoint {
//	int z;
//	String getLocation() {
//		return "x:" + x + ", y:" + y + ", z:" + z;
//	}
//}