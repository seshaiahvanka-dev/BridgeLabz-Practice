//Java Program to print the duplicate elements of an array

package DAY03;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a = {1,2,2,2,3,4,5,5,6,6,6};
		duplicates(a);
	}
	public static void duplicates(int[] a)
	{
		Arrays.sort(a);
		int count =1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					System.out.println(a[i]);
				}
				count =1;
			}
		}
		if(count>1)
		{
			System.out.println(a[a.length-1]);
		}
	}

}
