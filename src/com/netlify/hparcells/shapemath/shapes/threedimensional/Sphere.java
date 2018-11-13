package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Sphere Based Math.
 * 
 * @author Hunter Parcells
 */
public class Sphere extends Shape3D {
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static byte volumeByRadius(byte radius) {
		byte radiusCubed = (byte) Math.pow(radius, 3);
		byte piRadiusCubed = (byte) (Math.PI * radiusCubed);

        return (byte) ((4/3) * piRadiusCubed);
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static short volumeByRadius(short radius) {
		short radiusCubed = (short) Math.pow(radius, 3);
		short piRadiusCubed = (short) (Math.PI * radiusCubed);

        return (short) ((4/3) * piRadiusCubed);
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static int volumeByRadius(int radius) {
		int radiusCubed = (int) Math.pow(radius, 3);
		int piRadiusCubed = (int) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static float volumeByRadius(float radius) {
		float radiusCubed = (float) Math.pow(radius, 3);
		float piRadiusCubed = (float) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static double volumeByRadius(double radius) {
		double radiusCubed = Math.pow(radius, 3);
		double piRadiusCubed = Math.PI * radiusCubed;

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static long volumeByRadius(long radius) {
		long radiusCubed = (long) Math.pow(radius, 3);
		long piRadiusCubed = (long) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static byte volumeByDiameter(byte diameter) {
		byte radius = (byte) (diameter / 2);
		byte radiusCubed = (byte) Math.pow(radius, 3);
		byte piRadiusCubed = (byte) (Math.PI * radiusCubed);

        return (byte) ((4/3) * piRadiusCubed);
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static short volumeByDiameter(short diameter) {
		short radius = (short) (diameter / 2);
		short radiusCubed = (short) Math.pow(radius, 3);
		short piRadiusCubed = (short) (Math.PI * radiusCubed);

        return (short) ((4/3) * piRadiusCubed);
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static int volumeByDiameter(int diameter) {
		int radius = diameter / 2;
		int radiusCubed = (int) Math.pow(radius, 3);
		int piRadiusCubed = (int) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static float volumeByDiameter(float diameter) {
		float radius = diameter / 2;
		float radiusCubed = (float) Math.pow(radius, 3);
		float piRadiusCubed = (float) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static double volumeByDiameter(double diameter) {
		double radius = diameter / 2;
		double radiusCubed = Math.pow(radius, 3);
		double piRadiusCubed = Math.PI * radiusCubed;

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the volume of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The volume of the sphere.
	 */
	public static long volumeByDiameter(long diameter) {
		long radius = diameter / 2;
		long radiusCubed = (long) Math.pow(radius, 3);
		long piRadiusCubed = (long) (Math.PI * radiusCubed);

        return (4/3) * piRadiusCubed;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static byte surfaceAreaByRadius(byte radius) {
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte piRadiusSquared = (byte) (Math.PI * radiusSquared);

        return (byte) (4 * piRadiusSquared);
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static short surfaceAreaByRadius(short radius) {
		short radiusSquared = (short) Math.pow(radius, 2);
		short piRadiusSquared = (short) (Math.PI * radiusSquared);

        return (short) (4 * piRadiusSquared);
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static int surfaceAreaByRadius(int radius) {
		int radiusSquared = (int) Math.pow(radius, 2);
		int piRadiusSquared = (int) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static float surfaceAreaByRadius(float radius) {
		float radiusSquared = (float) Math.pow(radius, 2);
		float piRadiusSquared = (float) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static double surfaceAreaByRadius(double radius) {
		double radiusSquared = Math.pow(radius, 2);
		double piRadiusSquared = Math.PI * radiusSquared;

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param radius The radius of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static long surfaceAreaByRadius(long radius) {
		long radiusSquared = (long) Math.pow(radius, 2);
		long piRadiusSquared = (long) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static byte surfaceAreaByDiameter(byte diameter) {
		byte radius = (byte) (diameter / 2);
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte piRadiusSquared = (byte) (Math.PI * radiusSquared);

        return (byte) (4 * piRadiusSquared);
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static short surfaceAreaByDiameter(short diameter) {
		short radius = (short) (diameter / 2);
		short radiusSquared = (short) Math.pow(radius, 2);
		short piRadiusSquared = (short) (Math.PI * radiusSquared);

        return (short) (4 * piRadiusSquared);
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static int surfaceAreaByDiameter(int diameter) {
		int radius = diameter / 2;
		int radiusSquared = (int) Math.pow(radius, 2);
		int piRadiusSquared = (int) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static float surfaceAreaByDiameter(float diameter) {
		float radius = diameter / 2;
		float radiusSquared = (float) Math.pow(radius, 2);
		float piRadiusSquared = (float) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static double surfaceAreaByDiameter(double diameter) {
		double radius = diameter / 2;
		double radiusSquared = Math.pow(radius, 2);
		double piRadiusSquared = Math.PI * radiusSquared;

        return 4 * piRadiusSquared;
	}
	
	/**
	 * Finds the surface area of the sphere.
	 * @param diameter The diameter of the sphere.
	 * @return The surface area of the sphere.
	 */
	public static long surfaceAreaByDiameter(long diameter) {
		long radius = diameter / 2;
		long radiusSquared = (long) Math.pow(radius, 2);
		long piRadiusSquared = (long) (Math.PI * radiusSquared);

        return 4 * piRadiusSquared;
	}
}
