package oop.abstractions;

public class Main2 {

    public static void main(String[] args) {


        HesapMakineksi instance = new HesapMakineksi() {
            @Override
            public int topla(int a, int b) {
                return a + b;
            }

            class AClassi {
                class BClassi {

                }
            }

            AClassi instance = new AClassi();
        };


    }
}
