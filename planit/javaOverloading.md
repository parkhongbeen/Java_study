## 오버로딩(overloading)

- 한 클래스안에 같은 이름의 메서드 여러개 정의하는 것

```java
void println()
void println(boolean x)
void println(char x)
void println(char[] x)
void println(double x)
void println(float x)
void println(int x)
void println(long x)
void println(Object x)
void println(String x)
```

여기서 `println(123)`을 입력하면 `println(int)를 호출하고`

또는, `println("1234")`을 입력하면 `println(String x)`를 호출합니다. 이렇듯 Java는 우리의 편의를 위해 오버로딩기능을 지원해줍니다.

### 오버로딩 조건

- 메서드 이름이 같아야합니다.
- 매개변수의 개수 또는 타입이 달라야 합니다.
- 반환 타입은 영향이 없습니다.

아래의 예시를 보겠습니다.

![image](https://user-images.githubusercontent.com/53684676/94364170-628e7e00-0102-11eb-9091-f0ac16af76ba.png)

위에 코드에서는 add의 매개변수로 오는 값에 따라서 컴퓨터가 찾아서 컴파일 해줍니다.