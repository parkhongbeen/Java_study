## Servlet과 JSP의 개념

> 기능의 차이는 없고 역할의 차이만 있습니다.

### Servlet이란?

- **Java코드** 안에 HTML코드(하나의 클래스)
- 웹 기반의 요청에 대한 동적인 처리가 가능한 Server Side에서 돌아가는 Java Program
- 웹 개발을 위해 만든 표준

### JSP란?

- **HTML코드**안에 java코드
- Java언어를 기반으로 하는 Server side 스크립트 언어
- servlet을 보완하고 기술을 확장한 스크립트 방식 표준
  - servlet의 모든 기능 + 추가적인 기능

## Servlet과 JSP의 차이

### Servlet

- **Java코드 안에 HTML코드**
- **Data processing(Controller)**에 좋습니다.
- DB와의 통신, Business Logic 호출, 데이터를 읽고 확인하는 작업 등에 유리합니다.
- servlet이 수정된 경우 Java코드를 컴파일(.class 파일 생성)한 후 동적인 페이지를 처리하기 때문에 전체 코드를 업데이트하고 다시 컴파일 후 재배포하는 작업이 필요합니다.(개발 생산선 저하)

### JSP

- **HTML코드 안에 Java코드**
- **presentation(View)**에 좋습니다.
- 요청 결과를 나타내는 HTML 작성하는데에 유용합니다.
- JSP가 수정된 경우 재배포할 필요가 없이 WAS가 알아서 처리합니다.(쉬운배포)

## Servlet과 JSP의 관계

### JSP만을 이용하는 모델

![image](https://user-images.githubusercontent.com/53684676/92499962-7ba8bb00-f237-11ea-9c79-7ad7526abd9e.png)

- JSP가 사용자의 요청을 받아 Java Bean(DTO, DAO)을 호출하여 적절한 동적인 페이지를 생성
- 동작 과정
  - JSP로 작성된 프로그램은 내부적으로 WAS에서 Servlet 파일로 변환
  - JSP태그를 분해하고 추출하여 다시 순수한 HTML 웹 페이지로 변환
  - 클라이언트로 응답
- 특징
  - 개발 속도가 빠름
  - 배우기 쉬움
  - 프레젠테이션 로직(View)과 비즈니스 로직(Controller)이 혼재함
  - JSP코드가 복잡해져 유지 보수가 어려움

### JSP와 Servlet을 모두 이용하는 모델(MVC Architecture)

![image](https://user-images.githubusercontent.com/53684676/92500006-87947d00-f237-11ea-8767-8bdbec22a894.png)

- JSP와 Servlet을 모두 사용하여 프레젠테이션 로직(View)과 비즈니스 로직(Controller)을 분리함
- View(보여지는 부분)는 HTML이 중심이 되는 JSP를 사용
- Controller(다른 자바 클래스에 데이터를 넘겨주는 부분)는 Java코드가 중심이 되는 Servlet을 사용
- Model은 Java Beans로, DTO를 통해 Mysql과 같은 Data Storage에 접근

참고블로그: https://gmlwjd9405.github.io/2018/11/04/servlet-vs-jsp.html