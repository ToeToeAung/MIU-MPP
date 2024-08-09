package MPP_Week3_Day2_Lab_Prob3;

import java.util.stream.Stream;

public class Lab_Prob_3b {

/*	b)  Use reduce to concatenate the Strings in the Stream below to form a single, space-separated String.  Print the result to the console.   
public static void main(String[] args) {
       Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
} */
	
	  public static void main(String[] args) {
	         Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
	         
	         String result=strings.reduce((str1,str2) -> str1 + " "+ str2).orElse("");	         
	         System.out.println(result);	         
	  }

}
