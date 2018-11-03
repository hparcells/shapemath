package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Cubiod Based Math.
 * 
 * @author Hunter Parcells
 */
public class Cuboid extends Polyhedron {
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static byte volume(byte length, byte width, byte height) {
		return (byte) (length * width * height);
	}
	
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static short volume(short length, short width, short height) {
		return (short) (length * width * height);
	}
	
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static int volume(int length, int width, int height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static float volume(float length, float width, float height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static double volume(double length, double width, double height) {
		return length * width * height;
	}
	
	/**
	 * Finds the volume of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The volume of the cuboid.
	 */
	public static long volume(long length, long width, long height) {
		return length * width * height;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static byte surfaceArea(byte length, byte width, byte height) {
		byte front = (byte) (length * height);
		byte right = (byte) (width * height);
		byte top = (byte) (width * length);
		byte half = (byte) (front + right + top);
		byte total = (byte) (half + half);
		
		return total;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static short surfaceArea(short length, short width, short height) {
		short front = (short) (length * height);
		short right = (short) (width * height);
		short top = (short) (width * length);
		short half = (short) (front + right + top);
		short total = (short) (half + half);
		
		return total;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static int surfaceArea(int length, int width, int height) {
		int front = length * height;
		int right = width * height;
		int top = width * length;
		int half = front + right + top;
		int total = half + half;
		
		return total;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static float surfaceArea(float length, float width, float height) {
		float front = length * height;
		float right = width * height;
		float top = width * length;
		float half = front + right + top;
		float total = half + half;
		
		return total;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static double surfaceArea(double length, double width, double height) {
		double front = length * height;
		double right = width * height;
		double top = width * length;
		double half = front + right + top;
		double total = half + half;
		
		return total;
	}
	
	/**
	 * Finds the surface area of a cuboid given the dimensions.
	 * @param length The length of the cuboid.
	 * @param width The width of the cuboid.
	 * @param height The height of the cuboid.
	 * @return The surface area of the cuboid.
	 */
	public static long surfaceArea(long length, long width, long height) {
		long front = length * height;
		long right = width * height;
		long top = width * length;
		long half = front + right + top;
		long total = half + half;
		
		return total;
	}
}
