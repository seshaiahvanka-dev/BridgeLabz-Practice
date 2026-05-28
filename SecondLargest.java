// Find 2nd Largest Number in an Array

package DAY03;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = {1,2,56,94,98,65,25};
		System.out.println(secondLarge(a));
		
	}
	public static int secondLarge(int[] a)
	{
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secLargest = largest;
				largest = a[i];
			}
			else if(a[i]>secLargest)
			{
				secLargest = a[i];
			}
		}
		return secLargest;
	}

}
