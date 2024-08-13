package MPP_Final_Practice8;

import java.time.LocalDate;
import java.util.List;

public class MinGen {
    public static <T extends Comparable<? super T>> T min(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(4, 2, 7, 1, 9);
        System.out.println("Min Integer: " + min(intList));

        List<String> strList = List.of("apple", "orange", "banana", "pear");
        System.out.println("Min String: " + min(strList));

        List<LocalDate> dateList = List.of(
            LocalDate.of(2020, 1, 1),
            LocalDate.of(2019, 12, 31),
            LocalDate.of(2021, 5, 15)
        );
       System.out.println("Min LocalDate: " + min(dateList));
    }
}

