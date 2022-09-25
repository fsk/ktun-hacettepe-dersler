package oop.abstractions;

public class MatematikOgretmeni extends Ogretmen {
    @Override
    public void dersAnlat() {
        System.out.println("""
                Matematik Hocasi dersi
                materyallerle anlatiyor.
                """);
    }

    @Override
    public String okulaGel() {
        return null;
    }
}
