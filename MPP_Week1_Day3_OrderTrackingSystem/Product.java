package MPP_Week1_Day3_OrderTrackingSystem;

public class Product implements IProduct {
    protected String description;
    protected String productNumber;
    protected double price;

    public Product(String description, String productNumber, double price) {
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}