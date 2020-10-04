## 변수의 초기화

- 지역변수는 **수동 초기화** 해야함(사용 전)

```java
class InitTest(){
  int x;				// 인스턴스 변수
  int y = x;		// 인스턴스 변수
  
  void method1() {
    int i;				// 지역변수
    int j = i;		// 에러, 지역변수를 초기화하지 않고 사용
  }
}
```

### 멤버변수의 초기화

- **명시적 초기화**

  - ````java
    class Car{
      int door = 4;
      Engine e = new Engine();
    }
    ````

- **초기화 블록**

  - 인스턴스 초기화 블럭: `{}`
  - 클래스 초기화 블럭: `static {}`

- **생성자**

  - ```java
    Car(String color, String gearType, int door) {
      this.color = color;
      this.gearType = gearType;
      this.door = door;
    }
    ```

