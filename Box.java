public class Box<T, V> {
    private T item;
    Level level;
    private V value;

    public Box(T item) {
        this.item = item;
    }

    public Box(T item, Level level) {
        this.item = item;
        this.level = level;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public <T> void printBoxItem(T value) {
        System.out.println(value);
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
