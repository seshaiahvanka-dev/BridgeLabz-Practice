// Write a program SpringSeason.java that takes two int values m and d from the command line and
// prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

package DAY02;

public class SpringSeas {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		boolean isSpring = false;
		if((m == 3 && d>=20 && d<=31)||(m==4 && d>=1 && d<=30)||(m==5 && d<=31 && d>=1)||(m==6 && d>=1 && d<=20))
		{
			isSpring = true;
		}
		System.out.println(isSpring);
	}


}
