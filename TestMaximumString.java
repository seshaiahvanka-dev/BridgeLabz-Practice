package DAY13;

public class TestMaximumString<T extends Comparable<T>> {
    private T x, y, z;

    // Constructor
    public TestMaximumString(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to find maximum
    public T maximum() {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    // Main method to run UC1, UC2, UC3
    public static void main(String[] args) {
        // UC1: Max at 1st position
        TestMaximumString<String> test1 = new TestMaximumString<>("Peach", "Apple", "Banana");
        System.out.println("Max of (Peach,Apple,Banana) = " + test1.maximum()); // Expected: Peach

        // UC2: Max at 2nd position
        TestMaximumString<String> test2 = new TestMaximumString<>("Apple", "Peach", "Banana");
        System.out.println("Max of (Apple,Peach,Banana) = " + test2.maximum()); // Expected: Peach

        // UC3: Max at 3rd position
        TestMaximumString<String> test3 = new TestMaximumString<>("Apple", "Banana", "Peach");
        System.out.println("Max of (Apple,Banana,Peach) = " + test3.maximum()); // Expected: Peach
    }
}
