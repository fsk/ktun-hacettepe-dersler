package oop.generics;

public class Test<Type1, Type2> {

    Type1 val1;
    Type2 val2;

    public Test(Type1 val1, Type2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void print() {
        System.out.println(val1);
        System.out.println(val2);
    }
}
