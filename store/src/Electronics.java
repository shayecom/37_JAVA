public class Electronics extends Product {

    public Electronics(ProductType type, String name, double price, int stock) {
        super(type, name, price, stock);
    }

    @Override
    public double getDiscountPercentage() {
        return 10;
    }
}
