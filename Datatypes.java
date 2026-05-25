//Write a Java program to display the default value of all primitive data types of Java

package DAY01;

public class Datatypes {
	static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue;
    static boolean booleanValue;
    public static void main(String[] args) {
    	 System.out.println("Default value of byte    : " + byteValue);
         System.out.println("Default value of short   : " + shortValue);
         System.out.println("Default value of int     : " + intValue);
         System.out.println("Default value of long    : " + longValue);
         System.out.println("Default value of float   : " + floatValue);
         System.out.println("Default value of double  : " + doubleValue);
         System.out.println("Default value of char    : [" + charValue + "]");
         System.out.println("Default value of boolean : " + booleanValue);
	}

}
