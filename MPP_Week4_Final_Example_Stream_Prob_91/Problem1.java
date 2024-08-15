package MPP_Week4_Final_Example_Stream_Prob_91;

import java.util.stream.Stream;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> oddNumbers= Stream.iterate(1, n -> n+2);
		
		//oddNumbers.forEach(System.out:: println);
		
		Stream<Integer> oddNum= Stream.iterate(9,n-> n+2)
		.limit(4);
		oddNum.forEach(System.out :: println);
				
	}

}
