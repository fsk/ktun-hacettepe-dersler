package collectionframework.generics;

public class Student {

    String name;
    String surname;

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void getStudentName() {
        System.out.println(this.name);
    }
}
