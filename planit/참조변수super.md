### super - 참조변수

- 객체 자신을 가리키는 참조변수, 인스턴스 메서드내에만 존재
- 조상의 멤버를 자신의 멤버와 구별할 때 사용

### super() - 조상의 생성자

- 조상의 생성자를 호출할 때 사용
- 조상의 멤버는 조상의 생성자를 호출해서 초기화
- 생성자의 첫 줄에 반드시 생성자를 호출해야 함
- 그렇지 않으면 컴파일러가 생성자의 첫 중에 super();mfㄹ 삽입

 