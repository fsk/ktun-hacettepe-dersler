package collectionframework.generics;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        TestClass instance = new TestClass(15);
        System.out.println(instance.getValue());

        TestClass instance2 = new TestClass("Java");
        System.out.println(instance2.getValue());

        TestClass<String> instance3 = new TestClass("Turkey Java Community");
        System.out.println(instance3.getValue());

        TestClass<Integer> instance4 = new TestClass<>(new Integer(30));
        System.out.println(instance4.getValue().compareTo(new Integer(20)));

        System.out.println("------------------------");

        Test val1 = new Test(15, "Turkey Java Community");
        val1.print();

        Test val2 = new Test(20, 18);
        val2.print();


        Test<Long, Double> val3 = new Test<>(7L, 15.5);
        val3.print();


        System.out.println("------------------------");

        MathStudent inst = new MathStudent();
        Teacher inst2 = new Teacher();


        //MathStudent extends Student
        Test<? extends Student, Integer> val4 = new Test<>(inst, 50);


        //Bakilacak
        Test<? super Student, Integer> val5 = new Test<>(inst2, 50);


        Predicate<String> cfg = (item -> item.equals("Java"));
        cfg.test("Java");

        //Predicate.not()






    }
}
