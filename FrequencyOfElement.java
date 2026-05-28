// Java Program to find the frequency of each element in the array


package DAY03;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,5,3,4,4,4,4,3,5};
		frequency(a);
	}
	public static void frequency(int[] a)
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
				System.out.println(a[i]+" - "+count);
				count =1;
			}
		}
		System.out.println(a[a.length-1]+" - "+count);
	}

}
