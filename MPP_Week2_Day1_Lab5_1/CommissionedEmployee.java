package MPP_Week2_Day1_Lab5_1;

import java.util.List;

public class CommissionedEmployee extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public CommissionedEmployee(int empId, String name, double commission,double baseSalary, List<Order> orders) {
        super(empId, name);
        this.commission = commission;
        this.baseSalary =baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay() {
        double totalOrderAmount = 0;
        for (Order order : orders) {
            totalOrderAmount += order.getOrderAmount();
        }
        return totalOrderAmount * commission;
    }
}
