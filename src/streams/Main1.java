package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Main1 {

    public static void main(String[] args) {


        //STREAM API
        List<Person> personList = List.of(
                new Person("Furkan", "Kulaksiz", 28, "Ankara", "Software", 'E'),
                new Person("Fatih", "Terim", 70, "Adana", "Software", 'E'),
                new Person("Zeynep", "Bastik", 28, "Bursa", "Database", 'K'),
                new Person("Fahriye", "Evcen", 25, "Istanbul", "Devops", 'K')
                );

        //System.out.println(personList);

        personList
                .stream()
                .forEach(System.out::println);


        long personCount = personList
                .stream()
                .count();

        System.out.println("----------");
        personList
                .stream()
                .filter(item -> item.city().equals("Ankara")
                        || item.department().equals("Devops"))
                .forEach(System.out::println);
        System.out.println("-----------");

        personList
                .stream()
                .filter(item -> item.city().equals("Ankara") && item.gender() == 'E')
                .map(Person::age)
                .forEach(System.out::println);
        System.out.println("-----------------------");

        int total = personList
                .stream()
                .mapToInt(Person::age)
                .sum();
        System.out.println("-------");
        System.out.println(total);
        System.out.println("-------");

        System.out.println("-----------------------");

        int minAge = personList
                .stream()
                .mapToInt(Person::age)
                .min()
                .getAsInt();

        System.out.println("Min Age : " + minAge);

        System.out.println("-----------------------");

        int maxAge = personList
                .stream()
                .mapToInt(Person::age)
                .max()
                .orElseThrow(RuntimeException::new);

        System.out.println("Max Age : " + maxAge);

        System.out.println("-----------------------");


        //Cinsiyeti erkek olanlarin yaslari toplami
//        personList
//                .stream()
//                .filter(item -> item.gender() == 'E')
//                .mapToInt(item -> item.age())
//                .sum();






        //Predicate<Integer> prd = (item) -> item > 10;
        //System.out.println(prd.test(15));


        //System.out.println(personCount);


//        Consumer<String> csr = (item) -> System.out.println(item.length());
//        csr.accept("Furkan");
//
//        Consumer<String> csr2 = System.out::println;
//        csr2.accept("Furkan Kulaksiz");


        Stream<Integer> numbers = Stream.of(1,4,3,6,7,2,5).map(item -> item * 3);
        numbers.forEach(System.out::println);











    }
}
