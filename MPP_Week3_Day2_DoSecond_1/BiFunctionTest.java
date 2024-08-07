package MPP_Week3_Day2_DoSecond_1;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f =
			(x,y) -> 2*x - y;
		System.out.println(f.apply(2, 3));  //output: 1
}

}
