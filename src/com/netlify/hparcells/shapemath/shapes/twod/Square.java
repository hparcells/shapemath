package com.netlify.hparcells.shapemath.shapes.twod;

/**
 * All Square Based Math. Extends Rectangle.
 * 
 * @author Hunter Parcells
 */
public class Square extends Rectangle {
	//Extends Rectangle
	
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
}
