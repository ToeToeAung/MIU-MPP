package MPP_Week4_Final_Exam_Problem3_G_1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

	 public static void main(String[] args) {
	        List<Product> arr1 = new ArrayList<>();
	        arr1.add(new Product("Samsung", 700.00));
	        arr1.add(new Product("Apple", 1200.00));
	        arr1.add(new Product("Dell", 800.00));
	        arr1.add(new Product("HP", 900.00));
	        arr1.add(new Product("LG", 600.00));
	        arr1.add(new Product("Huawei", 500.00));
	        arr1.add(new Product("Haier", 400.00));
	        arr1.add(new Product("Dyson", 300.00));
	        
	        List<Product> sortedProducts = Stream.concat(
		                Stream.concat(
		                    arr1.stream().filter(p -> p.getManufacturer().startsWith("D")),
		                    arr1.stream().filter(p -> p.getManufacturer().startsWith("H"))
		                ),
	                arr1.stream().filter(p -> !p.getManufacturer().startsWith("D") && !p.getManufacturer().startsWith("H"))
	        		)
	        		.collect(Collectors.toList());

	        System.out.println(sortedProducts);
	     
	    }

}
