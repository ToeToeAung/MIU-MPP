package Practice;
import java.util.Collections;
import java.util.List;

public class Painter {
    private List<Integer> childrenAges;
    private String Name;
    private int Age;
    private double Salary;

    public String getName() {
    	return Name;
    }
    
    public int getAge() {
    	return Age;
    }
    
    public double getSalary() {
    	return Salary;
    }
    
    public Integer greatestChildrenAge() {
        if (childrenAges == null || childrenAges.isEmpty()) {
            return null; 
        }
        Integer maxAge = Collections.max(childrenAges);
        return maxAge;
    }
    
    
    private List<Double> costs;

    public Double totalCost() {
        if (costs == null || costs.isEmpty()) {
            return 0.0;
        }
        Double total = 0.0;
        for (Double cost : costs) {
            total += cost;
        }
        return total;
    }
    
    
}