## 변수의 초기화

- 지역변수는 **수동 초기화** 해야함(사용 전)

```java
class InitTest() {
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

- 간단 초기화

- 대입연산자

  - ````java
    class Car {
      int door = 4;
      Engine e = new Engine();
    }
    ````

- **초기화 블록**

  - 복잡 초기화
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

### cv, iv 초기화

- **자동 초기화** -> 0 or null
- **간단 초기화** -> `=`
- **복잡 초기화** -> `{}`, `static {}`, 생성자

```java
class StaticBlockTest {
  static int[] arr = new int[10]; // 명시적 초기화
  
  static  // 클래스 초기화 블럭 - 배열 arr을 난수로 채움
    for(int i=0; i<arr.length; i++) {
      arr[i] = (int)(Math.random() * 10) + 1;
    }
  }
}
```

### 멤버변수의 초기화

- 클래스 변수 초기화 시점: 클래스가 처음 로딩될 때 단 한번
- 인스턴스 변수 초기화 시점: 인스턴스 생성될 때 마다

### 초기화 순서

1. cv -> iv
2. 자동 -> 간단 -> 복잡

