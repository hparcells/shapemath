package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Parallelogram Based Math.
 * 
 * @author Hunter Parcells
 */
public class Parallelogram {
	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static byte area(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static short area(short sideLength1, short sideLength2) {
		return (short) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static int area(int sideLength1, int sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static float area(float sideLength1, float sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static double area(double sideLength1, double sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a parallelogram given two side lengths.
	 * 
	 * @param sideLength1 he length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the parallelogram.
	 */
	public static long area(long sideLength1, long sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static byte perimeterByArea(byte area) {
		byte sideLength = (byte) Math.sqrt(area);

		return (byte) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static short perimeterByArea(short area) {
		short sideLength = (short) Math.sqrt(area);

		return (short) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static int perimeterByArea(int area) {
		int sideLength = (int) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static float perimeterByArea(float area) {
		float sideLength = (float) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static double perimeterByArea(double area) {
		double sideLength = Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the area.
	 * 
	 * @param area The area of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static long perimeterByArea(long area) {
		long sideLength = (long) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static byte perimeterBySides(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static short perimeterBySides(short sideLength1, short sideLength2) {
		return (short) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static int perimeterBySides(int sideLength1, int sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static float perimeterBySides(float sideLength1, float sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static double perimeterBySides(double sideLength1, double sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the parallelogram.
	 */
	public static long perimeterBySides(long sideLength1, long sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}
}
