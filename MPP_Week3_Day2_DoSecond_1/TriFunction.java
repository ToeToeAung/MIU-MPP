package MPP_Week3_Day2_DoSecond_1;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);  
} 
