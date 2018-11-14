package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Pyramid Based Math. Note that this is a SQUARE pryamid, not a triangular pyramid.
 * 
 * @author Hunter Parcells
 */
public class SquarePyramid extends Polyhedron {
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static byte volume(byte baseWidth, byte baseHeight, byte height) {
		byte baseArea = (byte) (baseWidth * baseHeight);
		byte baseAreaHeight = (byte) (baseArea * height);

        return (byte) ((1/3) * baseAreaHeight);
	}
	
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static short volume(short baseWidth, short baseHeight, short height) {
		short baseArea = (short) (baseWidth * baseHeight);
		short baseAreaHeight = (short) (baseArea * height);

        return (short) ((1/3) * baseAreaHeight);
	}
	
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static int volume(int baseWidth, int baseHeight, int height) {
		int baseArea = baseWidth * baseHeight;
		int baseAreaHeight = baseArea * height;

        return (1/3) * baseAreaHeight;
	}
	
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static float volume(float baseWidth, float baseHeight, float height) {
		float baseArea = baseWidth * baseHeight;
		float baseAreaHeight = baseArea * height;

        return (1/3) * baseAreaHeight;
	}
	
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static double volume(double baseWidth, double baseHeight, double height) {
		double baseArea = baseWidth * baseHeight;
		double baseAreaHeight = baseArea * height;

        return (1/3) * baseAreaHeight;
	}
	
	/**
	 * Finds the volume of a square pyramid.
	 * @param baseWidth The base width of the pyramid.
	 * @param baseHeight The base height of the pyramid.
	 * @param height The height of the pyramid.
	 * @return The volume of the pyramid.
	 */
	public static long volume(long baseWidth, long baseHeight, long height) {
		long baseArea = baseWidth * baseHeight;
		long baseAreaHeight = baseArea * height;

        return (1/3) * baseAreaHeight;
	}
}
