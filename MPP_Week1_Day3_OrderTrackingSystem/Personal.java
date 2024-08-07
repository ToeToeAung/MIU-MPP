package MPP_Week1_Day3_OrderTrackingSystem;

public class Personal extends Customer {
    private String creditRating;
    private String creditCard;

    public Personal(String name, String address, String phone, double points, String creditRating, String creditCard) {
        super(name, address, phone, points);
        this.creditRating = creditRating;
        this.creditCard = creditCard;
    }

    @Override
    public String getCreditRating() {
        return creditRating;
    }
}