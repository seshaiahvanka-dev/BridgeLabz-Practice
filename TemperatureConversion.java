//To the Util Class add temperaturConversion static function, given the temperature
//in fahrenheit as input outputs the temperature in Celsius or viceversa using the
//formula
//Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
//Fahrenheit to Celsius: (°F − 32) x 5/9 = °C

package DAY06;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		celcisToFahrenHeat(n);
		fahrenHeatToCelsius(n);
	}
	public static void celcisToFahrenHeat(int c)
	{
		float fahrenHeat = c*9.0f/5+32;
		System.out.println(fahrenHeat);
	}
	public static void fahrenHeatToCelsius(int f)
	{
		float celsius = f-32*5.0f/9;
		System.out.println(celsius);
	}

}
