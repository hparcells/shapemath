package com.netlify.hparcells.shapemath.shapes.twodimensional;

/**
 * All Polygon Based Math.
 * 
 * @author Hunter Parcells
 */
public class Polygon extends Shape2D {
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static byte missingExteriorAngle(byte... exteriorAngles) {
		byte total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return (byte) (360 - total);
	}
	
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static short missingExteriorAngle(short... exteriorAngles) {
		short total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return (short) (360 - total);
	}
	
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static int missingExteriorAngle(int... exteriorAngles) {
		int total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return 360 - total;
	}
	
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static float missingExteriorAngle(float... exteriorAngles) {
		float total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return 360 - total;
	}
	
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static double missingExteriorAngle(double... exteriorAngles) {
		double total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return 360 - total;
	}
	
	/**
	 * Finds the missing exterior angle given the other exterior angles.
	 * @param exteriorAngles All the exterior angles.
	 * @return The amount of degress for the missing angle.
	 */
	public static long missingExteriorAngle(long... exteriorAngles) {
		long total = 0;
		
		for(int i = 0; i < exteriorAngles.length; i++) {
			total += exteriorAngles[i];
		}
		
		return 360 - total;
	}
}
