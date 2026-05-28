//Java Program to print the elements of an array present on an even position

package DAY03;

public class EvenIndexElements {

	public static void main(String[] args) {
		int [] a = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++,i++)
		{
			System.out.println(a[i]);
		}
	}

}
