package part3.studyoop.ex10;

public class ex10 {
    public static void main(String[] args) {
        Child comsun = new Child("슈퍼맨", 20, 1, 100);
        System.out.println(comsun.name);
        System.out.println(comsun.age);
        System.out.println(comsun.gender);
        System.out.println(comsun.power);


    }
}

class Parent {
    String name;
    int age;

    Parent (String name, int age) {
        System.out.println("걸어가고 있어요~");
        this.name = name;
        this.age = age;
    }

}

class Child extends Parent {
    int gender;
    int power;

    Child(String name, int age, int gender, int power) {
        super(name, age);
        this.gender = gender;
        this.power = power;
        System.out.println("2배로 빨리 걸어가고 있어요~");
    }
}

