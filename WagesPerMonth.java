package DAY03;

public class WagesPerMonth {

	public static void main(String[] args) {

		final int fullTime = 1;
		final int partTime = 2;
		int wagePHour = 20;
		int fHours = 8;
		int pHours = 4;
		int workingDays = 20;
		int empCheck = (int)(Math.random()*3);
		int empHours = 0;
		int totalWage =0;
		for(int i=0;i<workingDays;i++)
		{
			switch(empCheck)
			{
			case fullTime:
				empHours = fHours;
				break;
			case partTime:
				empHours = pHours;
				break;
			default:
				empHours = 0;
				break;
			}
			int empWage = empHours*wagePHour;
			totalWage += empWage;
		}
		System.out.println("Total Wage Per Month: "+totalWage);
	}

}
