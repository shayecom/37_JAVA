public abstract class Storage<T> {

    private T item;

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public abstract void printDetails();

}
