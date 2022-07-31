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
 */
public class Insan {

    String ad;
    String soyad;
    char cinsiyet;
    int yas;

    public Insan() {
        System.out.println("Insan Constructor methodu calisti.");
    }
}
