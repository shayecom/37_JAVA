import java.util.ArrayList;

public abstract class Repository<T> {
    private ArrayList<T> items;

    public Repository(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void removeItem(T item) {
        this.items.remove(item);
    }

    public ArrayList<T> getAll() {
        return new ArrayList<>(items);
    }

    public void printAll() {
        for (T item : getAll()) {
            System.out.println(item);
        }
    }

    public abstract T findById(int id);

}
