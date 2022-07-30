package ders1;

/**
 * 1) Diziler ayni tipteki verileri saklamak icin kullanilir.
 * 2) Dizilerin kullanilabilmesi icin kac elemanli olacaginin yazilmasi gerekir.
 * 3) For indis gezer. ForEach icerik gezer.
 */
public class Main3 {
    public static void main(String[] args) {

        /**
         * dataType[] arrName;
         * dataType []arrName;
         * dataType arrName[];
         */

        int[] arrName = new int[10];
        System.out.println(arrName);
        System.out.println(arrName[5]);

        System.out.println("-------------------------");

        int []arrName2 = new int[5];
        arrName2[0]= 50;
        arrName2[1]= 150;
        arrName2[2]= 40;
        arrName2[3]= 10;
        arrName2[4]= -5;
        System.out.println(arrName2);
        System.out.println(arrName2[4]);


        System.out.println("-------------------------");


        int arrName3[] = {1,4,3,2,5,-6};
        System.out.println(arrName3);
        System.out.println(arrName3[0]);


        System.out.println("-------------------------");

        int[] a = new int[3];
        a[0] = 0;
        a[1] = 10;
        a[2] = 20;
        System.out.println("Esitlikten once");
        System.out.println(a[1]);

        int[] b = new int[3];
        b[0] = 100;
        b[1] = 200;
        b[2] = 300;
        System.out.println(b[1]);

        b = a;

        System.out.println("Esitlikten Sonra");
        System.out.println(a[1]);
        System.out.println(b[1]);


        System.out.println("-------------------------");

        for (int i = 0; i <arrName3.length ; i++) {
            System.out.println(arrName3[i]);
        }

        System.out.println("--");
        for (int item : arrName3) {
            System.out.println(item);
        }
        System.out.println("-- SQUARE For ile doldurulmasi --");
        int[] square = new int[5];

        for (int i = 0; i < square.length ; i++) {
            square[i] = (int)Math.pow(i, 2);
        }

        for (int i = 0; i < square.length ; i++) {
            System.out.println(square[i]);
        }


        System.out.println("-- SQUARE For Each ile doldurulmasi --");

        int[] square2 = new int[5];
        for (int item : square2) {
            square[item] = (int) Math.pow(item, 2);
        }

        for (int item : square2) {
            System.out.println(item);
        }





    }
}
