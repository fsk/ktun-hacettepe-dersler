package oop.abstractions;

/**
 * -- ABSTRACTION CLASS KAVRAMI --
 * 1) Abstraction classlar birbirleriyle alakali / iliskili olan classlari
 * bir ust class'ta toplamamiza yardimci olur.
 *
 *
 * 2) Bir classin abstract class olmasi icin "class" keywordünden once
 * abstract ile imlenmesi lazim.
 *
 *
 * 3) Abstract classlardan nesne uretilemez.
 *
 *
 * 4) Abstract classlarin kendilerine ait
 * field'lari ve constructorlari olabilir.
 *
 *
 * 5) Eger bir class'ta bir tane bile olsa
 * abstract method varsa o class abstract class
 * olmak zorundadir.
 *
 *
 * 6) Bir abstract classin icindeki abstract method,
 * ilgili abstract classin bütün alt classlari tarafindan
 * override edilmek zorunda.
 *
 *
 * 7) Bir abstract class icerisinde normal method bulunabilir
 * ve ilgili abstract classin alt classlari tarafindan override
 * edilmek zorunda degillerdir.
 *
 *
 * 8) Bir abstract class icerisinde herhangi bir sekilde abstract
 * method bulunmayabilir.
 *
 *
 * 9) Abstract methodlar private, final ve static olamazlar.
 * Çünkü bu keywordlerle imlenmis methodlar override edilemezler.
 *
 *
 * 10) Abstract keywordü fieldlarda kullanilamaz.
 *
 *
 *
 * 11) Abstract Class'i extend eden bir baska abstract
 * class, ilgili abstract classin icerisindeki methodlari override
 * etmek zorunda degildir.
 *
 *
 * 12) Normal bir class, bir abstract classi
 * implemente ettiginde eger abstract class baska bir
 * abstract classi da implemente etmisse
 * o zaman her iki abstract classin da methodlarini
 * override etmesi zorunludur.
 *
 *
 * 13) Normal bir classin alt classi abstract olabilir.
 * (Object - AbstractOgretmen)
 *
 *
 * 14) Abstract classlardan instance uretilmez.
 *
 */

public abstract class Ogretmen {

    public int sayi = 50;
    public String name;

    public Ogretmen() {
        System.out.println("Ogretmen Abstract classi calisti");
    }


    public abstract void dersAnlat();

    public abstract String okulaGel();

    public void normalMethod() {
        System.out.println("Normal method");
    }

    public void sinavYap () {
        System.out.println("""
                Ogretmen sinav yapiyor.
                """);
    }

}
