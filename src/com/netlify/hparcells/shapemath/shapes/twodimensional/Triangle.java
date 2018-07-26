package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Triangle Based Math.
 * 
 * @author Hunter Parcells
 */
public class Triangle {
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static byte area(byte base, byte height) {
		return (byte) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static short area(short base, short height) {
		return (short) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static int area(int base, int height) {
		return (int) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static float area(float base, float height) {
		return (float) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static double area(double base, double height) {
		return (base * height) * 0.5;
	}
	
	/**
	 * Finds the area of the triangle given the base and height lengths.
	 * @param base The base length of the triangle.
	 * @param height The height of the triangle.
	 * @return The area of the triangle.
	 */
	public static long area(long base, long height) {
		return (long) ((base * height) * 0.5);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static byte hypotenuse(byte sideLength1, byte sideLength2) {
		byte side1 = (byte) (sideLength1 * sideLength1);
		byte side2 = (byte) (sideLength2 * sideLength2);
		
		return (byte) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static short hypotenuse(short sideLength1, short sideLength2) {
		short side1 = (short) (sideLength1 * sideLength1);
		short side2 = (short) (sideLength2 * sideLength2);
		
		return (short) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static int hypotenuse(int sideLength1, int sideLength2) {
		int side1 = sideLength1 * sideLength1;
		int side2 = sideLength2 * sideLength2;
		
		return (int) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static float hypotenuse(float sideLength1, float sideLength2) {
		float side1 = sideLength1 * sideLength1;
		float side2 = sideLength2 * sideLength2;
		
		return (float) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static double hypotenuse(double sideLength1, double sideLength2) {
		double side1 = sideLength1 * sideLength1;
		double side2 = sideLength2 * sideLength2;
		
		return Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the hypotenuse of a right triangle given both side lengths.
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of the other side.
	 * @return The length of the hypotenuse.
	 */
	public static long hypotenuse(long sideLength1, long sideLength2) {
		long side1 = sideLength1 * sideLength1;
		long side2 = sideLength2 * sideLength2;
		
		return (long) Math.sqrt(side1 + side2);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static byte missingSide(byte side, byte hypotenuse) {
		byte hypotenuseSq = (byte) (hypotenuse * hypotenuse);
		byte sideSq = (byte) (side * side);
		
		return (byte) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static short missingSide(short side, short hypotenuse) {
		short hypotenuseSq = (short) (hypotenuse * hypotenuse);
		short sideSq = (short) (side * side);
		
		return (short) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static int missingSide(int side, int hypotenuse) {
		int hypotenuseSq = hypotenuse * hypotenuse;
		int sideSq = side * side;
		
		return (int) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static float missingSide(float side, float hypotenuse) {
		double hypotenuseSq = hypotenuse * hypotenuse;
		double sideSq = side * side;
		
		return (float) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static double missingSide(double side, double hypotenuse) {
		double hypotenuseSq = hypotenuse * hypotenuse;
		double sideSq = side * side;
		
		return Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing side of a right triangle. If returns 0, then the provided values do not make up a right triangle.
	 * @param side The length of one of the sides, not the hypotenuse.
	 * @param hypotenuse The length of the hypotenuse.
	 * @return The length of the missing side.
	 */
	public static long missingSide(long side, long hypotenuse) {
		long hypotenuseSq = hypotenuse * hypotenuse;
		long sideSq = side * side;
		
		return (long) Math.sqrt(hypotenuseSq - sideSq);
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static byte missingInteriorAngle(byte angle1, byte angle2) {
		return (byte) (180 - (angle1 + angle2));
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static short missingInteriorAngle(short angle1, short angle2) {
		return (short) (180 - (angle1 + angle2));
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static int missingInteriorAngle(int angle1, int angle2) {
		return 180 - (angle1 + angle2);
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static float missingInteriorAngle(float angle1, float angle2) {
		return 180 - (angle1 + angle2);
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static double missingInteriorAngle(double angle1, double angle2) {
		return 180 - (angle1 + angle2);
	}
	
	/**
	 * Finds the missing interior angle of a triangle.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static long missingInteriorAngle(long angle1, long angle2) {
		return 180 - (angle1 + angle2);
	}
}
