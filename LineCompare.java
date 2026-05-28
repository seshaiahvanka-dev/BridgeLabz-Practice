package DAY03;

public class LineCompare {

	public static void main(String[] args) {

		int x1 = 2,y1 = 3;
		int x2 = 7,y2 = 8;
		int x3 = 4,y3 = 5;
		int x4 = 9,y4 = 10;
		Double length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		Double length2 = Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
		int result = length1.compareTo(length2);
		if(result == 0)
		{
			System.out.println("Both the lines are equal in length.");
		}
		else if(result > 0)
		{
			System.out.println("Line1 is Longer than Line2.");
		}
		else
		{
			System.out.println("Line1 is Shorter than Line2.");
		}
	}

}
