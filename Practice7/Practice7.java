package Practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Practice7 {
	 public static ArrayList<String> combine(Stream<ArrayList<String>> stream) {
	        return stream.reduce(new ArrayList<>(), (list1, list2) -> {
	            list1.addAll(list2);
	            return list1;
	        });
	    }

	    public static void main(String[] args) {
	        Stream<ArrayList<String>> stream = Stream.of(
	            new ArrayList<>(List.of("Hello", "there")),
	            new ArrayList<>(List.of("goodbye", "again"))
	        );

	        ArrayList<String> combinedList = combine(stream);
	        System.out.println(combinedList); // Output: [Hello, there, goodbye, again]
	    }
}
