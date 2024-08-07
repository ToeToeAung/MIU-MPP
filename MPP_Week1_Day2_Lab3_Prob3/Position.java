package MPP_Week1_Day2_Lab3_Prob3;
import java.util.List;
import java.util.ArrayList;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private Position upperLine;
    private List<Position> downlines;
    public Position(String title,String description) {
        this.title = title;
        this.description = description;
        this.downlines = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setEmployee(Employee employee) {    
    	this.employee=employee;
    }
    
    public Employee getEmployee() {
    	return this.employee;
    }    
    
    public double getSalary() {
    	if(employee!=null) {
    		return employee.getSalary();
    	}else {
    		return 0.0;
    	}    
    }
    
    public void setUpperLine(Position position) {
       this.upperLine=position;
    }
    
    public Position getUpperLine() {
    	return upperLine;
    }
    
    public void addDownlines(Position downline) {
    	downline.setUpperLine(this);
    	downlines.add(downline);
    }
    
    public List<Position> getDownlines(){
    	return downlines;
    }
    
    public boolean isManager() {
    	return !downlines.isEmpty();
    }
    
   /*
    public void printDownLines(String indent) {
        System.out.print(indent);
       // print();
        System.out.println();
        for (Position downline : downlines) {
        	downline.printDownLines(indent + "  ");
        }
    }*/
    
        
    public void printDownLines() {
        if (employee != null) {
            System.out.println("  Position: " + title + " - " + employee.getName());
        } else {
            System.out.println("  Position: " + title + " - [Unfilled]");
        }
    }
    
   /* public void print() {
    	 System.out.print("Position: " + title + " Description: "+ description);
         if (employee != null) {
             System.out.println(", Employee: " + employee.getName());
         } else {
             System.out.println(", Employee: NA and Salary : 0.0");
         }
    } */
}