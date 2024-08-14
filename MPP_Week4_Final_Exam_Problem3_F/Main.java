package MPP_Week4_Final_Exam_Problem3_F;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Product> arr1 = new ArrayList<>();
        arr1.add(new Product("LG", 600.00));
        arr1.add(new Product("Apple", 1200.00));
        arr1.add(new Product("Lenovo", 700.00));
        arr1.add(new Product("Dell", 800.00));
        arr1.add(new Product("Samsung", 900.00));

        // Step 1: Sort the products whose manufacturer starts with 'L'
        List<Product> sortedLManufacturers = arr1.stream()
            .filter(p -> p.getManufacturer().startsWith("L"))
            .sorted(Comparator.comparing(Product::getManufacturer))
            .collect(Collectors.toList());

        // Step 2: Collect the remaining products (not starting with 'L') without sorting
        List<Product> nonLManufacturers = arr1.stream()
            .filter(p -> !p.getManufacturer().startsWith("L"))
            .collect(Collectors.toList());

        // Step 3: Print the sorted 'L' products followed by the unsorted others
        sortedLManufacturers.forEach(System.out::println);
        nonLManufacturers.forEach(System.out::println);
    }
}