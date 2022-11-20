package collectionframework.generics;

public class MathStudent extends Student{

    String mathTopic;

    public MathStudent() {
    }

    public MathStudent(String mathTopic) {
        this.mathTopic = mathTopic;
    }

    public MathStudent(String name, String surname, String mathTopic) {
        super(name, surname);
        this.mathTopic = mathTopic;
    }

    public void getMathTopic() {
        System.out.println(this.mathTopic);
    }
}
