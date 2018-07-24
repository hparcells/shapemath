package com.netlify.hparcells.shapemath.shapes.twod;

/**
 * All Rhombus Based Math.
 * 
 * @author Hunter Parcells
 */
public class Rhombus {	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static byte areaByDiagonals(byte diag1, byte diag2) {
		return (byte) ((diag1 * diag2) / 2);
	}
	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static short areaByDiagonals(short diag1, short diag2) {
		return (short) ((diag1 * diag2) / 2);
	}
	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static int areaByDiagonals(int diag1, int diag2) {
		return (diag1 * diag2) / 2;
	}
	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static float areaByDiagonals(float diag1, float diag2) {
		return (diag1 * diag2) / 2;
	}
	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static double areaByDiagonals(double diag1, double diag2) {
		return (diag1 * diag2) / 2;
	}
	
	/**
	 * Finds the area of a rhombus given the diagonal lengths.
	 * @param diag1 The length of one of the diagonals.
	 * @param diag2 The length of the other diagonal.
	 * @return The area of the rhombus.
	 */
	public static long areaByDiagonals(long diag1, long diag2) {
		return (diag1 * diag2) / 2;
	}
	
	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static byte areaByBaseAndHeight(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static short areaByBaseAndHeight(short sideLength1, short sideLength2) {
		return (short) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static int areaByBaseAndHeight(int sideLength1, int sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static float areaByBaseAndHeight(float sideLength1, float sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static double areaByBaseAndHeight(double sideLength1, double sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rhombus given the base and height.
	 * 
	 * @param base The length of the base.
	 * @param height The height of the rhombus.
	 * @return The area of the rhombus.
	 */
	public static long areaByBaseAndHeight(long sideLength1, long sideLength2) {
		return sideLength1 * sideLength2;
	}
	
	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static byte perimeterBySides(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static short perimeterBySides(short sideLength1, short sideLength2) {
		return (short) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static int perimeterBySides(int sideLength1, int sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static float perimeterBySides(float sideLength1, float sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static double perimeterBySides(double sideLength1, double sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rhombus given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rhombus.
	 */
	public static long perimeterBySides(long sideLength1, long sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}
}
