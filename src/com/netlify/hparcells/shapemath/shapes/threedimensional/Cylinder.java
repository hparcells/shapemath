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
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static byte volumeByDiameter(byte diameter, byte height) {
		byte radius = (byte) (diameter / 2);
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte circle = (byte) (Math.PI * radiusSquared);
		
		return (byte) (circle * height);
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static short volumeByDiameter(short diameter, short height) {
		short radius = (short) (diameter / 2);
		short radiusSquared = (short) Math.pow(radius, 2);
		short circle = (short) (Math.PI * radiusSquared);
		
		return (short) (circle * height);
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static int volumeByDiameter(int diameter, int height) {
		int radius = diameter / 2;
		int radiusSquared = (int) Math.pow(radius, 2);
		int circle = (int) (Math.PI * radiusSquared);
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static float volumeByDiameter(float diameter, float height) {
		float radius = diameter / 2;
		float radiusSquared = (float) Math.pow(radius, 2);
		float circle = (float) (Math.PI * radiusSquared);
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static double volumeByDiameter(double diameter, double height) {
		double radius = diameter / 2;
		double radiusSquared = Math.pow(radius, 2);
		double circle = Math.PI * radiusSquared;
		
		return circle * height;
	}
	
	/**
	 * Finds the volume of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The volume of the cylinder.
	 */
	public static long volumeByDiameter(long diameter, long height) {
		long radius = diameter / 2;
		long radiusSquared = (long) Math.pow(radius, 2);
		long circle = (long) (Math.PI * radiusSquared);
		
		return circle * height;
	}
}
