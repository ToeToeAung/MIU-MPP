package MPP_Week3_Day2_Lab_Prob6;
import java.util.List;
import java.util.ArrayList;

public class ShippingCostCalculator {
	
	private List<Carrier> carriers;
	
	public ShippingCostCalculator() {
		carriers=new ArrayList();
		carriers.add(new UPS());
		carriers.add(new USMail());
		carriers.add(new Fedex());
	}
	
	public Carrier findCheapestCarrier(Package pkg) {
		Carrier cheapestCarrier =null;
		double lowestCost = Double.MAX_VALUE;
		
		for(Carrier c: carriers) {
			double shippingCost=c.calculateShippingCost(pkg.getWeight(),pkg.getZone());
			if(shippingCost<lowestCost) {
				lowestCost=shippingCost;
				cheapestCarrier=c;
			}
		}		
		return cheapestCarrier;
	}
}
