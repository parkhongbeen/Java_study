package practice1;

public class Javastatic {
  public static void main(String[] args) {
    // unit class 3개 생성
    unit a = new unit();
    unit b = new unit();
    unit c = new unit();
    
    // 생성된 각각의 static 변수에 각각 다른 값 할당
    a.staticNum = 10;
    b.staticNum = 20;
    c.staticNum = 30;
    
    // 출력 결과는 모두 같습니다.(같은 메모리를 사용중이기 때문)
    System.out.println(a.staticNum);
System.out.println(b.staticNum);  System.out.println(c.staticNum);
  }
}