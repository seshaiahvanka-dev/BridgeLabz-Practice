package DAY08;

import java.util.Random;

public class EmployeeWageComputation {
    // Class variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_HOURS_IN_MONTH = 100;
    static final int MAX_WORKING_DAYS = 20;

    // Method to compute employee wage
    public static int computeEmployeeWage() {
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        Random random = new Random();

        while (totalHours < MAX_HOURS_IN_MONTH && totalDays < MAX_WORKING_DAYS) {
            totalDays++;
            int empCheck = random.nextInt(3); // 0 = Absent, 1 = Full-time, 2 = Part-time
            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = FULL_DAY_HOURS;
                    break;
                case 2:
                    empHours = PART_TIME_HOURS;
                    break;
                default:
                    empHours = 0;
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalHours += empHours;
            totalWage += dailyWage;

            System.out.println("Day " + totalDays + ": Hours = " + empHours + ", Wage = " + dailyWage);
        }

        System.out.println("Total Hours Worked = " + totalHours);
        System.out.println("Total Days Worked = " + totalDays);
        System.out.println("Total Wage = " + totalWage);

        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        computeEmployeeWage();
    }
}
