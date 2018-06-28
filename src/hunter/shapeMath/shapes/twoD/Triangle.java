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
}
