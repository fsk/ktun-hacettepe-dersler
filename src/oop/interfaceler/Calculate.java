package oop.interfaceler;


/**
 * -- Functional Interfaceler --
 * interfacein icerisinde sadece bir tane ici bos method var ise o interface
 * funtional interfacedir.
 */
@FunctionalInterface
public interface Calculate {

    int topla(int a, int b);

    //private - static - default
}
