package part3.studyoop.ex4;

public class ex4 {
    public static void main(String[] args) {
        FarmMachine consum = new FarmMachine(1000000, 2020, "red");
        System.out.println(consum.price);
        System.out.println(consum.year);
        System.out.println(consum.color);
        consum.move();
        consum.dig();
        consum.grind();

    }
}


class FarmMachine {
    int price;
    int year;
    String color;

    FarmMachine (int price, int year, String color) {
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public void move() {
        System.out.println("Farm-machine is moving");
    }
    public void dig() {
        System.out.println("Farm-machine is digging");
    }
    public void grind() {
        System.out.println("Farm-machine is grinding");
    }
}