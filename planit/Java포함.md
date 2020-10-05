### 포함이란?

- 클래스의 멤버로 참조변수를 선언하는 것
- 작은 단위의 클래스를 만들고, 이들을 조합해서 클래스를 만듬

```java
class Car {
  Engine e = new Engine();	// 엔진
  Door[] d = new Door[4];		// 문, 문의 개수를 넷으로 가정하고 배열을 처리함
}
```

### 클래스간의 관계 결정

- 상속관계: '~은 ~이다.(is - a)'
- 포함관계: '~은 ~을 가지고 있다.(has - a)'

```java
class Circle{
  Point c = new Point();
  int r;
}

// 원(Circle)은 점(Point)이다. / x
// 원(Circle)은 점(Point)를 가지고 있다. / o
```

