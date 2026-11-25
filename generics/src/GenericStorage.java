public class GenericStorage<T> extends Storage<T> {

    public GenericStorage(T item) {
        super(item);
    }

    @Override
    public void printDetails() {
        System.out.println("Generic: " + getItem());
    }
}
