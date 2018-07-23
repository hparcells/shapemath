package com.netlify.hparcells.shapemath.shapes.threed;

/**
 * All Rectangular Prism Based Math.
 * @author Hunter Parcells
 *
 */
public class RectangularPrism {
	//TODO: Add Surface Area
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static byte volume(byte length, byte width, byte height) {
		return (byte) (length * width * height);
	}
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static short volume(short length, short width, short height) {
		return (short) (length * width * height);
	}
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static int volume(int length, int width, int height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static float volume(float length, float width, float height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static double volume(double length, double width, double height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a rectangular prism given the dimensions.
	 * @param length The length of the rectangular prism.
	 * @param width The width of the rectangular prism.
	 * @param height The height of the rectangular prism.
	 * @return The volume of the rectangular prism.
	 */
	public static long volume(long length, long width, long height) {
		return length * width * height;
	}
}
