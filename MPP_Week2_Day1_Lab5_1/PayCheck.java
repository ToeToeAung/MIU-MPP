package MPP_Week2_Day1_Lab5_1;
public final class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    private final double netPay;
    private final String payPeriod;

    public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, double netPay, String payPeriod) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
        this.payPeriod = payPeriod;
    }

    @Override
    public String toString() {
        return String.format("PayCheck [grossPay=$%,.2f,fica=$%,.2f,state=$%,.2f,local=$%,.2f,medicare=$%,.2f,socialSecurity=$%,.2f,netPay=$%,.2f,payPeriod=%s",
        		 + grossPay , fica , state, local , medicare , socialSecurity , netPay , payPeriod +"]");
    }
}
