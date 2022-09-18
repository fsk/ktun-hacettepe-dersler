package oop.polymorphism;

/**
 * -- Polymorphism --
 * Tanım1: Alt sınıfa ait bir nesne üst sınıfa ait bir nesne olarak gösterilebilir.
 * Tanım2: Üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
 */

public class Main3 {

    public static void main(String[] args) {

        //int a = 50;
        //double b = 100;
        //a = (int) b;

        //Mudur instance = (Mudur) new Ogretmen();
        //instance.mudurClassinaOzguMethod();

        // Downcasting
        Ogretmen instance1 = new Mudur();
        Mudur instance2 = (Mudur) instance1;
        instance2.mudurClassinaOzguMethod();




    }
}

class Ogretmen {
    public void dersAnlat () {
        System.out.println("Ogretmen anlatiyor.");
    }

    public void ogretmenClassinaOzguMethod () {
        System.out.println("Ogretmen classina ozgu method");
    }

}

class Mudur extends Ogretmen {

    @Override
    public void dersAnlat() {
        System.out.println("Mudur ders anlatiyor.");
    }

    public void idariIslereBak() {
        System.out.println("Mudur idari islerle ilgileniyor.");
    }

    public void mudurClassinaOzguMethod () {
        System.out.println("Mudur classina ozgu method");
    }
}
