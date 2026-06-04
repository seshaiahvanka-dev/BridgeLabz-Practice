package DAY10;

import java.util.*;

//UC10–UC12: CompanyEmpWage class (Model)
class CompanyEmpWage {
 String company;
 int wagePerHour;
 int numWorkingDays;
 int maxHoursPerMonth;
 int totalEmpWage;
 List<Integer> dailyWages;

 public CompanyEmpWage(String company, int wagePerHour, int numWorkingDays, int maxHoursPerMonth) {
     this.company = company;
     this.wagePerHour = wagePerHour;
     this.numWorkingDays = numWorkingDays;
     this.maxHoursPerMonth = maxHoursPerMonth;
     this.dailyWages = new ArrayList<>();
 }

 public void setTotalEmpWage(int totalEmpWage) {
     this.totalEmpWage = totalEmpWage;
 }

 @Override
 public String toString() {
     return "Company: " + company + " | Total Wage: " + totalEmpWage;
 }
}

//UC11: Interface
interface IEmpWageBuilder {
 void addCompanyEmpWage(String company, int wagePerHour, int numWorkingDays, int maxHoursPerMonth);
 void computeEmpWage();
 int getTotalWageByCompany(String company);
}

//UC7–UC13: EmpWageBuilder implementing interface
class EmpWageBuilder implements IEmpWageBuilder {
 private List<CompanyEmpWage> companyEmpWageList;

 public EmpWageBuilder() {
     companyEmpWageList = new ArrayList<>();
 }

 @Override
 public void addCompanyEmpWage(String company, int wagePerHour, int numWorkingDays, int maxHoursPerMonth) {
     CompanyEmpWage c = new CompanyEmpWage(company, wagePerHour, numWorkingDays, maxHoursPerMonth);
     companyEmpWageList.add(c);
 }

 @Override
 public void computeEmpWage() {
     for (CompanyEmpWage c : companyEmpWageList) {
         int totalWage = computeEmpWage(c);
         c.setTotalEmpWage(totalWage);
         System.out.println(c);
         System.out.println("Daily Wages: " + c.dailyWages);
     }
 }

 private int computeEmpWage(CompanyEmpWage c) {
     int totalHours = 0, totalDays = 0;
     Random rand = new Random();

     while (totalHours < c.maxHoursPerMonth && totalDays < c.numWorkingDays) {
         totalDays++;
         int empCheck = rand.nextInt(3); // 0=Absent, 1=Part-time, 2=Full-time
         int empHours = 0;
         switch (empCheck) {
             case 1: empHours = 4; break; // Part-time
             case 2: empHours = 8; break; // Full-time
             default: empHours = 0; // Absent
         }
         totalHours += empHours;
         int dailyWage = empHours * c.wagePerHour;
         c.dailyWages.add(dailyWage);
     }
     return totalHours * c.wagePerHour;
 }

 @Override
 public int getTotalWageByCompany(String company) {
     for (CompanyEmpWage c : companyEmpWageList) {
         if (c.company.equalsIgnoreCase(company)) {
             return c.totalEmpWage;
         }
     }
     return -1;
 }
}

//UC1–UC14: Main class
public class EmployeeWageComputation {
 public static void main(String[] args) {
     System.out.println("Welcome to Employee Wage Computation Program");

     EmpWageBuilder empWageBuilder = new EmpWageBuilder();

     // UC8–UC12: Add multiple companies
     empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
     empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
     empWageBuilder.addCompanyEmpWage("Wipro", 30, 25, 150);

     // UC9–UC12: Compute wages
     empWageBuilder.computeEmpWage();

     // UC13: Query total wage by company
     System.out.println("Queried Total Wage for Infosys: " +
             empWageBuilder.getTotalWageByCompany("Infosys"));

 }
}
