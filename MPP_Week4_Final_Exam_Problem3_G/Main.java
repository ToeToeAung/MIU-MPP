package MPP_Week4_Final_Exam_Problem3_G;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

	 public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Samsung", 700.00));
	        products.add(new Product("Apple", 1200.00));
	        products.add(new Product("Dell", 800.00));
	        products.add(new Product("HP", 900.00));
	        products.add(new Product("LG", 600.00));
	        products.add(new Product("Huawei", 500.00));
	        products.add(new Product("Haier", 400.00));
	        products.add(new Product("Dyson", 300.00));

	        // Step 1: Filter and collect 'D' manufacturers
	        List<Product> dManufacturers = products.stream()
	            .filter(p -> p.getManufacturer().startsWith("D"))
	            .collect(Collectors.toList());

	        // Step 2: Filter and collect 'H' manufacturers
	        List<Product> hManufacturers = products.stream()
	            .filter(p -> p.getManufacturer().startsWith("H"))
	            .collect(Collectors.toList());

	        // Step 3: Filter and collect the rest of the manufacturers
	        List<Product> otherManufacturers = products.stream()
	            .filter(p -> !p.getManufacturer().startsWith("D") && !p.getManufacturer().startsWith("H"))
	            .collect(Collectors.toList());

	        // Step 4: Concatenate all lists
	        List<Product> finalList = new ArrayList<>();
	        finalList.addAll(dManufacturers);
	        finalList.addAll(hManufacturers);
	        finalList.addAll(otherManufacturers);

	        // Step 5: Use one System.out.println to print all products
	        System.out.println(finalList.stream()
	            .map(Product::toString)
	            .collect(Collectors.joining(","))); 
	        
	        
	      

	    }

}
