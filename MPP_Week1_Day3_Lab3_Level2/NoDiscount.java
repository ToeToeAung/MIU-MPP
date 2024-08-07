package MPP_Week1_Day3_Lab3_Level2;

public class NoDiscount implements DiscountType {

	@Override
	public double calculateDiscount(double price) {
	  return price;
	}

}
