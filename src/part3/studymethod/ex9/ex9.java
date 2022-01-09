package part3.studymethod.ex9;

public class ex9 {
    public static void sum( Integer a ){
        a += 400;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Integer a = new Integer(100);
        sum( a );
        System.out.println( a );
    }
}
