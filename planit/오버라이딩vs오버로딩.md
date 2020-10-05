### 오버라이딩(overriding)

- 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
- 선언부 변경불가 / 내용만 변경가능

```java
class Point {
  int x;
  int y;
  String getLocation() {
    return "x : " + x + "y : " + y;
  }
}

class Point3D extends Point {
  int z;
  String getLocation() {
    return "x : " + x + "y : " + y + "z : " + z;
  }
}
```

### 오버라이딩 조건

- 선언부가 조상 클래스의 메서드와 일치해야 함
- 접근 제어자(`public, protected, default, private`)를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음
- 예외는 조상 클래스의 메서드보다 많이 선언할 수 있음

### 오버로딩 vs 오버라이딩

- overloading: 기존에 없는 새로운 메서드를 정의하는 것(new) / 상속과 관계 x
- 오버라이딩(overring): 상속받은 메서드의 내용을 변경하는 것(change, modify) / 상속과 관계 o

