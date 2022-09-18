package oop.polymorphism.staticvefinal;


public class FinalKeyword {

    public static void main(String[] args) {

        ClassA instance = new ClassB();
        instance.methodA();

    }


}

class ClassA {

    public final void  methodA() {
        System.out.println("Method A");
    }
}

class ClassB extends ClassA {
    public final void  methodB() {
        System.out.println("Method B");
    }
}
