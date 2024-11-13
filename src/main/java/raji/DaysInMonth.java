package raji;

import java.time.Month;
import java.time.YearMonth;

public class DaysInMonth {
    public static void main(String[] args) {
        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(2025, month); // Replace 2024 with desired year
            Month monthName = Month.of(month);
            System.out.println(monthName + ": " + yearMonth.lengthOfMonth() + " days");
        }
    }
}
