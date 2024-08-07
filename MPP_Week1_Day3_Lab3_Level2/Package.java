package MPP_Week1_Day3_Lab3_Level2;

public class Package {
	private String Description;
	private double weight;
	private String zone;
	private DiscountType discountType;
	
	public Package(String Description, double weight, String zone,DiscountType discountType) {
	 this.Description =Description;
	 this.weight =weight;
	 this.zone = zone;
	 this.discountType =discountType;
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
	
	public DiscountType getDiscountType() {
		return discountType;
	}
}
