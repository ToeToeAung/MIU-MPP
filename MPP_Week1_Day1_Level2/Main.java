package MPP_Week1_Day1_Level2;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		
				 Department dept=new Department("Computer Science");	
				 List<Course> courses = new ArrayList<>();
			     Course course1=new Course("CS201","Programming",4,"John Doodle");
		         Course course2=new Course("CS360","Databases",3,"Sam Howard");
		         Course course3=new Course("CS404","Compilers",4,"John Doodle");
		         Course course4=new Course("CS240","Data structures",2,"John Doodle");
		         Course course5=new Course("CS301","Software Engineering",3,"Sam Howard");
		         Course course6=new Course("CS450","Advanced Architecture",5,"Frank Moore");		
		         courses.add(course1);
		         courses.add(course2);
		         courses.add(course3);
		         courses.add(course4);
		         courses.add(course5);
		         courses.add(course6);
		    	          
				 Faculty faculty1= new Faculty("Frank Mooreh", "472-5921", 43,10000);
		         Faculty faculty2 = new Faculty("Sam Howard", "472-7222", 55,9500);
		         Faculty faculty3 = new Faculty("John Doodle", "472-6190", 39,8600);    
		         	       		               	         
		         faculty3.addCourse(course1);
		         faculty2.addCourse(course2);
		         faculty3.addCourse(course3);
		         faculty3.addCourse(course4);
		         faculty2.addCourse(course5);
		         faculty1.addCourse(course6);	
		         
		         dept.addMember(faculty1);
		         dept.addMember(faculty2);
		         dept.addMember(faculty3);			       				 	        
		         
		         Student student1=new Student("John Doe","472-1121",22,4.0);
		         Student student2=new Student("Mary Jones","472-7322",32,3.8);
		         Student student3=new Student("Lee Johnson","472-6009",19,3.65);		        
		        	   		         
		         Staff staff1=new Staff("Frank Gore","472-3321",33,4050);
		         Staff staff2=new Staff("Adam Davis","472-75521",50,5500);
		         Staff staff3=new Staff("David heck","472-8890",29,3600);
		        
		         dept.addMember(staff1);
		         dept.addMember(staff2);
		         dept.addMember(staff3);
		         
		         
		         double totsalary = 0;

		         while(true)
		            {
		            putText("Enter first letter of ");
		            putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
		            char choice = getChar();
		            switch(choice)
		               {
		               case 'g':
		                                  		                  
		                  System.out.println("-----------------------------------\n");		
		                  putText("Total salary with Instance Of is :");
		                  totsalary= dept.getTotalSalaryWithInstanceOf();
		                  putText(String.valueOf(totsalary)+"\n");   
		                  
		                  
		                  System.out.println("-----------------------------------\n");		
		                  putText("Total salary with Instance Of is :");
		                  totsalary= dept.getTotalSalaryWithPolymorphism();
		                  putText(String.valueOf(totsalary)+"\n");   
		                  
		 		         
		                  break;
		               case 's':
		            	   System.out.println("Show All Members:");
		                  dept.showAllMembers();
		                  break;
		               case 'u':
		                 // dept.unitsPerFaculty();
		            	   
		            	   System.out.println("-----------------------------------\n");		
			                 
			                  putText("Units Per Faculty with Instance of");
			                  dept.unitsPerFacultyWithInstanceOf(courses);
			                 
			                  putText("Units Per Faculty with ClassName ");
			 		         dept.unitsPerFacultyWithClassName(courses);
		               
		                  break;
		              
		               case 'q': return;
		               default:
		                  putText("Invalid entry\n");
		               }  // end switch
		            }  // end while   
		         
		         
	}
		
	 public static void putText(String s) //writes string s to the screen
     {
     System.out.println(s);
     }
//-------------------------------------------------------------
  public static String getString() throws IOException  //reads a string from the keyboard input
     {
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     String s = br.readLine();
     return s;
     }
//-------------------------------------------------------------
  public static char getChar() throws IOException //reads a character from the keyboard input
     {
     String s = getString();
     return s.charAt(0);
     }

//-------------------------------------------------------------
  public static int getInt() throws IOException // reads an integers from the keyboard input
     {
     String s = getString();
     return Integer.parseInt(s);
     }
//-------------------------------------------------------------
  }   

