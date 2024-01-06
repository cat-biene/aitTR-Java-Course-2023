package practice.json_wrapper;

public class JsonWrapper2 <T> {

    // fields
    private T value;

    // constructor
    public JsonWrapper2(T value) {
        this.value = value;
    }

    //getter
    public T getValue() {
        return value;
    }

    // toString

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
