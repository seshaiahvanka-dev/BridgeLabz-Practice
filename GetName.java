//To get the name using the command line.

package DAY01;

public class GetName {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0]; 
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("No name provided.");
        }
    }
}
