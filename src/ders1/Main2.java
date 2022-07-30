package ders1;

public class Main2 {
    public static void main(String[] args) {

        /**
         * String gun = "PAZARTESI";
         *
         * switch (gun) {
         *     case "PAZARTESI":
         *     case "SALI":
         *     case "CARSAMBA":
         *         System.out.println("Gün: " + gun);
         *         System.out.println("Kaysayı: " + 1);
         *         break;
         *     case "PERSEMBE":
         *     case "CUMA":
         *         System.out.println("Gün: " + gun);
         *         break;
         *     case "CUMARTESI":
         *         System.out.println("Gün: " + gun);
         *         System.out.println("Kaysayı: " + 3);
         *         break;
         *     default:
         *         System.out.println("Gün: " + gun);
         *         System.out.println("Kaysayı: " + 5);
         * }
         */

        String gun = "CARSAMBA";

        switch (gun) {
            case "PAZARTESI", "SALI", "CARSAMBA" -> {
                System.out.println("Gun: " + gun);
                System.out.println("Katsayi: " + 1);
            }
            case "PERSEMBE", "CUMA" -> System.out.println("Gun: " + gun);
            case "CUMARTESI" -> {
                System.out.println("Gun: " + gun);
                System.out.println("Katsayi: " + 3);
            }
            default -> {
                System.out.println("Gun: " + gun);
                System.out.println("Katsayi: " + 5);
            }
        }


        /**
         * Bir degiskene atanabilir.
         */

        System.out.println("--------------------------------");

        String day = "Furkan";

        int number = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY" -> 1;
            case "THURSDAY", "FRIDAY" -> {
                System.out.println("Number: " + 2);
                yield 2;
            }
            case "SATURDAY" -> 3;
            default -> 5;
        };

        System.out.println(number);



    }
}
