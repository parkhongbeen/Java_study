package planit;

import java.time.Year;

class Car3 {
	private String name;
	private String color;
	private int year;
	private int speed;
	private int price;

	
	public void setCar(String n, String c, int y, int s, int p) {
		year = y;
		name = n;
		color = c;
		speed = s;
		price = p;
	}

	public void setname(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getSpeed() {
		return year;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getGear() {
		return speed;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car3 [name=" + name + ", color=" + color + ", year=" + year + ", speed=" + speed + ", price=" + price
				+ "]";
	}
	
	
}



public class CarFactory {
	public static void main(String[] args) {
		
		//name, color, year, speed, price
		String[] name_arr = {"승용차", "버스", "스포츠카"};
		String[] color_arr = {"흰색", "검정색", "빨강색"};
		int[] year_arr = {2018, 2019, 2020};

		int count = name_arr.length * color_arr.length * year_arr.length;
		Car3[] car_arr = new Car3[count];
		
		
		int index = 0;
		for(int i=0; i<name_arr.length; i++) {
			//name
			car_arr[index].setname(name_arr[i]);
			for(int j=0; j<color_arr.length; j++) {
				//color
				car_arr[index].setColor(color_arr[j]);
				for(int z=0; z<year_arr.length; z++) {
					//year
					car_arr[index].setYear(year_arr[z]);
				}
			}
			index++;
		}
	}
}
