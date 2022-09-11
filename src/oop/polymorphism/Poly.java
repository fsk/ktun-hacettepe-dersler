package oop.polymorphism;

public class Poly {

    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.adiniSoyle();
        kedi.adiniSoyle();
        kopek.adiniSoyle();

        System.out.println("---------------------------");

        adSoyle(hayvan);
        adSoyle(kedi);
        adSoyle(kopek);

        int a = (int) 15.7;

    }

    public static void adSoyle(Hayvan h) {
        h.adiniSoyle();
    }


}

class Hayvan {

    public void adiniSoyle() {
        System.out.println("Bu Hayvan classina ait adiniSoyle methodudur.");
    }

    public void hayvanMethod() {
        System.out.println("Bu hayvan classina ozgu method.");
    }

}

class Kedi extends Hayvan {
    @Override
    public void adiniSoyle() {
        System.out.println("Bu Kedi classina ait adiniSoyle methodudur.");
    }

    public void kediMethod() {
        System.out.println("Bu kedi classina ozgu method.");
    }
}


class Kopek extends Hayvan {
    @Override
    public void adiniSoyle() {
        System.out.println("Bu Kopek classina ait adiniSoyle methodudur.");
    }

    public void kopekMethod() {
        System.out.println("Bu kedi classina ozgu method.");
    }
}
