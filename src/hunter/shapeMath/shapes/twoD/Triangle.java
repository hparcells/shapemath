package hunter.shapeMath.shapes.twoD;

public class Triangle {
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static byte area(byte base, byte height) {
		return (byte) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static short area(short base, short height) {
		return (short) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static int area(int base, int height) {
		return (int) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static float area(float base, float height) {
		return (float) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static double area(double base, double height) {
		return (base * height) * 0.5;
	}
	
	/**
	 * Finds the area of the triangle.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static long area(long base, long height) {
		return (long) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static byte getHypotenuse(byte sideLength1, byte sideLength2) {
		byte side1 = (byte) (sideLength1 * sideLength1);
		byte side2 = (byte) (sideLength2 * sideLength2);
		
		return (byte) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static short getHypotenuse(short sideLength1, short sideLength2) {
		short side1 = (short) (sideLength1 * sideLength1);
		short side2 = (short) (sideLength2 * sideLength2);
		
		return (short) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static int getHypotenuse(int sideLength1, int sideLength2) {
		int side1 = (int) (sideLength1 * sideLength1);
		int side2 = (int) (sideLength2 * sideLength2);
		
		return (int) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static float getHypotenuse(float sideLength1, float sideLength2) {
		float side1 = (float) (sideLength1 * sideLength1);
		float side2 = (float) (sideLength2 * sideLength2);
		
		return (float) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static double getHypotenuse(double sideLength1, double sideLength2) {
		double side1 = (double) (sideLength1 * sideLength1);
		double side2 = (double) (sideLength2 * sideLength2);
		
		return (double) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static long getHypotenuse(long sideLength1, long sideLength2) {
		long side1 = (long) (sideLength1 * sideLength1);
		long side2 = (long) (sideLength2 * sideLength2);
		
		return (long) Math.sqrt(side1 + side2);
	}
}
