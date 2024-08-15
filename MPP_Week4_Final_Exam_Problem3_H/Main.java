package MPP_Week4_Final_Exam_Problem3_H;
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
	     // h) Save to a list, all of the Product objects, but if the manufacturer begins with the letters "St", then capitalize all of the manufacturer's name. For this problem you can Not change the original data. We do not
	        //want to change the original data.

	        List<Product> modifiedList = arr1.stream()
	                .map(p -> {
	                    if (p.getManufacturer().startsWith("St")) {
	                        return new Product(p.getId(), p.getDescription(),p.getManufacturer().toUpperCase(), p.getPrice());
	                    }
	                    return p;
	                })
	                .collect(Collectors.toList());

	        System.out.println(modifiedList);
	     
	    }

}
