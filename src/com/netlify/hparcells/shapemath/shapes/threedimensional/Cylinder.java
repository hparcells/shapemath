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
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static byte surfaceAreaByDiameter(byte diameter, byte height) {
		byte radius = (byte) (diameter / 2);

		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte oneCircle = (byte) (Math.PI * radiusSquared);
		byte twoCircles = (byte) (oneCircle * 2);

		byte piDiameter = (byte) (Math.PI * diameter);
		byte round = (byte) (piDiameter * height);

        return (byte) (round + twoCircles);
	}
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static short surfaceAreaByDiameter(short diameter, short height) {
		short radius = (short) (diameter / 2);

		short radiusSquared = (short) Math.pow(radius, 2);
		short oneCircle = (short) (Math.PI * radiusSquared);
		short twoCircles = (short) (oneCircle * 2);

		short piDiameter = (short) (Math.PI * diameter);
		short round = (short) (piDiameter * height);

        return (short) (round + twoCircles);
	}
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static int surfaceAreaByDiameter(int diameter, int height) {
		int radius = diameter / 2;

		int radiusSquared = (int) Math.pow(radius, 2);
		int oneCircle = (int) (Math.PI * radiusSquared);
		int twoCircles = oneCircle * 2;

		int piDiameter = (int) (Math.PI * diameter);
		int round = piDiameter * height;

        return round + twoCircles;
	}
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static float surfaceAreaByDiameter(float diameter, float height) {
		float radius = diameter / 2;

		float radiusSquared = (float) Math.pow(radius, 2);
		float oneCircle = (float) (Math.PI * radiusSquared);
		float twoCircles = oneCircle * 2;

		float piDiameter = (float) (Math.PI * diameter);
		float round = piDiameter * height;

        return round + twoCircles;
	}
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static double surfaceAreaByDiameter(double diameter, double height) {
		double radius = diameter / 2;

		double radiusSquared = Math.pow(radius, 2);
		double oneCircle = Math.PI * radiusSquared;
		double twoCircles = oneCircle * 2;

		double piDiameter = Math.PI * diameter;
		double round = piDiameter * height;

        return round + twoCircles;
	}
	
	/**
	 * Finds the surface area of the cylinder.
	 * @param diameter The diameter of the circle base.
	 * @param height The height of the cylinder.
	 * @return The surface area of the cylinder.
	 */
	public static long surfaceAreaByDiameter(long diameter, long height) {
		long radius = diameter / 2;

		long radiusSquared = (long) Math.pow(radius, 2);
		long oneCircle = (long) (Math.PI * radiusSquared);
		long twoCircles = oneCircle * 2;

		long piDiameter = (long) (Math.PI * diameter);
		long round = piDiameter * height;

        return round + twoCircles;
	}
}
