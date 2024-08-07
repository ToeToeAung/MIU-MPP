package MPP_Week1_Day3_OrderTrackingSystem;

import java.util.Date;

public class OrderLine {
    private int quantity;
    private double price;
    private String status;
    private Date shipDate;
    private double points;
    private Product product;

    public OrderLine(int quantity, double price, String status, Date shipDate, double points, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.shipDate = shipDate;
        this.points = points;
        this.product = product;
    }

    public double computePrice() {
        return quantity * product.getPrice();
    }

    public double computePoints() {
        return points;
    }
}
