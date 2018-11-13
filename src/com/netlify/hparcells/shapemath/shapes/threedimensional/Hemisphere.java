package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Hemisphere Based Math.
 * 
 * @author Hunter Parcells
 */
public class Hemisphere extends Shape3D {
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static byte volumeByRadius(byte radius) {
		byte radiusCubed = (byte) Math.pow(radius, 3);
		byte piRadiusCubed = (byte) (Math.PI * radiusCubed);
		byte sphere = (byte) ((4/3) * piRadiusCubed);
        
        return (byte) (sphere / 2);
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static short volumeByRadius(short radius) {
		short radiusCubed = (short) Math.pow(radius, 3);
		short piRadiusCubed = (short) (Math.PI * radiusCubed);
		short sphere = (short) ((4/3) * piRadiusCubed);
        
        return (short) (sphere / 2);
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static int volumeByRadius(int radius) {
		int radiusCubed = (int) Math.pow(radius, 3);
		int piRadiusCubed = (int) (Math.PI * radiusCubed);
		int sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static float volumeByRadius(float radius) {
		float radiusCubed = (float) Math.pow(radius, 3);
		float piRadiusCubed = (float) (Math.PI * radiusCubed);
		float sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static double volumeByRadius(double radius) {
		double radiusCubed = Math.pow(radius, 3);
		double piRadiusCubed = Math.PI * radiusCubed;
		double sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param radius The radius of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static long volumeByRadius(long radius) {
		long radiusCubed = (long) Math.pow(radius, 3);
		long piRadiusCubed = (long) (Math.PI * radiusCubed);
		long sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static byte volumeByDiameter(byte diameter) {
		byte radius = (byte) (diameter / 2);
		byte radiusCubed = (byte) Math.pow(radius, 3);
		byte piRadiusCubed = (byte) (Math.PI * radiusCubed);
		byte sphere = (byte) ((4/3) * piRadiusCubed);
        
        return (byte) (sphere / 2);
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static short volumeByDiameter(short diameter) {
		short radius = (short) (diameter / 2);
		short radiusCubed = (short) Math.pow(radius, 3);
		short piRadiusCubed = (short) (Math.PI * radiusCubed);
		short sphere = (short) ((4/3) * piRadiusCubed);
        
        return (short) (sphere / 2);
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static int volumeByDiameter(int diameter) {
		short radius = (short) (diameter / 2);
		int radiusCubed = (int) Math.pow(radius, 3);
		int piRadiusCubed = (int) (Math.PI * radiusCubed);
		int sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static float volumeByDiameter(float diameter) {
		float radius = diameter / 2;
		float radiusCubed = (float) Math.pow(radius, 3);
		float piRadiusCubed = (float) (Math.PI * radiusCubed);
		float sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static double volumeByDiameter(double diameter) {
		double radius = diameter / 2;
		double radiusCubed = Math.pow(radius, 3);
		double piRadiusCubed = Math.PI * radiusCubed;
		double sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
	
	/**
	 * Finds the volume for a hemisphere.
	 * @param diameter The diameter of the hemisphere.
	 * @return The volume of the hemisphere.
	 */
	public static long volumeByDiameter(long diameter) {
		long radius = diameter / 2;
		long radiusCubed = (long) Math.pow(radius, 3);
		long piRadiusCubed = (long) (Math.PI * radiusCubed);
		long sphere = (4/3) * piRadiusCubed;
        
        return sphere / 2;
	}
}
