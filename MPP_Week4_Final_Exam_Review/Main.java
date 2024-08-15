package MPP_Week4_Final_Exam_Review;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
    Customer c1= new Customer("Customer");
    BankAccount b1= new BankAccount("BK0001",400000.0,c1);
    System.out.println(b1.toString());

   
    BankAccount b2 = b1.clone();
    System.out.println(b2.toString());

 
    System.out.println(b1.equals(b2)); 

    System.out.println(b1.hashCode() == b2.hashCode()); 


    b2.c1.name = "Test";
    System.out.println(b1.toString());
    System.out.println(b2.toString());

    System.out.println(b1.equals(b2)); 

	}

}
