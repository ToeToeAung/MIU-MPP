package MPP_Week1_Day3_Lab3v2;

public class UPS extends Carrier {
    
	@Override
	public double calculateShippingCost(double weight,String zone) {
		
		return 0.45 * weight;
	}

	@Override
	public String getName() {
		
		return "UPS";
	}
	
	

}
