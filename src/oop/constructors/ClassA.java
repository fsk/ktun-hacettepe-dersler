package oop.constructors;

public class ClassA {

    public ClassA() {
        System.out.println("ClassA constructor'u calisti.");
    }

    {
        System.out.println("Instance initial Block");
    }

    static {
        System.out.println("Static Block");
    }
}
