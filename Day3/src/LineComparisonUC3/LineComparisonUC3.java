package LineComparisonUC3;

public class LineComparisonUC3 {

	public static void main(String[] args) {
		double x1 = 2.0, x2 = 5.0;
		double y1 = 2.0, y2 = 6.0;
		double x3 = 2.0, x4 = 3.0;
		double y3 = 2.0, y4 = 4.0;

		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double line2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Length of first line   = " + line1);
		System.out.println("Length of second line   = " + line2);

		Double length1 = Double.valueOf(line1);
		Double length2 = Double.valueOf(line2);

		if (length1.equals(length2)) {
			System.out.println("Lines 1 and 2 are Equal");
		} else {
			System.out.println("Lines 1 and 2 are NOT Equal");
		}

		if (length1.compareTo(length2) == 0) {
			System.out.println("Line 1 and 2 are of the same length");
		} else if (length1.compareTo(length2) > 0) {
			System.out.println("Length of Line 1 is greater than Line 2");
		} else {
			System.out.println("Length of Line 1 is less than Line 2");
		}

	}

}
