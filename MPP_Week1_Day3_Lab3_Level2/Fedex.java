package MPP_Week1_Day3_Lab3_Level2;

public class Fedex extends Carrier {

	@Override
	public double calculateShippingCost(double weight, String zone) {
		double zoneRate=0.43;
		switch(zone) {
		case "IA" :
		case "MT" :
		case "OR" :
		case "CA" : 
			zoneRate = 0.35;
			break;
		case "TX" :
		case "UT" :
			zoneRate = 0.30;
			break;
		case "FL" :
		case "MA" :
		case "OH" :
			zoneRate = 0.55;	
			break;
		}		
		return zoneRate * weight;
	}

	@Override
	public String getName() {
		return "Fedex";
	}

	
}
