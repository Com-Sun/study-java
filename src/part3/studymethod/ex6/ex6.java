package part3.studymethod.ex6;

public class ex6 {
    public static String makeUpper (String input) {
        String a = input.toUpperCase();

        return a;
    }

    public static void main(String[] args) {
        String output = makeUpper("korea");
        System.out.println(output);
    }
}
