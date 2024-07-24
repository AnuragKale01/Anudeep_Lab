package lab2;

import java.time.Month;
import java.time.YearMonth;

public class Monthday {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            YearMonth yearMonth = YearMonth.of(2024, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println(month + ": " + daysInMonth + " days");
        }
    }
}