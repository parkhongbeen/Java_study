## 생성자(constroctor)

- 인스턴스가 생성될 때마다 호출되는 **인스턴스 초기화 메서드**
- 리턴값이 없음
- 이름이 클래스 이름과 같아야 함
- 인스턴스 생성시 수행할 작업(iv 초기화)에 사용

```java
클래스이름(타입 변수명, 타입 변수명, ...){
  //인스턴스 생성시 수행될 코드,
  //주로 인스턴스 변수의 초기화 코드를 적는다.
}
```

```java
class Card(){ 
  Card(){ //매개변수 없는 생성자
    //인스턴스 초기화 작업
  }
  Card(String kind, int number){ // 매개변 있는 생성자
    //인스턴스 초기화 작업
  }
}
```

### 기본 생성자

- 매개변수가 없는 생성자
- 생성자가 하나도 없을때만, 컴파일러가 자동 추가

```java
class Data_1 {
	int value;
}

class Data_2 {
	int value;
	Data_2(){ // 기본 생성자
	}
	
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}
```

```java
public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
		//The constructor Data_2() is undefined
	}
}
```

```java
public class Car_1 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car_1(){}			// 기본생성자 !잊지말고 넣어줘야 함!
	
	Car_1(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
```

```java
public class CarClass {

	public static void main(String[] args) {
		Car_1 c_1 = new Car_1("white", "auto", 4);
		System.out.println(c_1.color);
		System.out.println(c_1.gearType);
		System.out.println(c_1.door);
	}
}
```

