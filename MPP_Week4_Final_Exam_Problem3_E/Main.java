package MPP_Week4_Final_Exam_Problem3_E;

import java.util.ArrayList;
import java.util.List;

public class Main {

	 public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Dell", 800.00));
	        products.add(new Product("Apple", 1200.00));
	        products.add(new Product("Samsung", 700.00));
	        products.add(new Product("Dyson", 300.00));
	        products.add(new Product("LG", 600.00));

	        // Stream pipeline to capitalize manufacturer names starting with 'D' and print the products
	        products.stream()
	            .map(product -> {
	                if (product.getManufacturer().startsWith("D")) {
	                    product.setManufacturer(product.getManufacturer().toUpperCase());
	                }
	                return product;
	            })
	            .forEach(System.out::println);
	    }
}
