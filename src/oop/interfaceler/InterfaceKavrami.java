package oop.interfaceler;

/**
 * 1) Interface'ler genelde birbirleriyle alakali olmayan classlari tek bir cati
 * altinda toplamaya yardimci olur.
 *
 * 2) Interface'ler icerisinde genellikle ici bos methodlar olur.
 * (Java8'den sonra interface'lere ici dolu method tanimi da yapilabilir)
 *
 * 3) Nesne uretilmezler. Anonymous inner class'lar yardimiyla icerisindeki
 * methodlar kullanilabilir.
 *
 * 4) Kendi constructorlari yoktur.
 *
 *
 * 5) İcerisine field tanimlamalari yapilabilir.
 * Ama interface icerisine yapilan her field tanimi inital edilmeli. (yani
 * ilk deger atamasi yapilmali.)
 *
 * 6) Interface'i implemente eden bir class, interface icerisindeki ici
 * bos methodlari override etmek zorundadir.
 *
 *
 * 7) Java'da coklu kalitim yoktur. Ama bir class birden fazla interfacei implemente
 * edebilir. Ve ilgili interface'lerin hepsi icerisindeki ici bos methodlar override
 * edilmek zorunda.
 *
 *
 * 8) Bir interface başka bir interface'i extend eder.
 *
 *
 * 9) Interface'in içerisine tanımlanan fieldlar default olarak
 * public static ve finaldir.
 *
 * 10) Interface'in içerisine yazılan hiç bir method final olamaz (Private Hariç).
 *
 *
 * 11) Java8 ' den sonra gelen yeniliklerle birlikte interfaceler içerisine
 * default - static - private anahtar kelimeleriyle ici dolu method tanimlari
 * yapilabilir.
 *
 *
 * 12) Bir interface başka bir interfacei implemente ettiğinde içerisindeki içi boş
 * methodlari override etmek zorunda değildir.
 *
 * 13) Marker Interfaceler: Icerisinde hiç bir methodun olmadigi interfacelerdir.
 *
 */
public interface InterfaceKavrami {

    public static final String contract = "Contract";


    int topla(int a, int b);


    default void adiniSoyle() {
        System.out.println("Benim adim Furkan");
        method();
    }


    static int cikar(int a, int b) {
        return a - b;
    }


    private String method() {
        return "Private method";
    }


}
