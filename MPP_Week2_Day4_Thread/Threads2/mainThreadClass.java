package MPP_Week2_Day4_Thread.Threads2;


public class mainThreadClass {

    public static void main( String[] args ) {

        System.out.println("Inside main  ");   
        int i;
        for (i = 1; i <= 10; i++ )
        {
           PrimeThread p = new PrimeThread(i);
           p.start();
        }

    }
}
