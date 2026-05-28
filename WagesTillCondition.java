package DAY03;

public class WagesTillCondition {

	public static void main(String[] args) {
		final int fullTime = 1;
		final int partTime = 2;
		int wagePerH = 20;
		int fHours = 8;
		int pHours = 4;
		int maxDays = 20;
		int maxHours = 100;
		int totalH = 0;
		int totalD = 0;
		int totalWage = 0;
		while(totalD < maxDays && totalH < maxHours)
		{
			int empHours = 0;
			int empCheck = (int)(Math.random()*3);
			switch(empCheck)
			{
			case fullTime:
				empHours = fHours;
				break;
			case partTime:
				empHours = pHours;
				break;
			default:
				empHours =0;
			}
			totalD++;
			int empWage = empHours*wagePerH;
			totalWage += empWage;
			totalH += empHours;
		}
		System.out.println("Total Days Worked: "+totalD);
		System.out.println("Total Hours Worked: "+totalH);
		System.out.println("Total Wage: "+totalWage);
	}

}
