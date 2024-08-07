package MPP_Week2_StandardExam_May2017;

import java.util.List;
import java.util.ArrayList;

public class CheckoutRecord {
private List<CheckoutRecordEntry> checkoutEntryList;

public CheckoutRecord() {
	this.checkoutEntryList = new ArrayList<>();
}

public List<CheckoutRecordEntry> getCheckoutEntryList(){
	return checkoutEntryList;
}

public void addCheckoutEntry(CheckoutRecordEntry entry) {
	this.checkoutEntryList.add(entry);
}

}
