package MPP_Week3_Day2_Lab_Prob6;

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
