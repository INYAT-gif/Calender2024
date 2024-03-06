package se.inyat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        // Define the year for which the calendar needs to be printed
        int year = 2024;

        // Loop through each month
        for (Month month : Month.values()) {
            // Get the first day of the month
            LocalDate date = LocalDate.of(year, month, 1);

            // Print month name and year
            System.out.println(month.toString() + " " + year);

            // Print headers for days of the week
            System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");

            // Determine the day of the week the month starts on
            int dayOfWeekValue = date.getDayOfWeek().getValue();

            // Print leading spaces if the month doesn't start on a Monday
            for (int i = 1; i < dayOfWeekValue; i++) {
                System.out.print("\t");
            }

            // Loop through each day of the month
            while (date.getMonth() == month) {
                // Print the day
                System.out.print(date.getDayOfMonth() + "\t");

                // Move to the next day
                date = date.plusDays(1);

                // Move to the next line if it's Monday
                if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                    System.out.println();
                }
            }

            // Move to the next line after printing the month
            System.out.println("\n");
        }
    }
}
