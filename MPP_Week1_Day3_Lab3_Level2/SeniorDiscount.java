package MPP_Week1_Day3_Lab3_Level2;

public class SeniorDiscount implements DiscountType {

	@Override
	public double calculateDiscount(double price) {
		
		return 0.85 * price;
	}

}
