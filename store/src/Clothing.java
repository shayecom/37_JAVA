public class Clothing extends Product {

    private ClothingSize size;

    public Clothing(ProductType type, String name, double price, int stock, ClothingSize size) {
        super(type, name, price, stock);
        this.size = size;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    @Override
    public double getDiscountPercentage() {
        return 15;
    }

}
