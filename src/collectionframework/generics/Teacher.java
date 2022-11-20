package collectionframework.generics;

public class Teacher {

    String name;
    String surname;

    public Teacher() {

    }

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public void getTeacherName() {
        System.out.println(this.name);
    }
}
