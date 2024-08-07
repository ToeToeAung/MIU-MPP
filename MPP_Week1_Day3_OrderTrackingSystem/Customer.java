package MPP_Week1_Day3_OrderTrackingSystem;

public abstract class Customer implements ICustomer {
    protected String name;
    protected String address;
    protected String phone;
    protected double points;

    public Customer(String name, String address, String phone, double points) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.points = points;
    }

    @Override
    public abstract String getCreditRating();
}
