package hunter.shapeMath.shapes.twoD;

/**
 * All Rectangle Based Math.
 * @author Hunter Parcells
 *
 */
public class Rectangle {
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static byte area(byte sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static short area(short sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static int area(int sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static float area(float sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static double area(double sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the area of a rectangle given one of the side lengths.
	 * @param sideLength The length of one of the sides.
	 * @return The area of the rectangle.
	 */
	public static long area(long sideLength) {
		return sideLength *= sideLength;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static byte perimeterByArea(byte area) {
		byte sideLength = (byte) Math.sqrt(area);
		
		return sideLength *= 4;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static short perimeterByArea(short area) {
		short sideLength = (short) Math.sqrt(area);
		
		return sideLength *= 4;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static int perimeterByArea(int area) {
		int sideLength = (int) Math.sqrt(area);
		
		return sideLength *= 4;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static float perimeterByArea(float area) {
		float sideLength = (float) Math.sqrt(area);
		
		return sideLength *= 4;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static double perimeterByArea(double area) {
		double sideLength = Math.sqrt(area);
		
		return sideLength *= 4;
	}
	
	/**
	 * Finds the perimeter of a rectangle given the area.
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static long perimeterByArea(long area) {
		long sideLength = (long) Math.sqrt(area);
		
		return sideLength *= 4;
	}
}
