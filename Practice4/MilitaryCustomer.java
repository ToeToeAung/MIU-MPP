package Practice4;

public class MilitaryCustomer extends ACustomer{
	private String name;
	private String uniform;
	 public MilitaryCustomer(String name, String uniform) {
	        this.name = name;
	        this.uniform = uniform;
	    }

	    @Override
	    public void printDetails() {
	        System.out.println("Name: " + name + ", Uniform: " + uniform);
	    }
}
