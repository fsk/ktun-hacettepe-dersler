package ders2;

import java.util.Arrays;

/**
 * Buble Sort
 * Insertion Sort
 * Selection Sort
 * Merge Sort
 * Quick Sort
 *
 * -> Dizilerle Binary Search
 * -> Çok Boyutlu Diziler
 */

public class Main {

    public static void main(String[] args) {

        //int[] arr = new int[5];
        int[] arr = {1,4,3,2,5,-2};
        int[] arr2 = {1,4,3,2,5,-2};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println(isEqual);

        //int[] num1 = { 10, 20, 30, 40, 50 };
        //int[] num2 = { 10, 20, 30, 40, 50 };
        int[] num1 = { 10, 20, 30, 40, 40, 10, 20 };
        int[] num2 = { 10, 20, 30, 40, 50, 10 };
        System.out.println(Arrays.compare(num2, num1));

        //if (arr == arr2) {
        //    System.out.println("Esittir");
        //}else {
        //    System.out.println("Esit Degildir");
        //}



        //if (arr.equals(arr2)) {
        //    System.out.println("Esittir");
        //}else {
        //    System.out.println("Esit Degildir");
        //}

        Arrays.sort(num1);
        for (int item : num1) {
            System.out.println(item);
        }




    }
}
