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
	 * Finds the hypotenuse of a right triangle.
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
	 * Finds the hypotenuse of a right triangle.
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
	 * Finds the hypotenuse of a right triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static int getHypotenuse(int sideLength1, int sideLength2) {
		int side1 = sideLength1 * sideLength1;
		int side2 = sideLength2 * sideLength2;
		
		return (int) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static float getHypotenuse(float sideLength1, float sideLength2) {
		float side1 = sideLength1 * sideLength1;
		float side2 = sideLength2 * sideLength2;
		
		return (float) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static double getHypotenuse(double sideLength1, double sideLength2) {
		double side1 = sideLength1 * sideLength1;
		double side2 = sideLength2 * sideLength2;
		
		return Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static long getHypotenuse(long sideLength1, long sideLength2) {
		long side1 = sideLength1 * sideLength1;
		long side2 = sideLength2 * sideLength2;
		
		return (long) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static byte getMissingSide(byte side, byte hypotenuse) {
		byte hypotenuseSq = (byte) (hypotenuse * hypotenuse);
		byte sideSq = (byte) (side * side);
		
		return (byte) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static short getMissingSide(short side, short hypotenuse) {
		short hypotenuseSq = (short) (hypotenuse * hypotenuse);
		short sideSq = (short) (side * side);
		
		return (short) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static int getMissingSide(int side, int hypotenuse) {
		int hypotenuseSq = hypotenuse * hypotenuse;
		int sideSq = side * side;
		
		return (int) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static float getMissingSide(float side, float hypotenuse) {
		double hypotenuseSq = hypotenuse * hypotenuse;
		double sideSq = side * side;
		
		return (float) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static double getMissingSide(double side, double hypotenuse) {
		double hypotenuseSq = hypotenuse * hypotenuse;
		double sideSq = side * side;
		
		return Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static long getMissingSide(long side, long hypotenuse) {
		long hypotenuseSq = hypotenuse * hypotenuse;
		long sideSq = side * side;
		
		return (long) Math.sqrt(hypotenuseSq - sideSq);
	}
}
