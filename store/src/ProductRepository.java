import java.util.ArrayList;

public class ProductRepository extends Repository<Product> {

    public ProductRepository(ArrayList<Product> items) {
        super(items);
    }

    @Override
    public Product findById(int id) {
        for (Product product : getAll()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
