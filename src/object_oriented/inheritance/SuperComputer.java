package object_oriented.inheritance;

import object_oriented.inheritance.Computer;

public class SuperComputer extends Computer {
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
