package oop.interfaceler;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        /*Calculate instance = new Calculate() {
            @Override
            public int topla(int a, int b) {
                return 0;
            }
        };

        instance.topla(4,5);*/

        Calculate instance = (p1, p2) -> p1 + p2;
        instance.topla(5,7);


        Calculate instance2 = (p1, p2) -> {
          if (p1 > p2) {
              return p1 + p2;
          }else return p1 - p2;
        };
        int res = instance2.topla(9,10);
        System.out.println(res);

        Predicate<String> instance3 = (a) ->
                Integer.parseInt(a) > 100;
        System.out.println(instance3.test("200"));


        //Function<String, Integer> find = (a) -> a.length();
        Function<Integer, String> find = a -> a.toString();
        find.apply(10);


    }
}


