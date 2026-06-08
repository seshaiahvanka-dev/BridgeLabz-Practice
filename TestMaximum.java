package DAY13;

public class TestMaximum<T extends Comparable<T>> {
    private T x, y, z;

    // Constructor
    public TestMaximum(T x, T y, T z) {
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
        TestMaximum<Integer> test1 = new TestMaximum<>(9, 3, 5);
        System.out.println("Max of (9,3,5) = " + test1.maximum()); // Expected: 9

        // UC2: Max at 2nd position
        TestMaximum<Integer> test2 = new TestMaximum<>(4, 10, 6);
        System.out.println("Max of (4,10,6) = " + test2.maximum()); // Expected: 10

        // UC3: Max at 3rd position
        TestMaximum<Integer> test3 = new TestMaximum<>(7, 2, 15);
        System.out.println("Max of (7,2,15) = " + test3.maximum()); // Expected: 15
    }
}
