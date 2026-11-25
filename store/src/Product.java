public abstract class Product implements Discount {

    private static int nextId = 1000;

    private final int id;
    private ProductType type;
    private String name;
    private double price;
    private int stock;

    public Product(ProductType type, String name, double price, int stock) {
        if (price < 0 || stock <= 0) {
            throw new IllegalArgumentException("Invalid price or stock");
        }
        this.id = nextId++;
        this.type = type;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Product.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void decreaseStock(int quantity) {
        if (quantity <= 0 || quantity > stock) {
            throw new IllegalArgumentException("Insufficient stock or invalid quantity");
        }
        stock -= quantity;
    }

    @Override
    public abstract double getDiscountPercentage();

    @Override
    public final double calcFinalPrice() {
        return price - (price * getDiscountPercentage() / 100);
    }

    @Override
    public String toString() {
        return id + " " + type + " " + name + " " + price + " " + stock + calcFinalPrice();
    }

}
