package DAY13;

public class TestMaximumFloat<T extends Comparable<T>> {
    private T x, y, z;

    // Constructor
    public TestMaximumFloat(T x, T y, T z) {
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
        TestMaximumFloat<Float> test1 = new TestMaximumFloat<>(9.9f, 3.3f, 5.5f);
        System.out.println("Max of (9.9,3.3,5.5) = " + test1.maximum()); // Expected: 9.9

        // UC2: Max at 2nd position
        TestMaximumFloat<Float> test2 = new TestMaximumFloat<>(4.4f, 10.1f, 6.6f);
        System.out.println("Max of (4.4,10.1,6.6) = " + test2.maximum()); // Expected: 10.1

        // UC3: Max at 3rd position
        TestMaximumFloat<Float> test3 = new TestMaximumFloat<>(7.7f, 2.2f, 15.5f);
        System.out.println("Max of (7.7,2.2,15.5) = " + test3.maximum()); // Expected: 15.5
    }
}
