package MPP_Week4_Final_Practice;

import java.util.List;

class CheckoutRecord {
    private List<CheckoutRecordEntry> entries;

    public CheckoutRecord(List<CheckoutRecordEntry> entries) {
        this.entries = entries;
    }

    public List<CheckoutRecordEntry> getEntries() {
        return entries;
    }
}