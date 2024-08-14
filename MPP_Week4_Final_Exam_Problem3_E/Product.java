package MPP_Week4_Final_Exam_Problem3_E;

import java.util.List;
import java.util.ArrayList;

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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [Manufacturer=" + manufacturer + ", Price=" + price + "]";
    }
}