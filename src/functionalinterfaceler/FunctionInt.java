package functionalinterfaceler;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInt {

    public static void main(String[] args) {

        Function<String, Integer> ex1 = String::length;
        System.out.println(ex1.apply("Ankara"));

        BiFunction<String, Integer, Double> ex2 = (item1, item2) -> Math.pow(item1.length(), item2);
        System.out.println(ex2.apply("Furkan", 3));

    }


}
