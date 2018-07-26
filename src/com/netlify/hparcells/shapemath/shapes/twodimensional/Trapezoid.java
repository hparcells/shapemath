package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Trapezoid Based Math
 * 
 * @author Hunter Parcells
 */
public class Trapezoid extends Quadrilateral {
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static byte area(byte base1, byte base2, byte height) {
		return (byte) (((base1 + base2) * height) / 2);
	}
	
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static short area(short base1, short base2, short height) {
		return (short) (((base1 + base2) * height) / 2);
	}
	
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static int area(int base1, int base2, int height) {
		return ((base1 + base2) * height) / 2;
	}
	
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static float area(float base1, float base2, float height) {
		return ((base1 + base2) * height) / 2;
	}
	
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static double area(double base1, double base2, double height) {
		return ((base1 + base2) * height) / 2;
	}
	
	/**
	 * Finds the area of the trapezoid given the dimensions.
	 * @param base1 The length of one of the bases.
	 * @param base2 The length of the other base.
	 * @param height The height of the trapezoid.
	 * @return The area of the trapezoid.
	 */
	public static long area(long base1, long base2, long height) {
		return ((base1 + base2) * height) / 2;
	}
}
