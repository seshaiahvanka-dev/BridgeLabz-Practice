//Java Program to sort the elements of an array in ascending order

package DAY03;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[]a = {1,4,7,3,8,2,5,6};
//		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
