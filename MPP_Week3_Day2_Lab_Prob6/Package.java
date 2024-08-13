package MPP_Week3_Day2_Lab_Prob6;

public class Package {
	private String Description;
	private double weight;
	private String zone;
	
	public Package(String Description, double weight, String zone) {
	 this.Description =Description;
	 this.weight =weight;
	 this.zone = zone;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getZone() {
		return zone;
	}
}
