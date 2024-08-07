package MPP_Week1_Day3_OrderTrackingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private List<Product> productList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {       
        Product product1 = new Product("Laptop", "ORD001", 1000);
        Product product2 = new Product("Headphones", "ORD002", 200);
        productList.add(product1);
        productList.add(product2);

        Order order = new Order("001", true, 0, new Date(), "Processing");
        OrderLine orderLine1 = new OrderLine(1, 1000, "Shipped", new Date(), 10, product1);
        OrderLine orderLine2 = new OrderLine(2, 200, "Shipped", new Date(), 5, product2);
        order.addOrderLine(orderLine1);
        order.addOrderLine(orderLine2);
        orderList.add(order);

        System.out.println("Total Price of Order 001: $" + order.getTotalPrice());
    }
}
