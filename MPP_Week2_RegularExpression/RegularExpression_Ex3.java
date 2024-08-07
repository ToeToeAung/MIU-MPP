package MPP_Week2_RegularExpression;

public class RegularExpression_Ex3 {

	public static void main(String[] args) {		
		String originalText, modifiedText;	
		/*3)  Replace every occurrence of  8  with  ‘eight’. */
		originalText="783938288";
		modifiedText = originalText.replaceAll("8","eight");		
		System.out.println("Output to replace every occurrence of 8 with  'eight' "+ modifiedText);	
	}
}
