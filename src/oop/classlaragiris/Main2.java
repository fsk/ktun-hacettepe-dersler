package oop.classlaragiris;

public class Main2 {

    public static void main(String[] args) {

        //ClassName instance = new ClassName();
        Araba bmw = new Araba();
        bmw.renk = "Mat Siyah";
        //bmw.tekerlekSayisi = 4;
        bmw.yolcuKapasitesi = 5;
        bmw.marka = "BMW";
        bmw.model = 2022;


        System.out.println(bmw.marka);
        System.out.println(bmw.renk);
        System.out.println(bmw.tekerlekSayisi);
        System.out.println(bmw.yolcuKapasitesi);
        System.out.println(bmw.model);

        bmw.arabayiCalistir();
        bmw.arabayiDurdur();


        System.out.println("------------------");

        Araba mercedes = new Araba();
        mercedes.model = 2022;
        mercedes.marka = "Mercedes";
        //mercedes.tekerlekSayisi = 4;
        mercedes.renk = "Gri";
        mercedes.yolcuKapasitesi = 5;

        System.out.println(mercedes.model);
        System.out.println(mercedes.marka);
        System.out.println(mercedes.renk);
        System.out.println(mercedes.tekerlekSayisi);
        System.out.println(mercedes.yolcuKapasitesi);

        mercedes.arabayiCalistir();
        mercedes.arabayiDurdur();



        //int number;
        //Araba degisken = null;
        //degisken.model = 2021;
        //System.out.println(degisken.model);


    }
}
