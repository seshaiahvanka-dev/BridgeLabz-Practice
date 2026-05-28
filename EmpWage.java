package DAY03;

public class EmpWage {

	public static void main(String[] args) {
		int IS_EMP_FULLTIME = 1;
		int EMP_WAGE_PER_HOUR = 20;
		int EMP_HOURS = 8;
		int empCheck = (int)(Math.random()*2);
		if(empCheck == IS_EMP_FULLTIME)
		{
			int empWage = EMP_WAGE_PER_HOUR*EMP_HOURS;
			System.out.println("Employee is Present.");
			System.out.println("Daily Employee Wage: "+empWage);
		}
		else
		{
			System.out.println("Employee is Absent.");
			System.out.println("Daily Employee Wage: "+0);
		}
		
	}

}
