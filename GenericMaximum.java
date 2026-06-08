package DAY13;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericMaximum<T extends Comparable<T>> {
    private T x, y, z;

    // Parameterized constructor
    public GenericMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Refactor 1: Generic static method to find max of 3
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    // Instance method internally calls static method
    public T maximum() {
        return testMaximum(x, y, z);
    }

    // Refactor 2: Extend max method to handle more than 3 parameters (UC4)
    @SafeVarargs
    public static <T extends Comparable<T>> T max(T... elements) {
        List<T> list = Arrays.asList(elements);
        Collections.sort(list);
        return list.get(list.size() - 1); // last element is max
    }

    // Refactor 3: Print max using generic method (UC5)
    @SafeVarargs
    public static <T extends Comparable<T>> void printMax(T... elements) {
        T max = max(elements);
        System.out.println("Max of " + Arrays.toString(elements) + " is " + max);
    }

    // Main method to demonstrate UC1–UC5
    public static void main(String[] args) {
        // UC1–UC3: Using Generic Class with 3 variables
        GenericMaximum<Integer> intTest = new GenericMaximum<>(9, 3, 5);
        System.out.println("Max of (9,3,5) = " + intTest.maximum()); // Expected: 9

        GenericMaximum<Float> floatTest = new GenericMaximum<>(4.4f, 10.1f, 6.6f);
        System.out.println("Max of (4.4,10.1,6.6) = " + floatTest.maximum()); // Expected: 10.1

        GenericMaximum<String> stringTest = new GenericMaximum<>("Apple", "Banana", "Peach");
        System.out.println("Max of (Apple,Banana,Peach) = " + stringTest.maximum()); // Expected: Peach

        // UC4: More than 3 parameters
        System.out.println("Max of (3,5,7,2,9,1) = " + max(3, 5, 7, 2, 9, 1)); // Expected: 9

        // UC5: Print max using generic printMax
        printMax(3, 5, 7, 2, 9, 1); // Expected: Max of [3, 5, 7, 2, 9, 1] is 9
        printMax("Apple", "Peach", "Banana", "Mango"); // Expected: Max of [Apple, Peach, Banana, Mango] is Peach
    }
}
