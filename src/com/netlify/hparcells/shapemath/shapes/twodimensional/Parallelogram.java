package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Parallelogram Based Math.
 * 
 * @author Hunter Parcells
 */
public class Parallelogram extends Quadrilateral {
	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static byte area(byte width, byte height) {
		return (byte) (width * height);
	}

	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static short area(short width, short height) {
		return (short) (width * height);
	}

	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static int area(int width, int height) {
		return width * height;
	}

	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static float area(float width, float height) {
		return width * height;
	}

	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static double area(double width, double height) {
		return width * height;
	}

	/**
	 * Finds the area of a parallelogram given the width and height.
	 * 
	 * @param width he length of one of the sides.
	 * @param height The height of the parallelogram.
	 * @return The area of the parallelogram.
	 */
	public static long area(long width, long height) {
		return width * height;
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static byte perimeterBySides(byte width, byte height) {
		return (byte) (width + width + height + height);
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static short perimeterBySides(short width, short height) {
		return (short) (width + width + height + height);
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static int perimeterBySides(int width, int height) {
		return width + width + height + height;
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static float perimeterBySides(float width, float height) {
		return width + width + height + height;
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static double perimeterBySides(double width, double height) {
		return width + width + height + height;
	}

	/**
	 * Finds the perimeter of a parallelogram given the width and height.
	 * 
	 * @param width The width of the parallelogram.
	 * @param height The height of the parallelogram.
	 * @return The perimeter of the parallelogram.
	 */
	public static long perimeterBySides(long width, long height) {
		return width + width + height + height;
	}
}
