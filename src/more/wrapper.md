## Wrapper Class

JAVA엔 원시자료형 8종류가 있다.

- char: 2byte, 문자형
- byte: 1byte, 정수형
- short: 2byte, 정수형
- int: 4byte, 정수형
- long: 8byte, 정수향
- float: 4byte, 실수형
- double: 8byte, 실수형
- boolean: 1byte, 논리형

프로그램에 따라 객체를 인자로 전달해야 하는데, 기본타입 데이터를 사용하는 일이 생길 수 있다.
이때 사용하는 것이 Wrapper Class이다.

Wrapper Class는 원시자료형 데이터를 객체로 만들어준다.

- 원시자료형 -> Wrapper Class의 인스턴스: 박싱
- Wrapper Class의 인스턴스 -> 원시자료형: 언박싱