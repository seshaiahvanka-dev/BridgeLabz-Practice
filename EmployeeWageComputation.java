package DAY09;

import java.util.Random;

public class EmployeeWageComputation {

    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int WORKING_DAYS = 20;
    private static final int MAX_HOURS = 100;
    private static final int MAX_DAYS = 20;

    public static int computeEmployeeWage(String company, int wagePerHour, int maxDays, int maxHours) {
        int totalHours = 0, totalDays = 0, totalWage = 0;
        Random random = new Random();

        while (totalDays < maxDays && totalHours < maxHours) {
            totalDays++;
            int empCheck = random.nextInt(3); // 0,1,2
            int empHours = 0;

            switch (empCheck) {
                case FULL_TIME:
                    empHours = FULL_DAY_HOURS;
                    break;
                case PART_TIME:
                    empHours = PART_TIME_HOURS;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
            int empWage = empHours * wagePerHour;
            totalWage += empWage;
        }

        System.out.println("Company: " + company + " | Total Wage: " + totalWage);
        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmployeeWage("D-Mart", 20, 20, 100);
        computeEmployeeWage("Reliance", 25, 22, 120);
        computeEmployeeWage("TCS", 30, 25, 150);

    }
}
