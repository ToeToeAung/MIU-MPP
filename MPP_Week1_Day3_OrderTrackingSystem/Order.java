package MPP_Week1_Day3_OrderTrackingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private boolean prepaid;
    private double orderPrice;
    private Date orderDate;
    private String status;
    private List<OrderLine> orderLines = new ArrayList<>();
    private double customerPoints;

    public Order(String orderNumber, boolean prepaid, double orderPrice, Date orderDate, String status) {
        this.orderNumber = orderNumber;
        this.prepaid = prepaid;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.status = status;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (OrderLine line : orderLines) {
            total += line.computePrice();
        }
        return total;
    }

    public boolean getPrepaid() {
        return prepaid;
    }

    public double getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(double points) {
        this.customerPoints = points;
    }

    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
    }
}
