package io.github.hparcells.shapeMath.shapes.twoD;

/**
 * All Circle Based Math.
 * 
 * @author Hunter Parcells
 *
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
}
