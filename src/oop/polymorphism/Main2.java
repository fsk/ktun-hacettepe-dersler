package oop.polymorphism;

/**
 * -- Polymorphism --
 * Tanım1: Alt sınıfa ait bir nesne üst sınıfa ait bir nesne olarak gösterilebilir.
 * Tanım2: Üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
 *
 * Runtime'da çalışır.
 */

public class Main2 {

    public static void main(String[] args) {

        GeometrikSekil instance = new Kare();
        instance.gs();
        instance.method();


        /**
         * -- Polymorphism --
         * Tanım1: Alt sınıfa ait bir nesne üst sınıfa ait bir nesne olarak gösterilebilir.
         * Tanım2: Üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
         *
         * Runtime'da çalışır.
         */


        System.out.println("--------------------------------");

        Object instance2 = new GeometrikSekil();
        String deger = instance2.toString();
        System.out.println(deger);

    }
}

class GeometrikSekil {
    public void method() {
        System.out.println("Geometrik sekil methodu");
    }

    public void gs() {
        System.out.println("Geometrik Sekil classi icindeyiz.");
    }

    @Override
    public String toString() {
        return "ToString methodu override edildi";
    }
}

class Kare extends GeometrikSekil {

    @Override
    public void gs() {
        System.out.println("KAre icerisine gs yi override ettim.");
    }

    @Override
    public void method() {
        System.out.println("Kare method");
    }

    public void kare() {
        System.out.println("Kare classi icindeyiz.");
    }
}

class Daire extends GeometrikSekil {
    @Override
    public void method() {
        System.out.println("Daire methodu");
    }

    public void daire() {
        System.out.println("Daire classi icindeyiz.");
    }
}
