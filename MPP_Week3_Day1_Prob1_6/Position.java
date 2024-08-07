package MPP_Week3_Day1_Prob1_6;

import java.util.Date;
import java.util.Objects;

public class Position implements Cloneable{
    private String title;
    private String description;
    private Employee employee;
    public Position(String title,String description) {
        this.title = title;
        this.description = description;
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
    
    
    public void print() {
    	 System.out.print("Position: " + title + " Description: "+ description);
         if (employee != null) {
             System.out.println(", Employee: " + employee.getName());
         } else {
             System.out.println(", Employee: NA");
         }
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(this == obj) return true;
    	if(getClass() != obj.getClass()) return false;
    	Position p= (Position) obj;
    	return title.equals(p.title) && description.equals(p.description);
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(title,description);
    }
    
    @Override
    public String toString() {
    	return "Employee Position Title: " + this.title + " , Description: "+ this.description;
    }
       
    public Object clone() throws CloneNotSupportedException{
    	Position positionCopy= (Position) super.clone();
    	if(this.employee != null) {
    		positionCopy.employee = (Employee) this.employee.clone();
    	}
       	return positionCopy;
    	}
}