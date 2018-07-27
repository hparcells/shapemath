package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Cube Based Math.
 * 
 * @author Hunter Parcells
 */
public class Cube extends RectangularPrism {
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */	
	public static byte volume(byte length) {
		return (byte) (length * length * length);
	}
	
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */
	public static short volume(short length) {
		return (short) (length * length * length);
	}
	
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */
	public static int volume(int length) {
		return length * length * length;
	}
	
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */
	public static float volume(float length) {
		return length * length * length;
	}
	
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */
	public static double volume(double length) {
		return length * length * length;
	}
	
	/**
	 * Finds the volume of a cube given the dimensions.
	 * @param length The length of the cube.
	 * @return The volume of the cube.
	 */
	public static long volume(long length) {
		return length * length * length;
	}
}
