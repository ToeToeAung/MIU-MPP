package MPP_Week1_Day3_Lab3_Level2;
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
			double cost = pkg.getDiscountType().calculateDiscount(shippingCost);
			if(cost<lowestCost) {
				lowestCost=cost;
				cheapestCarrier=c;
			}
		}
		
		return cheapestCarrier;
	}
}
