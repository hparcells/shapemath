package com.netlify.hparcells.shapemath.shapes.twod;

/**
 * All Parallelogram Based Math.
 * 
 * @author Hunter Parcells
 */
public class Parallelogram {
	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static byte area(byte sideLength) {
		return (byte) (sideLength * sideLength);
	}

	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static short area(short sideLength) {
		return (short) (sideLength * sideLength);
	}

	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static int area(int sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static float area(float sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static double area(double sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the parallelogram.
	 */
	public static long area(long sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static byte area(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static short area(short sideLength1, short sideLength2) {
		return (short) (sideLength1 * sideLength2);
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static int area(int sideLength1, int sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static float area(float sideLength1, float sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static double area(double sideLength1, double sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the area of a rectangle given two side lengths.
	 * 
	 * @param sideLength1 he length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The area of the rectangle.
	 */
	public static long area(long sideLength1, long sideLength2) {
		return sideLength1 * sideLength2;
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static byte perimeterByArea(byte area) {
		byte sideLength = (byte) Math.sqrt(area);

		return (byte) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static short perimeterByArea(short area) {
		short sideLength = (short) Math.sqrt(area);

		return (short) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static int perimeterByArea(int area) {
		int sideLength = (int) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static float perimeterByArea(float area) {
		float sideLength = (float) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static double perimeterByArea(double area) {
		double sideLength = Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a rectangle given the area.
	 * 
	 * @param area The area of the rectangle.
	 * @return The perimeter of the rectangle.
	 */
	public static long perimeterByArea(long area) {
		long sideLength = (long) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static byte perimeterBySide(byte sideLength) {
		return (byte) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static short perimeterBySide(short sideLength) {
		return (short) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static int perimeterBySide(int sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static float perimeterBySide(float sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static double perimeterBySide(double sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a parallelogram given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the parallelogram.
	 */
	public static long perimeterBySide(long sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static byte perimeterBySide(byte sideLength1, byte sideLength2) {
		return (byte) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static short perimeterBySide(short sideLength1, short sideLength2) {
		return (short) (sideLength1 + sideLength1 + sideLength2 + sideLength2);
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static int perimeterBySide(int sideLength1, int sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static float perimeterBySide(float sideLength1, float sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static double perimeterBySide(double sideLength1, double sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}

	/**
	 * Finds the perimeter of a rectangle given the side lengths.
	 * 
	 * @param sideLength1 The length of one of the sides.
	 * @param sideLength2 The length of one of the other side.
	 * @return The perimeter of the rectangle.
	 */
	public static long perimeterBySide(long sideLength1, long sideLength2) {
		return sideLength1 + sideLength1 + sideLength2 + sideLength2;
	}
}
