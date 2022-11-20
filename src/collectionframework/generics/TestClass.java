package collectionframework.generics;

public class TestClass<T> {

    T val;
    TestClass(T val) {
        this.val = val;
    }

    public T getValue() {
        return this.val;
    }

}
