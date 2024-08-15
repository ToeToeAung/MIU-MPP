package MPP_Week4_Final_Exam_Problem3_J;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

	 public static void main(String[] args) {
	        List<Product> arr1 = new ArrayList<>();
	        arr1.add(new Product("PD001","Samsung","Samsung", 700.00));
	        arr1.add(new Product("PD002","Apple","Apple", 1200.00));
	        arr1.add(new Product("PD003","Dell","Dell", 800.00));
	        arr1.add(new Product("PD004","HP", "HP",900.00));
	        arr1.add(new Product("PD005","LG","LG", 600.00));
	        arr1.add(new Product("PD006","Huawei","Huawei", 500.00));
	        arr1.add(new Product("PD007","Haier","Haier", 400.00));
	        arr1.add(new Product("PD008","Dyson","Dyson", 300.00));
	     // i) We have a String reference S2. Create one string of All the products in the arraylist, where each product inside the one string is separated by "***"(the delimiter). Assign this one string to S2.
	      //  Assume that Product has a good toString method.

	        String s2 = arr1.stream()
	                .map(Product::toString)
	                .collect(Collectors.joining("***"));
	            System.out.println("Products String: " + s2);

	       
	    }

}
