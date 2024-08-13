package MPP_Week3_Day5_Lab3_Prob3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {

	public static void main(String[] args) {			

        Position topExecutive = new Position("Top Executive of the Company", "Top Excetive of the Company");
		  Company company = new Company("Microsoft Company");
		  company.setTopExecutive(topExecutive);
	    
	        // Create departments for Microsoft
	        Department salesDepartment = new Department("Sales department", "Building A");
	        Department marketingDepartment = new Department("Marketing department", "Building B");

	        
	        LocalDate dateOfBirth1 = LocalDate.parse("1960-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
	        Employee lyle=new Employee(1,"Lyle", "","",dateOfBirth1,"SSN1",100000);	  
	        
	        LocalDate dateOfBirth2 = LocalDate.parse("1960-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
	        Employee anne=new Employee(2,"Anne", "","",dateOfBirth2,"SSN2",13000);	
	        
	        LocalDate dateOfBirth3 = LocalDate.parse("1980-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
	        Employee ron=new Employee(3,"Ron", "","",dateOfBirth3,"SSN3",13000);
	        
			LocalDate dateOfBirth4 = LocalDate.parse("1980-02-02", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee stan=new Employee(4,"Stan", "","",dateOfBirth4,"SSN4",9500);	
			
			LocalDate dateOfBirth5= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee peter=new Employee(5,"Peter", "","",dateOfBirth5,"SSN5",9500);
			
			LocalDate dateOfBirth6= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee tom=new Employee(6,"Tom", "","",dateOfBirth6,"SSN6",6500);
						
			LocalDate dateOfBirth7= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee sue=new Employee(7,"Sue", "","",dateOfBirth7,"SSN7",6500);
			
			LocalDate dateOfBirth8= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee marc=new Employee(8,"Marc", "","",dateOfBirth8,"SSN8",6500);
			
			LocalDate dateOfBirth9= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee bill=new Employee(9,"Bill", "","",dateOfBirth9,"SSN9",6500);
			
			LocalDate dateOfBirth10= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee dan=new Employee(10,"Dan", "","",dateOfBirth10,"SSN8",6500);
			
			LocalDate dateOfBirth11= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
			Employee gary=new Employee(11,"Gary", "","",dateOfBirth10,"SSN8",13000);
			
	        Position salesDeptHead = new Position("Sales Department Head", "Head of Sales Department");
	        Position salesManager1 = new Position("Sales Manager I", "Manages Sales");
	        Position salesManager2 = new Position("Sales Manager II", "Manages Sales");
	        
	        Position salseAssistantMgr1 = new Position("Sales Assistant", "Assists Sales Manager");	        
	        Position salseAssistantMgr2 = new Position("Sales Assistant", "Assists Sales Manager");	  
	        Position salseAssistantMgr3 = new Position("Sales Assistant", "Assists Sales Manager");	  
	        Position salseAssistantMgr4 = new Position("Sales Assistant", "Assists Sales Manager");	  
	        Position salseAssistantMgr5 = new Position("Sales Assistant", "Assists Sales Manager");	
	        
	        topExecutive.addDownlines(salesDeptHead);
	        salesDeptHead.addDownlines(salesManager1);
	        salesDeptHead.addDownlines(salesManager2);
	        
	        salesManager1.addDownlines(salseAssistantMgr1);	 	 
	        salesManager1.addDownlines(salseAssistantMgr2);	 	
	        salesManager1.addDownlines(salseAssistantMgr3);	 
	        
	        salesManager2.addDownlines(salseAssistantMgr4);	 	
	        salesManager2.addDownlines(salseAssistantMgr5);	 
	        
			
	        Position marketingDepthead = new Position("Marketing Department Head", "Head of Marketing Department");
	        Position marketingManager = new Position("Marketing Manager", "Manages Marketing");
	        Position marketingAssistantMgr = new Position("Marketing Assistant", "Assists Marketing Manager");
	        topExecutive.addDownlines(marketingDepthead);
	        marketingDepthead.addDownlines(marketingManager);
	        marketingManager.addDownlines(marketingAssistantMgr);
	           
	    	//   System.out.println("Top Executive: " + company.getTopExecutive().getDescription());
	    	/*  Assume the following Hierarchy.  Create All necessary objects to implement this hierarchy.
		    In the Sales department :  Tom works for Stan.  Sue works for Stan.  Marc works for Stan.  
		                                             Bill works for Peter.  Dan works for Peter.  
		                                             Stan works for the Dept. head Ron.  Peter works for the Dept. head Ron.  
		  In the Marketing department :  Gary works for Anne.  Anne is  the Dept. head.
		  The top executive is Lyle. */		  
			topExecutive.setEmployee(lyle);	
			salesDeptHead.setEmployee(ron);
			
			salesManager1.setEmployee(stan);
			salesManager2.setEmployee(peter);
			
			marketingDepthead.setEmployee(anne);
			marketingManager.setEmployee(gary);
			
			salseAssistantMgr1.setEmployee(tom);
			salseAssistantMgr2.setEmployee(sue);
			salseAssistantMgr3.setEmployee(marc);
			salseAssistantMgr4.setEmployee(bill);
			salseAssistantMgr5.setEmployee(dan);												

			salesDepartment.addPosition(salesDeptHead);
		    salesDepartment.addPosition(salesManager1);
		    salesDepartment.addPosition(salesManager2);
		    salesDepartment.addPosition(salseAssistantMgr1);
		    salesDepartment.addPosition(salseAssistantMgr2);
		    salesDepartment.addPosition(salseAssistantMgr3);
		    salesDepartment.addPosition(salseAssistantMgr4);
		    salesDepartment.addPosition(salseAssistantMgr5);		  
		    
		    marketingDepartment.addPosition(marketingDepthead);
		    marketingDepartment.addPosition(marketingManager);
		    		 
		    company.setTopExecutive(topExecutive);		    		        
		    company.addDepartment(salesDepartment);
		    company.addDepartment(marketingDepartment);
		    company.printReportingHierarchy();	    	    	    
	}
}
