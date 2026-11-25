import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ProductRepository repository = new ProductRepository(products);
        Electronics item = new Electronics(ProductType.ELECTRONICS, "Keyboard", 50.0, 10);
        Clothing clothing = new Clothing(ProductType.CLOTHING, "Pants", 250.0, 2, ClothingSize.M);
        repository.addItem(item);
        repository.addItem(item);
        repository.addItem(item);
        repository.addItem(item);
        repository.addItem(clothing);
        repository.addItem(clothing);
        clothing.decreaseStock(4);
        System.out.println("In stock:" + clothing.getStock());
        System.out.println(repository.getAll());
        Product foundProduct = repository.findById(item.getId());
        System.out.println(foundProduct);
    }
}
