package DAY03;

public class PartTime {

	public static void main(String[] args) {
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int EMP_FULL_HOURS = 8;
		int EMP_WAGE_PER_H = 20;
		int EMP_PART_TIME_H = 4;
		int empCheck = (int)(Math.random()*3);
		int empWage =0;
		int empHours = 0;
		switch(empCheck) {
		case IS_FULL_TIME:
			empHours = EMP_FULL_HOURS;
			System.out.println("Employee is Full-Time Present.");
			break;
		case IS_PART_TIME:
			empHours = EMP_PART_TIME_H;
			System.out.println("Employee is Part-Time Present.");
			break;
		default:
			System.out.println("Employee is Absent.");
			break;
		}
		empWage = EMP_WAGE_PER_H*empHours;
		System.out.println("Daily employee Wage: "+empWage);
	}

}
