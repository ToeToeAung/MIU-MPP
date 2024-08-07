package MPP_Week1_Day3_Lab3v2;

public class USMail extends Carrier{

	@Override
	public double calculateShippingCost(double weight, String zone) {	
		if(weight<3) {
			return 1;
		}else {
			return 0.55 * weight;
		}		
	}

	@Override
	public String getName() {		
		return "US Mail";
	}
	

}
