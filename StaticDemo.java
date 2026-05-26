package DAY01;

public class StaticDemo {

    static int count = 0;

    static {
        System.out.println("Static block executed!");
        count = 10; // initializing static variable
    }

    static void displayCount() {
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started!");

        System.out.println("Initial count: " + count);

        displayCount();

        count += 5;
        System.out.println("Updated count: " + count);

        displayCount();
    }
}

