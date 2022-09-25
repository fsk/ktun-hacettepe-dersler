package oop.abstractions;

public class TurkceOgretmeni extends Ogretmen {
    @Override
    public void dersAnlat() {
        System.out.println("""
                Turkce Hocasi dersi
                akilli tahta uzerinde anlatiyor.
                """);
    }

    @Override
    public String okulaGel() {
        return null;
    }
}
