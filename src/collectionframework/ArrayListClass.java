package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {


        //int[] sayilar = new int[]{1,4,5,2,3,213};
        //String[] isimler = new String[]{"Furkan", "Huseyin", "Omer", "Veysel"};
        //Object[] everything = new Object[]{true, 4.5, 7, false, new int[4], "Ankara"};

        //Collection Framework
        List everything = new ArrayList();
        everything.add(true);
        everything.add(1);
        everything.add(new int[4]);
        everything.add(false);
        everything.add("Ankara");


        System.out.println(everything);

        List<String> sehirler = new ArrayList<>(3);
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Bursa");
        sehirler.add("Antalya");
        sehirler.add("Malatya");

        System.out.println(sehirler);

        //ArrayList[] inst = new ArrayList[5];

        List instance = new LinkedList();
        instance.add("");
        //instance.
        //sehirler.






    }
}
