//Java Program to print the largest element in an array


package DAY03;

public class LargestElement {

	public static void main(String[] args) {
		int [] a = {1,2,3,5,10};
		System.out.println(largest(a));
	}
	public static int largest(int[] a)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}

}
