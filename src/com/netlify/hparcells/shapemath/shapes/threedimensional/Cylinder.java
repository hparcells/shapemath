package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Cylinder Based Math.
 * 
 * @author Hunter Parcells
 */
public class Cylinder extends Shape3D {
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static byte volumeByRadius(byte radius, byte height) {
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte circle = (byte) (Math.PI * radiusSquared);
		
		return (byte) (circle * height);
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static short volumeByRadius(short radius, short height) {
		short radiusSquared = (short) Math.pow(radius, 2);
		short circle = (short) (Math.PI * radiusSquared);
		
		return (short) (circle * height);
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static int volumeByRadius(int radius, int height) {
		int radiusSquared = (int) Math.pow(radius, 2);
		int circle = (int) (Math.PI * radiusSquared);
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static float volumeByRadius(float radius, float height) {
		float radiusSquared = (float) Math.pow(radius, 2);
		float circle = (float) (Math.PI * radiusSquared);
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static double volumeByRadius(double radius, double height) {
		double radiusSquared = Math.pow(radius, 2);
		double circle = Math.PI * radiusSquared;
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param radius The radius of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static long volumeByRadius(long radius, long height) {
		long radiusSquared = (long) Math.pow(radius, 2);
		long circle = (long) (Math.PI * radiusSquared);
		
		return circle * height;
	}
}
