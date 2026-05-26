package DAY01;

public class SumArguments {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg); // try converting to integer
                sum += num;
            } catch (NumberFormatException e) {
                invalidCount++; // count invalid entries
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Invalid integers count: " + invalidCount);
    }
}
