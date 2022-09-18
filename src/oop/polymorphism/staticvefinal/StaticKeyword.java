package oop.polymorphism.staticvefinal;

public class StaticKeyword {

    public static void main(String[] args) {

        Class1 instance = new Class1();
        Class1.number = 199;

        //instance.method1();
        //Class1.method1();

        /**
         * -- Polymorphism --
         * Tanım1: Alt sınıfa ait bir nesne üst sınıfa ait bir nesne olarak gösterilebilir.
         * Tanım2: Üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
         */

        Class1 inst = new Class2();
        inst.method1();
        //inst.overrideMethod();

        Class1 inst2 = new Class2();
        Class2 inst3 = (Class2) inst2;
        inst3.method1();




    }
}


class Class1 {
    static int number = 50;
    public static void method1() {
        System.out.println("Method 1");
    }

    public void overrideMethod() {
        System.out.println("Class1 override method");
    }

    public void methodA() {
        System.out.println("Method A");
    }
}

class Class2 extends Class1 {

    public static void method1() {
        System.out.println("Class2 icindeki Method 2");
    }

    @Override
    public void overrideMethod() {
        System.out.println("Class2 override method");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}