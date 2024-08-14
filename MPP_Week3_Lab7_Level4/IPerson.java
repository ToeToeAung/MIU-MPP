package MPP_Week3_Lab7_Level4;

interface IPerson {	  
	    default void myDefault() {
	        System.out.println("From default method.");
	    }
	   
	    static void myStatic() {
	        System.out.println("From static method.");
	    }

	    void myAbstract();
}
