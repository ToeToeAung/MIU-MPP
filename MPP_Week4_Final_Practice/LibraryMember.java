package MPP_Week4_Final_Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String memberId;
    private String name;
    private List<CheckoutRecordEntry> checkoutRecordEntries;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.checkoutRecordEntries = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
        return new ArrayList<>(checkoutRecordEntries);
    }

    public CheckoutRecord checkout(BookCopy copy, LocalDate checkoutDate, LocalDate dueDate) throws LibrarySystemException {
        // Perform checkout, create a new CheckoutRecordEntry, and add it to the list
        if (copy == null || checkoutDate == null || dueDate == null) {
            throw new LibrarySystemException("Invalid checkout information");
        }

        CheckoutRecordEntry entry = new CheckoutRecordEntry(copy, checkoutDate, dueDate);
        checkoutRecordEntries.add(entry);

        return new CheckoutRecord(checkoutRecordEntries);
    }
}