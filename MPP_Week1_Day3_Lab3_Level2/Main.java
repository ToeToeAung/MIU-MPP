package MPP_Week1_Day3_Lab3_Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ShippingCostCalculator shipping=new ShippingCostCalculator();		
		List<Package> packages=new ArrayList<>();
		packages.add(new Package("Book",2,"IA",new StudentDiscount()));
		packages.add(new Package("Phone",4,"MA",new SeniorDiscount()));
		packages.add(new Package("Boots",6,"NY", new NoDiscount()));
		
		for(Package pkg : packages) {
			Carrier cheapestCarrier =shipping.findCheapestCarrier(pkg);			
			double shippingCost=cheapestCarrier.calculateShippingCost(pkg.getWeight(),pkg.getZone());
			double cost = pkg.getDiscountType().calculateDiscount(shippingCost);
			System.out.printf("%s\t\t$%.2f\t\t%s%n",pkg.getDescription(),cost,cheapestCarrier.getName());
		}
	}
}
