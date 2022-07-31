package oop.classlaragiris;

public class Araba {

    //fieldlar
    int tekerlekSayisi = 4;
    int yolcuKapasitesi;
    String marka;
    String renk;
    int model;

    //Methodlar
    public void arabayiCalistir() {
        System.out.println(marka + " markali Araba Calisiyor");
    }

    public void arabayiDurdur() {
        System.out.println(marka + " markali Araba Durdu");
    }


}
