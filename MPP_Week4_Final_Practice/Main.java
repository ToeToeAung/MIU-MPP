package MPP_Week4_Final_Practice;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        try {
            Book book1 = new Book("Effective Java");
            BookCopy copy1 = new BookCopy(book1);

            LibraryMember member1 = new LibraryMember("123", "John Doe");

            member1.checkout(copy1, LocalDate.now(), LocalDate.of(2021, 10, 28));

            System.out.println("Checkout successful. Total checkouts: " + member1.getCheckoutRecordEntries().size());
        } catch (LibrarySystemException e) {
            e.printStackTrace();
        }
    }
}
