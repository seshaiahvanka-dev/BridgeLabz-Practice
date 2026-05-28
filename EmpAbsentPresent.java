package DAY03;

public class EmpAbsentPresent {

	public static void main(String[] args) {
		int IS_EMP_FULLTIME = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_EMP_FULLTIME)
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee is Absent");
	}

}
