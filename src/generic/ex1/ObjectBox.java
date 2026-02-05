package generic.ex1;

public class ObjectBox {

    private Object value;

    public void set(Object object) { // Object object = (Object) Integer.valueOf(10)
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
