package MPP_Week1_Day2_Lab3_Prob1;

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
      
    public void print() {
        System.out.println("Department: " + name + " Department Location: "+ location);
        for (Position position : positions) {
            position.print();
        }
    }
}