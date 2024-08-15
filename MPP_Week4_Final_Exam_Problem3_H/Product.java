package MPP_Week4_Final_Exam_Problem3_H;

class Product {
	private String productID;
    private String manufacturer;
    private String description;
    private double price;
    

    public Product(String manufacturer,String productID,String description, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.description=description;
        this.productID=productID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
    
    public String getDescription() {
        return description;
    }
    

    public String getId() {
        return productID;
    }


    @Override
    public String toString() {
        return "Product [Manufacturer=" + manufacturer + ", Price=" + price + "]";
    }
}
