public class TextStorage extends Storage<String> {

    public TextStorage(String item) {
        super(item);
    }

    @Override
    public void printDetails() {
        System.out.println("Text: " + getItem());
    }
}
