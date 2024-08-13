package MPP_Week3_Day2_Lab_Prob6;

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
