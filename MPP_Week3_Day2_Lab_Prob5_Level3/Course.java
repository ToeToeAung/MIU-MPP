package MPP_Week3_Day2_Lab_Prob5_Level3;

public class Course {
	
	private String Number;
	private String Title;
	private int Units;
	private String faculty;
	
	public Course(String Number,String Title,int Units,String faculty) {
		this.Number = Number;
		this.Title= Title;
		this.Units = Units;
		this.faculty =faculty;
	}
	
	public String getNumber() {
		return Number;
		
	}
		
	public String getTitle() {
		return Title;
	}
	
	public int getUnits() {
		return Units;
	}
	
	 public String getFaculty() {
	        return faculty;
	    }
}
