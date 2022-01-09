# 문제

* 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.
* 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.
* a 값이 같은 결과가 나오도록 코드를 수정해보시오.


    public static void sum( int a ){
    a += 400;
    System.out.println( a );
    }
    public static void main(String[] args) {
    int a = 100;
    sum( a );
    System.out.println( a );
    }


# 깨달은 점

### Wrapper 클래스

Wrapper 클래스: 기본타입의 데이터를 객체로 사용해야할 상황이 있다. 이 때, 기본타입의 데이터 그 자체를 객체로 만들어주는 것을 Wrapper 클래스라 한다. 기본타입의 객체는 총 8가지가 있다.

- int
- float
- boolean
- char
- byte
- short
- long
- double

래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아 객체로 만들어 준다.