package MPP_Week3_Day2_Lab_Prob3;

import java.util.Arrays;
import java.util.List;

public class Lab_Prob_3a {
    public int countWords(List<String> words, char c, char d, int len)  {    	
	return (int) words.stream()
	.filter(w -> w.length() == 12)
	.filter(w -> w.contains(""+'c'))
	.filter(w -> !w.contains(""+'d'))	
	.count();
    }    
    
    public static void main(String[] args) {
    	
    	Lab_Prob_3a p3a = new Lab_Prob_3a();

      
         List<String> words1 = Arrays.asList("Accomplished", "Appreciative", "Abandonments", "Breathtaking", "Contributors");
         char c1 = 'c';
         char d1 = 'd';
         int len1 = 12;
         int result1 = p3a.countWords(words1, c1, d1, len1);
         System.out.println("Test result: " + result1); 

    	    	
    }
}
