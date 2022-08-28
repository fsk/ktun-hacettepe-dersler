package oop.constructors;

/**
 * Constructor Method
 * 1) Biz yazsak da, yazmasak da constructor method java tarafından
 * otomatik olarak olusturulur.
 * 2) Constructor methodlar class adlariyla ayni olmak zorunda.
 * 3) Geriye deger dondurmezler. (Void de degildir.)
 * 4) Bir classta birden fazla constructor method olabilir.
 * 5) Genellikle publictir.
 * 6) Bir classin instancei cagrildiginda ilk tetiklenen yerdir.
 * Dolu Constructor: Parametre alan constructor
 * Bos Constrcutor: Parametre almayan constructor
 *
 *
 * Method Overloading: Aynı isimdeki methodların
 * farklı parametrelerce ya da farklı dönüş tipleri ile
 * kullanılması.
 */
public class Insan {

    String ad;
    String soyad;
    String sehir;
    char cinsiyet;
    int yas;

    //public Insan() {
    //    System.out.println("Insan Constructor methodu calisti.");
    //}

    /*public Insan(String isim, String soyisim) {
        System.out.println("Dolu Constructor Calisti");
        if (isim.length() < 2) {
            System.out.println("Yanlis isim girdiniz.");
        }
        ad = isim;
        soyad = soyisim;
    }*/

    public Insan(char cinsiyet, String sehir) {
        this.cinsiyet = cinsiyet;
        this.sehir = sehir;
    }

    // ALT + INSERT

    public Insan(String ad, String soyad, String sehir, char cinsiyet, int yas) {
        this(ad, soyad, yas);
        this.sehir = sehir;
        this.cinsiyet = cinsiyet;
        System.out.println("-- Butun parametreleri alan constructor --");
    }

    public Insan(String ad, int yas) {
        System.out.println("-- Ad ve Yas parametrelerini alan --");
        this.ad = ad;
        this.yas = yas;
    }

    public Insan(String ad, String soyad, int yas) {
        this(ad, yas);
        this.soyad = soyad;
        System.out.println("-- Ad, Soyad ve Yas parametrelerini alan --");
    }


    public Insan() {
        System.out.println("Bos Constructor");
    }
}
