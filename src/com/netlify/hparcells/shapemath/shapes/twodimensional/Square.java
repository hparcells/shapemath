package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Square Based Math.
 * 
 * @author Hunter Parcells
 */
public class Square extends Rectangle {	
	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static byte area(byte sideLength) {
		return (byte) (sideLength * sideLength);
	}

	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static short area(short sideLength) {
		return (short) (sideLength * sideLength);
	}

	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static int area(int sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static float area(float sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static double area(double sideLength) {
		return sideLength * sideLength;
	}

	/**
	 * Finds the area of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The area of the square.
	 */
	public static long area(long sideLength) {
		return sideLength * sideLength;
	}
	
	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static byte perimeterBySide(byte sideLength) {
		return (byte) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static short perimeterBySide(short sideLength) {
		return (short) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static int perimeterBySide(int sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static float perimeterBySide(float sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static double perimeterBySide(double sideLength) {
		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the side length.
	 * 
	 * @param sideLength The length of one of the sides.
	 * @return The perimeter of the square.
	 */
	public static long perimeterBySide(long sideLength) {
		return sideLength * 4;
	}
	
	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static byte perimeterByArea(byte area) {
		byte sideLength = (byte) Math.sqrt(area);

		return (byte) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static short perimeterByArea(short area) {
		short sideLength = (short) Math.sqrt(area);

		return (short) (sideLength * 4);
	}

	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static int perimeterByArea(int area) {
		int sideLength = (int) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static float perimeterByArea(float area) {
		float sideLength = (float) Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static double perimeterByArea(double area) {
		double sideLength = Math.sqrt(area);

		return sideLength * 4;
	}

	/**
	 * Finds the perimeter of a square given the area.
	 * 
	 * @param area The area of the square.
	 * @return The perimeter of the square.
	 */
	public static long perimeterByArea(long area) {
		long sideLength = (long) Math.sqrt(area);

		return sideLength * 4;
	}
}
