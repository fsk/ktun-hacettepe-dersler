package oop.abstractions;

public class Main {

    public static void main(String[] args) {

        Ogretmen instance = new Ogretmen() {
            @Override
            public void dersAnlat() {
                System.out.println("Ogretmen ders anlatiyor.");
            }

            @Override
            public String okulaGel() {
                return "Hoca okula geliyor.";
            }
        };

        instance.dersAnlat();

    }
}
