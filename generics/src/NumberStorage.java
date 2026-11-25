public class NumberStorage extends Storage<Integer> {

    public NumberStorage(Integer item) {
        super(item);
    }

    @Override
    public void printDetails() {
        System.out.println("Number: " + getItem());
    }
}
