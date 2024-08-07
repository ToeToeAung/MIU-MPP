package MPP_Week1_Day3_OrderTrackingSystem;

public class Corporate extends Customer {
    private String creditRating;
    private double creditLimit;

    public Corporate(String name, String address, String phone, double points, String creditRating, double creditLimit) {
        super(name, address, phone, points);
        this.creditRating = creditRating;
        this.creditLimit = creditLimit;
    }

    @Override
    public String getCreditRating() {
        return creditRating;
    }

    public void generateMonthlyBill() {
        // Implementation here
    }
}