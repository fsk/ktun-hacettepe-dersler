package oop.mirasalma;


/**
 * -> Javada bir class sadece bir tane classı extend alabilir.
 * -> Butun class'lar javada Object sınıfından turemistir. Bir baska degisle
 * Java'daki butun classlar object classının alt classıdır.
 * -> Java'da miras alınan classlar arasındaki calisma hiyerarsisis en ust class'tan en asagı class'a dogrudur.
 *
 */
public class Main {

    public static void main(String[] args) {

        Dede instance = new Dede();

        instance.sacRengi = "Siyah";
        instance.gozRengi = "Kahverengi";
        //instance.arabaSur();
        System.out.println("---------");
        Baba instance2 = new Baba();
        instance2.gozRengi = "Mavi";
        instance2.ayakNumarasi = 40;

    }
}
