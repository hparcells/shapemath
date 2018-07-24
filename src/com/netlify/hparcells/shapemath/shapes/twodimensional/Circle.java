package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Circle Based Math.
 * 
 * @author Hunter Parcells
 */
public class Circle {
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static byte areaByRadius(byte radius) {
		byte beforeSq = (byte) (Math.PI * radius);
		return (byte) (beforeSq * beforeSq);
	}
	
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static short areaByRadius(short radius) {
		short beforeSq = (short) (Math.PI * radius);
		return (short) (beforeSq * beforeSq);
	}
	
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static int areaByRadius(int radius) {
		int beforeSq = (int) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static float areaByRadius(float radius) {
		float beforeSq = (float) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static double areaByRadius(double radius) {
		double beforeSq = Math.PI * radius;
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static long areaByRadius(long radius) {
		long beforeSq = (long) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static byte areaByDiameter(byte diameter) {
		byte radius = (byte) (diameter / 2);
		byte beforeSq = (byte) (Math.PI * radius);
		return (byte) (beforeSq * beforeSq);
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static short areaByDiameter(short diameter) {
		short radius = (short) (diameter / 2);
		short beforeSq = (short) (Math.PI * radius);
		return (short) (beforeSq * beforeSq);
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static int areaByDiameter(int diameter) {
		int radius = diameter / 2;
		int beforeSq = (int) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static float areaByDiameter(float diameter) {
		float radius = diameter / 2;
		float beforeSq = (float) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static double areaByDiameter(double diameter) {
		double radius = diameter / 2;
		double beforeSq = Math.PI * radius;
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the area of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The area of the circle.
	 */
	public static long areaByDiameter(long diameter) {
		long radius = diameter / 2;
		long beforeSq = (long) (Math.PI * radius);
		return beforeSq * beforeSq;
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static byte circumferenceByDiameter(byte diameter) {
		return (byte) (Math.PI * diameter);
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static short circumferenceByDiameter(short diameter) {
		return (short) (Math.PI * diameter);
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static short circumferenceByDiameter(int diameter) {
		return (short) (Math.PI * diameter);
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static float circumferenceByDiameter(float diameter) {
		return (float) (Math.PI * diameter);
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static double circumferenceByDiameter(double diameter) {
		return Math.PI * diameter;
	}
	
	/**
	 * Finds the circumference of a circle given the diameter.
	 * @param diameter The diameter of the circle.
	 * @return The circumference of the circle.
	 */
	public static long circumferenceByDiameter(long diameter) {
		return (long) (Math.PI * diameter);
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static byte circumferenceByRadius(byte radius) {
		return (byte) (Math.PI * (radius / 2));
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static short circumferenceByRadius(short radius) {
		return (short) (Math.PI * (radius / 2));
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static int circumferenceByRadius(int radius) {
		return (int) (Math.PI * (radius / 2));
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static float circumferenceByRadius(float radius) {
		return (float) (Math.PI * (radius / 2));
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static double circumferenceByRadius(double radius) {
		return Math.PI * (radius / 2);
	}
	
	/**
	 * Finds the circumference of a circle given the radius.
	 * @param radius The radius of the circle.
	 * @return The circumference of the circle.
	 */
	public static long circumferenceByRadius(long radius) {
		return (long) (Math.PI * (radius / 2));
	}
}
