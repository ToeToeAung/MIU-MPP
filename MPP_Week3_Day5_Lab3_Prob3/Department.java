package MPP_Week3_Day5_Lab3_Prob3;

import java.util.List;
import java.util.ArrayList;

class Department {
    private String name;
    private String location;
    private Position head;
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
    
    public void setHead(Position head) {
    	this.head = head;
    }
    
    public Position getHead() {
    	return this.head;
    }
    
    public void addPosition(Position p) {
    	positions.add(p);
    }
      
    public Position getDepartmentHead() {
        for (Position position : positions) {
            if (position.getUpperLine() == null || !positions.contains(position.getUpperLine())) {
                return position;
            }
        }
        return null;
    }
    
    public double getSalary() {
    	double totalSalary=0.0;
    	 for (Position position : positions) {
    		 totalSalary += position.getSalary();
    	 }
    	return totalSalary;
    } 
        
    public void printReportingHierarchy() {
    	System.out.println("Department: " + name);     
        for (Position position : positions) {
            position.printDownLines();
        }
    }
}

