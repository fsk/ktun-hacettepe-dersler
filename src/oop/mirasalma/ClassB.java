package oop.mirasalma;

/**
 * Method Overriding: Ust class'taki methodun alt class'ta
 * kendisine ait şekilde kullanılması.
 */
public class ClassB extends ClassA {

    public ClassB() {
        System.out.println("CLASS B Consturctor");
    }

    float field3;
    String field4;

    public void method1() {
        System.out.println("Bu method1 ClassB icerisindedir.");
    }
}
