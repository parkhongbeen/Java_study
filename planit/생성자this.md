### 생성자 this()

- 생성자에서 다른 생성자 호출할 때 사용
- 다른 생성자 호출시 첫 줄에서만 사용가능

### 참조변수 this

- 인스턴스 자신을 가리키는 참조변수
- 인스턴스 메서드(생성자 포함)에서 사용가능
- 지역변수(Iv)와 인스턴스 변수(iv)를 구별할 때 사용 

```java
Car(String c, String g, int d){
  color = c;
  gearType = g; 
  door = d;
}
```

```java
Car(String color, String gearType, int door) {
  this.color = color;
  this.gearType = gearType;
  this.door = door;
}
```

### 참조변수`this`와 생성자`this()`

**this와 this()는 비슷하게 생겼을 뿐 완전히 다른 것입니다. this는 "참조변수"이고, this()는 "생성자"입니다.**

- **this**: 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음, 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재
- **this(), this(매개변수)**: 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용

```java
public class MyMath2 {
	long a, b; // this.a, this.b
	MyMath2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	long add() { // 인스턴스 메서드
		return a + b; // return this.a + this.b;
	}
	static long add(long a, long b) { // 클래스메서드(static메서드)
		return a + b;
	}
}
```