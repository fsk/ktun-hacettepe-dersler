package oop.encapsulation;

public class PrivateKeyword {

    private String name;
    private String surname;
    private String tcKimlikNumarasi;
    private Adres adres;

    public PrivateKeyword() {

    }

    public void method() {
        name = "aslşdklşakd";
    }


    /**
     * SETTER - GETTER Methodlar
     */

    //ALT + INSERT


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTcKimlikNumarasi() {
        return tcKimlikNumarasi;
    }

    public void setTcKimlikNumarasi(String tcKimlikNumarasi) {
        this.tcKimlikNumarasi = tcKimlikNumarasi;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
