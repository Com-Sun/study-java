## 객체

- 절차지향: 데이터를 여러 프로시저가 공유하는 방식
  - 시간이 갈수록 복잡해지고 수정이 어려워지는 코드

- 객체 지향: 데이터와 프로시저를 객체의 단위로 묶는다.
  - 시간이 가도 수정이 쉽다

- 객체의 핵심: 기능 제공(필드로 정의 x)

- 기능 명세 : 메서드를 이용해서 기능 명세
  - 이름, 파라미터, 결과로 구성

- 메시지: 객체와 객체의 상호작용 - 메시지를 주고 받는다고 표현

## 캡슐화

- 데이터 + 관련기능 묶기
- 기능을 제공하고 구현 상세를 감춤
- 연쇄적인 변경 전파를 최소화

캡슐화를 위한 규칙 2 가지

- Tell, Don't Ask
  - 데이터를 달라하지 말고 해달라고 하라
- Demeter's Law
  - 메서드에서 생성한 객체의 메서드만 호출
  - 파라미터로 받은 객체의 메서드만 호출
  - 필드로 참조하는 객체의 메서드만 호출

## 캡슐화 연습