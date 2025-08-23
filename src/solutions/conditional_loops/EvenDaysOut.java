package solutions.conditional_loops;

public class EvenDaysOut {
    public static void main(String[] args) {
        // August has 31 days
        int totalDaysInMonth = 31;
        int evenDayCount = 0;

        // Loop through each day of the month
        for (int day = 1; day <= totalDaysInMonth; day++) {
            // Check if the day is even
            if (day % 2 == 0) {
                evenDayCount++; // Increment the count for even days
            }
        }

        System.out.println("The number of days he can go out in August is: " + evenDayCount);
    }
}