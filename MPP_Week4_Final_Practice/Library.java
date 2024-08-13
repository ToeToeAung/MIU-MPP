package MPP_Week4_Final_Practice;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Library {

    public LibraryMember detectIfWinnerDuringCheckout(
            List<LibraryMember> mems, Iterator<Book> specialBooks) {

        return mems.stream()
                .filter(handleException(mem -> {
                    BookCopy copy = specialBooks.next().getNextAvailableCopy();
                    mem.checkout(copy, LocalDate.now(), LocalDate.of(2021, 10, 28));
                    return mem.getCheckoutRecordEntries().size() == 10;
                }))
                .findFirst()
                .orElse(null);
    }

    // Utility method to wrap checked exceptions in an unchecked exception
    public static <T> Predicate<T> handleException(CheckedPredicate<T> checkedPredicate) {
        return obj -> {
            try {
                return checkedPredicate.test(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    @FunctionalInterface
    public interface CheckedPredicate<T> {
        boolean test(T t) throws Exception;
    }
}
