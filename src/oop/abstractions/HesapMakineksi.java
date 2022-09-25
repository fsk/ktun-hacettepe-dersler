package oop.abstractions;

public abstract class HesapMakineksi {

    public abstract int topla(int a, int b);

    public int cikar(int a, int b) {
        return a - b;
    }

    public int carp(int a, int b) {
        return a * b;
    }

}
