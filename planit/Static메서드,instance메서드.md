### 인스턴스 메서드

- 인스턴스 생성 후,`참조변수.메서드이름()`으로 호출
- 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
- 메서드 내에서 인스턴스 변수(iv) 사용가능

### static메서드(클래스 메서드)

- 속성중에서 공통속성에 `static`을 붙임
- 인스턴스 멤버를 사용하지 않는 메서드에 `static`을 붙임
- 객체생성없이 `클래스이름.메서드이름()`으로 호출
- 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
- 메서드내에서 인스턴스 변수(iv) 사용불가

```java
class MyMath2 {
  long a, b;
  long add() { // 인스턴스메서드
    return a + b;
  }
  
  static long add (long a, long b){ // 클래스메서드
    return a + b;
  }
}
```

```java
class MathTest2 {
  public static void main(String args[]) {
    System.out.println(MyMath2.add(200L, 100L)); // 클래스메서드호출, 객체생성없이 호출 가능
    MyMath2 mm = new MyMath(); // 인스턴스생성
    mm.a = 200L;
    mm.b = 100L;
    System.out.println(mm add()) // 인스턴스메서드 호출
  }
}
```

- static메서드는 클래스메서드로 인스턴스가 필요없습니다.
- 인스턴스메서드는 작업, 메서드를 사용하려면 인스턴스 생성 후  사용할 수 있습니다.

