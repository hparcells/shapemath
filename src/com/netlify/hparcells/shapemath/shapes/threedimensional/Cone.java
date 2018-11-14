package com.netlify.hparcells.shapemath.shapes.threedimensional;

/**
 * All Cone Based Math.
 * 
 * @author Hunter Parcells
 */
public class Cone extends Shape3D {
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static byte volumeByRadius(byte radius, byte height) {
		byte radSq = (byte) Math.pow(radius, 2);
		byte thirdHeight = (byte) (height / 3);
		byte beforePi = (byte) (radSq * thirdHeight);

        return (byte) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static short volumeByRadius(short radius, short height) {
		short radSq = (short) Math.pow(radius, 2);
		short thirdHeight = (short) (height / 3);
		short beforePi = (short) (radSq * thirdHeight);

        return (short) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static int volumeByRadius(int radius, int height) {
		int radSq = (int) Math.pow(radius, 2);
		int thirdHeight = height / 3;
		int beforePi = radSq * thirdHeight;

        return (int) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static float volumeByRadius(float radius, float height) {
		float radSq = (float) Math.pow(radius, 2);
		float thirdHeight = height / 3;
		float beforePi = radSq * thirdHeight;

        return (float) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static double volumeByRadius(double radius, double height) {
		double radSq = Math.pow(radius, 2);
		double thirdHeight = height / 3;
		double beforePi = radSq * thirdHeight;

        return Math.PI * beforePi;
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static long volumeByRadius(long radius, long height) {
		long radSq = (long) Math.pow(radius, 2);
		long thirdHeight = height / 3;
		long beforePi = radSq * thirdHeight;

        return (long) (Math.PI * beforePi);
	}

	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static byte volumeByDiameter(byte diameter, byte height) {
		byte radius = (byte) (diameter / 2);
		byte radSq = (byte) Math.pow(radius, 2);
		byte thirdHeight = (byte) (height / 3);
		byte beforePi = (byte) (radSq * thirdHeight);

        return (byte) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static short volumeByDiameter(short diameter, short height) {
		short radius = (short) (diameter / 2);
		short radSq = (short) Math.pow(radius, 2);
		short thirdHeight = (short) (height / 3);
		short beforePi = (short) (radSq * thirdHeight);

        return (short) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static int volumeByDiameter(int diameter, int height) {
		int radius = diameter / 2;
		int radSq = (int) Math.pow(radius, 2);
		int thirdHeight = height / 3;
		int beforePi = radSq * thirdHeight;

        return (int) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static float volumeByDiameter(float diameter, float height) {
		float radius = diameter / 2;
		float radSq = (float) Math.pow(radius, 2);
		float thirdHeight = height / 3;
		float beforePi = radSq * thirdHeight;

        return (float) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static double volumeByDiameter(double diameter, double height) {
		double radius = diameter / 2;
		double radSq = Math.pow(radius, 2);
		double thirdHeight = height / 3;
		double beforePi = radSq * thirdHeight;

        return Math.PI * beforePi;
	}
	
	/**
	 * Finds the volume of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The volume of the cone.
	 */
	public static long volumeByDiameter(long diameter, long height) {
		long radius = diameter / 2;
		long radSq = (long) Math.pow(radius, 2);
		long thirdHeight = height / 3;
		long beforePi = radSq * thirdHeight;

        return (long) (Math.PI * beforePi);
	}

	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static byte surfaceAreaByRadius(byte radius, byte height) {
		byte heightSquared = (byte) Math.pow(height, 2);
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte heightAndRadiusRoot = (byte) Math.sqrt(heightSquared + radiusSquared);
		byte parentheses = (byte) (radius + heightAndRadiusRoot);
		byte beforePi = (byte) (radius * parentheses);

        return (byte) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static short surfaceAreaByRadius(short radius, short height) {
		short heightSquared = (short) Math.pow(height, 2);
		short radiusSquared = (short) Math.pow(radius, 2);
		short heightAndRadiusRoot = (short) Math.sqrt(heightSquared + radiusSquared);
		short parentheses = (short) (radius + heightAndRadiusRoot);
		short beforePi = (short) (radius * parentheses);

        return (short) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static int surfaceAreaByRadius(int radius, int height) {
		int heightSquared = (int) Math.pow(height, 2);
		int radiusSquared = (int) Math.pow(radius, 2);
		int heightAndRadiusRoot = (int) Math.sqrt(heightSquared + radiusSquared);
		int parentheses = radius + heightAndRadiusRoot;
		int beforePi = radius * parentheses;

        return (int) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static float surfaceAreaByRadius(float radius, float height) {
		float heightSquared = (float) Math.pow(height, 2);
		float radiusSquared = (float) Math.pow(radius, 2);
		float heightAndRadiusRoot = (float) Math.sqrt(heightSquared + radiusSquared);
		float parentheses = radius + heightAndRadiusRoot;
		float beforePi = radius * parentheses;

        return (float) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static double surfaceAreaByRadius(double radius, double height) {
		double heightSquared = Math.pow(height, 2);
		double radiusSquared = Math.pow(radius, 2);
		double heightAndRadiusRoot = Math.sqrt(heightSquared + radiusSquared);
		double parentheses = radius + heightAndRadiusRoot;
		double beforePi = radius * parentheses;

        return Math.PI * beforePi;
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param radius The radius of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static long surfaceAreaByRadius(long radius, long height) {
		long heightSquared = (long) Math.pow(height, 2);
		long radiusSquared = (long) Math.pow(radius, 2);
		long heightAndRadiusRoot = (long) Math.sqrt(heightSquared + radiusSquared);
		long parentheses = radius + heightAndRadiusRoot;
		long beforePi = radius * parentheses;

        return (long) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static byte surfaceAreaByDiameter(byte diameter, byte height) {
		byte radius = (byte) (diameter / 2);
		byte heightSquared = (byte) Math.pow(height, 2);
		byte radiusSquared = (byte) Math.pow(radius, 2);
		byte heightAndRadiusRoot = (byte) Math.sqrt(heightSquared + radiusSquared);
		byte parentheses = (byte) (radius + heightAndRadiusRoot);
		byte beforePi = (byte) (radius * parentheses);

        return (byte) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static short surfaceAreaByDiameter(short diameter, short height) {
		short radius = (short) (diameter / 2);
		short heightSquared = (short) Math.pow(height, 2);
		short radiusSquared = (short) Math.pow(radius, 2);
		short heightAndRadiusRoot = (short) Math.sqrt(heightSquared + radiusSquared);
		short parentheses = (short) (radius + heightAndRadiusRoot);
		short beforePi = (short) (radius * parentheses);

        return (short) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static int surfaceAreaByDiameter(int diameter, int height) {
		int radius = diameter / 2;
		int heightSquared = (int) Math.pow(height, 2);
		int radiusSquared = (int) Math.pow(radius, 2);
		int heightAndRadiusRoot = (int) Math.sqrt(heightSquared + radiusSquared);
		int parentheses = radius + heightAndRadiusRoot;
		int beforePi = radius * parentheses;

        return (int) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static float surfaceAreaByDiameter(float diameter, float height) {
		float radius = diameter / 2;
		float heightSquared = (float) Math.pow(height, 2);
		float radiusSquared = (float) Math.pow(radius, 2);
		float heightAndRadiusRoot = (float) Math.sqrt(heightSquared + radiusSquared);
		float parentheses = radius + heightAndRadiusRoot;
		float beforePi = radius * parentheses;

        return (float) (Math.PI * beforePi);
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static double surfaceAreaByDiameter(double diameter, double height) {
		double radius = diameter / 2;
		double heightSquared = Math.pow(height, 2);
		double radiusSquared = Math.pow(radius, 2);
		double heightAndRadiusRoot = Math.sqrt(heightSquared + radiusSquared);
		double parentheses = radius + heightAndRadiusRoot;
		double beforePi = radius * parentheses;

        return Math.PI * beforePi;
	}
	
	/**
	 * Finds the surface area of the cone.
	 * @param diameter The diameter of the base of the cone.
	 * @param height The height of the cone.
	 * @return The surface area of the cone.
	 */
	public static long surfaceAreaByDiameter(long diameter, long height) {
		long radius = diameter / 2;
		long heightSquared = (long) Math.pow(height, 2);
		long radiusSquared = (long) Math.pow(radius, 2);
		long heightAndRadiusRoot = (long) Math.sqrt(heightSquared + radiusSquared);
		long parentheses = radius + heightAndRadiusRoot;
		long beforePi = radius * parentheses;

        return (long) (Math.PI * beforePi);
	}
}
