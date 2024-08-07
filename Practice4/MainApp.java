package Practice4;
import java.util.List;
import java.util.ArrayList;

public class MainApp {
    private List<ICustomer> customers;

    public MainApp() {
        customers = new ArrayList<>();
    }
 
    public void addCustomer(ICustomer customer) {
        customers.add(customer);
    }
 
    public void printMilitaryCustomers() {
        for (ICustomer customer : customers) {
            customer.printDetails();
        }
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();       
        app.addCustomer(new MilitaryCustomer("Army", "Camouflage"));
        app.addCustomer(new MilitaryCustomer("Navy", "Blue Uniform"));

        app.printMilitaryCustomers();
    }
}
