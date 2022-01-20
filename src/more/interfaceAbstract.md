## 인터페이스와 추상클래스

인터페이스: 클래스가 아니다. 추상 메서드와 상수로 구성된다.
- implements 키워드를 사옹하여 구현한다.
- 서로 다른 클래스에서 같은 기능을 구현해야 할 때 사용한다.

**interface**

    void power();
    void monitor();
    void graphic();
    int price = 2000;

**구현**

    public class Robot implements Machine {
    public void power() {

    }

    public void monitor() {

    }

    public void graphic() {

    }

    public void rocket() {

    }

    int price = 2000;
    }

추상클래스: 클래스이다. abstract 키워드로 선언한다.
- 자식 클래스에서 부모 클래스의 모든 추상 메서드를 오버라이딩한다.
- 부모 클래스의 기능을 확장해야 할 때 사용한다.

**선언**

    abstract class Computer {
    Computer(){}
    void power(){}
    void ssd(){}
    void monitor(){}
    }

**구현**

    public class SuperComputer extends Computer{
        SuperComputer() {
    
        }
        void power(){
            System.out.println("on");
        }
        void ssd(){
            System.out.println("fast");
        }
        void monitor(){
            System.out.println("big");
        }
        void graphics(){
            System.out.println("super good");
        }
    
    }
추상 클래스와 인터페이스의 공통점
- 인스턴스를 생성할 수 없다.
- 선언만 있고 구현 내용이 없다.
- 자식 클래스에게 책임을 위임한다.

차이점
- 목적이 다르다.
- 추상 클래스는 단일 상속, 인터페이스는 다중 상속