//Write a Util Static Function to calculate monthlyPayment that reads in three
//command-line arguments P, Y, and R and calculates the monthly payments you
//would have to make over Y years to pay off a P principal loan amount at R per cent
//interest compounded monthly. The formula is The formula is
//payment = (P * r) / (1 - Math.pow(1 + r, -n));

package DAY06;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double P = scanner.nextDouble();   //principal loan amount
		double Y = scanner.nextDouble();   //Years
		double R = scanner.nextDouble();	 //annual interest rate (%)
		double n = 12*Y;				 // total Months
		double r = R/(12*100);
		double payment = (P*r)/(1-Math.pow(1+r, -n));
		System.out.printf("Monthly Payment is: %.2f",payment);
	}

}
