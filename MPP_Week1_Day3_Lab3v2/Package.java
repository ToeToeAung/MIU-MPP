package MPP_Week1_Day3_Lab3v2;

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
