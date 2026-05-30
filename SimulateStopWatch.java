//Simulate Stopwatch Program
//a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
//the start and end clicks
//b. I/P -> Start the Stopwatch and End the Stopwatch
//c. Logic -> Measure the elapsed time between start and end
//d. O/P -> Print the elapsed time.

package DAY06;

import java.util.Scanner;

public class SimulateStopWatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press Enter to start the stopwatch...");
		scanner.nextLine();
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println("Press Enter to stop the stopwatch...");
		scanner.nextLine();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("Time elapsed b/w start and end : "+(end-start)+"");
	}

}
