//Java Program to print the elements of an array in reverse order

package DAY03;

public class ReverseOrder {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
