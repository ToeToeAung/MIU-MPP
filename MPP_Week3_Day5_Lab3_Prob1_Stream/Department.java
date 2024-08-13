package MPP_Week3_Day5_Lab3_Prob1_Stream;

import java.util.List;
import java.util.ArrayList;

class Department {
    private String name;
    private String location;
    private List<Position> positions;

    public Department(String name,String location) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public String getLocation() {
    	return location;
    }
    
    public void addPosition(Position p) {
    	positions.add(p);
    }
      
	/*
	 * public double getSalary() { double totalSalary=0.0; for (Position position :
	 * positions) { totalSalary += position.getSalary(); } return totalSalary; }
	 */
    public double getSalary() {
    	return positions.stream()
    			.mapToDouble(Position :: getSalary)
    			.sum();
    }
    
	/*
	 * public void print() { System.out.println("Department: " + name +
	 * " Department Location: "+ location); for (Position position : positions) {
	 * position.print(); } }
	 */
    
    public void print() {
    	 System.out.println("Department: " + name + " Department Location: "+ location);
    	 positions.forEach(Position :: print);
    	 
    }
}