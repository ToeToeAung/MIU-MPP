package MPP_Week4_Final_Exam_Problem3_I;
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
	      /*j.  Print out All of the Product objects. 
	       * You need to capitalize the third character of the data
	       *  member description, inside every object. If the description
	       *   has less than three characters, do not change that description.
	       *    You MUST change the original list! 
	       *    You are printing out the whole object, but the descriptions 
	       *    will change as the below example shows. It is just one example below.
	        ("Belt", "Computer", "abc", "ab", "a", "ca234ab"}
	        Original descriptions for example
	        Changed descriptions for example
	        ("BeLt", "CoMputer", "abc", "ab", "a", "ca234ab"} */
	        arr1.stream()
	        .forEach(p -> {
	            String description = p.getDescription();
	            if (description.length() > 2) {
	                description = description.substring(0, 2) + Character.toUpperCase(description.charAt(2)) + description.substring(3);
	                p.setDescription(description);  // Update the description in the original object
	            }
	        });

	  
	    System.out.println(arr1.stream()
	        .map(Product::toString)
	        .collect(Collectors.joining("\n")));	       
	    }

}
