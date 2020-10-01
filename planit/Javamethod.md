## 메서드란?

- 선언부 + 구현부
- 반복적으로 수행되는 여러 문장을 메서드로 작성
- 하나의 메서드는 하나의 기능만 수행하도록 작성
- 중복코드제거, 관리용이, 재사용가능

```java
...
for (int i = 0; i < 10; i++){
  numArr[i] = (int)(Math.random() * 10);
}
//배열을출력
for (int i = 0; i < 10; i++){
  System.out.printf("%d", number[i])
    System.out.println();
}
//배열을출력
for (int i = 0; i < 10; i++){
  System.out.printf("%d", number[i])
    System.out.println();
}
```

```java
//위에서 배열을 출력하는 부분을 메소드로 묶음
static void printArr(int[] numArr) {
 for (int i = 0; i < 10; i++){
  numArr[i] = (int)(Math.random() * 10);
	}
}

public static void main(String args[]){
  for (int i = 0; i < 10; i++){
    numArr[i] = (int)(Math.random() * 10);
    
    printArr(numArr) // 배열출력
    
    printArr(numArr); // 배열출력
  }
}
```

