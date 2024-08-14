package MPP_Week4_Final_Exam_Problem3_G;

class Product {
    private String manufacturer;
    private double price;

    public Product(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [Manufacturer=" + manufacturer + ", Price=" + price + "]";
    }
}
