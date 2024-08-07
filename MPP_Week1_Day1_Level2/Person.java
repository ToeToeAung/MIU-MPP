package MPP_Week1_Day1_Level2;

abstract class Person {
	private String Name;
	private String Phone;
	private int Age;
	
	Person(String Name,String Phone,int Age){
		this.Name = Name;
		this.Phone = Phone;
		this.Age = Age;
	}

    public abstract double getSalary();  
    
    public String getName() {
    	return Name;
    }
    
    public String getPhone() {
    	return Phone;
    }
    
    public int getAge() {
    	return Age;
    }
}
