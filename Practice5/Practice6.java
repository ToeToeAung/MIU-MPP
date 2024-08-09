package Practice5;

import java.util.Optional;

public class Practice6 {
	
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		String result = optional.orElse("Default");

		System.out.println("Result of orElse is "+ result);	
				
		String result1 = optional.orElseGet(Practice6::getDefaultValue);
		System.out.println("Result of orElse is "+ result1);	
	
		
	}
	
	public static String getDefaultValue() {
	    System.out.println("getDefaultValue() called");
	    return "Get Default";
	}

}
