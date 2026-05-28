//Java Program to print the smallest element in an array


package DAY03;

public class SmallestElement {

	public static void main(String[] args) {
		int [] a = {75,18,63,78,93};
		System.out.println(smallest(a));
	}
	public static int smallest(int[] a) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		return min;
	}

}
