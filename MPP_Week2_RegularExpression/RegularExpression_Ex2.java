package MPP_Week2_RegularExpression;
import javax.swing.*;

/*2)  Write a regular expression for a license plate number 
 * whose format is two letters followed by four digits followed by three letters.*/		
class Ex2 {

    private static final String STOP = "0";
    private static final String VALID = "Valid license plate number";
    private static final String INVALID = "Not a license plate number";

    private static final String VALID_LICENSE_PLATE_NUMBER_PATTERN
                   = "[A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]";
           

    public static void main (String[] args) {

        String licenseStr, reply;

        while (true) {

        	licenseStr = JOptionPane.showInputDialog(null, "License Plate#:");

            if (licenseStr.equals(STOP)) break;

            if (licenseStr.matches(VALID_LICENSE_PLATE_NUMBER_PATTERN)) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null,licenseStr + ":\n" + reply);
        }
    }
}
