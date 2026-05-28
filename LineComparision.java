package DAY03;

public class LineComparision {

	public static void main(String[] args) {
		int x1 = 2, y1 = 3;
		int x2 = 7, y2 =8;
		double length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("The distance of line between two points is: "+length);
	}

}
