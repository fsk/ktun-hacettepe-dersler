package ders1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bir sayi giriniz.");
        Scanner data = new Scanner(System.in);
        int number = data.nextInt();

        switch (number) {
            case 1:
                int a;
                a = 20;
                for (int i = 0; i < a ; i++) {

                }
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis bir sayi girdiniz.");
                break;
        }

    }
}