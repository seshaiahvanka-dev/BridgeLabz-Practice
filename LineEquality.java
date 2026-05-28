package DAY03;

public class LineEquality {

	public static void main(String[] args) {
		int x1 = 2,y1 = 3;
		int x2 = 7,y2 = 8;
		int x3 = 4,y3 = 5;
		int x4 = 9,y4 = 10;
		double length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double length2 = Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
		if(length1 == length2)
		{
			System.out.println("Both the lines are Equal in length.");
		}
		else
		{
			System.out.println("Both the lines are Unequal in length.");
		}
	}

}
