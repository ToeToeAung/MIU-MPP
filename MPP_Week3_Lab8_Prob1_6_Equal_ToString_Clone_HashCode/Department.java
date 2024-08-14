package MPP_Week3_Lab8_Prob1_6_Equal_ToString_Clone_HashCode;

import java.util.List;
import java.util.Objects;
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
    
    @Override
    public boolean equals(Object obj) {
    	if(this == obj) return true;
    	if(getClass()!= obj.getClass()) return true;
    	Department d=(Department) obj;
    	return name.equals(d.name) && location.equals(d.location);
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(name,location);
    }
    
    @Override
    public String toString() {
    	return "Department name : " + this.name + ", Department Location: " + this.location;
    }
}