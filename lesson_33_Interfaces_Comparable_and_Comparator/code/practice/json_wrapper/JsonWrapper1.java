package practice.json_wrapper;

// имя: Леонид, возраст: 59 - это данные в одной программе
// {name: leonid, age: 59} - это Json, который передают другой программе и она его может "прочитать" (parsing)

public class JsonWrapper1 {

    // fields
    private Object value;

    // constructor
    public JsonWrapper1(Object value) {
        this.value = value;
    }

    //getter
    public Object getValue() {
        return value;
    }

    // toString
    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
