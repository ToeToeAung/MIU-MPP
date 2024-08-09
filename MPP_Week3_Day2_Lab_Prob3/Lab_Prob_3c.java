package MPP_Week3_Day2_Lab_Prob3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lab_Prob_3c {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("orange", "grape", "cherry", "lemon", "lime", "grape");
		   
	    Stream<String> wordStream = words.stream();
	    Optional<String> firstWord = wordStream.findFirst();	    
	    firstWord.ifPresent(word -> System.out.println("First word is "+ word));
	   // System.out.println("First Word is "+ firstWord);	    
	    
	    wordStream = words.stream();
	    Optional<String> anyWord = wordStream.findAny();	    
	    anyWord.ifPresent(word -> System.out.println("Any word is "+ word));    
	    
	    wordStream =words.stream();
	    Optional<String> optionalWord= words.stream()
	    		.filter(w -> w.startsWith("a"))
	    		.findFirst();
	    
	   String optionalResult=  optionalWord.orElse("No word found starting with 'a' character.");
	   System.out.println("Optional Word starting with a : "+ optionalResult);
	    
	}    
}
