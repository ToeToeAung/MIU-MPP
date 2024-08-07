package MPP_Week3_Day2_DoSecond_1;
import java.util.function.*;

public class TriFunctionTest1 {

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> f =
			(x,y, z) -> x + y + z;
		System.out.println(f.apply(2, 3, 4));  
}
}
