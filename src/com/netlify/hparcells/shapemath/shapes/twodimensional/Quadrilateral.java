package com.netlify.hparcells.shapemath.shapes.twodimensional;

public class Quadrilateral extends Polygon {
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @param angle3 The degres of the final given angle.
	 * @return The degrees of the missing angle.
	 */
	public static byte missingInteriorAngle(byte angle1, byte angle2, byte angle3) {
		return (byte) (360 - (angle1 + angle2 + angle3));
	}
	
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * * @param angle3 The degres of the final given angle.
	 * @return The degrees of the missing angle.
	 */
	public static short missingInteriorAngle(short angle1, short angle2, short angle3) {
		return (short) (360 - (angle1 + angle2 + angle3));
	}
	
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @param angle3 The degres of the final given angle.
	 * @return The degrees of the missing angle.
	 */
	public static int missingInteriorAngle(int angle1, int angle2, int angle3) {
		return 360 - (angle1 + angle2 + angle3);
	}
	
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static float missingInteriorAngle(float angle1, float angle2, float angle3) {
		return 360 - (angle1 + angle2 + angle3);
	}
	
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @return The degrees of the missing angle.
	 */
	public static double missingInteriorAngle(double angle1, double angle2, double angle3) {
		return 360 - (angle1 + angle2 + angle3);
	}
	
	/**
	 * Finds the missing interior angle of a quadrilateral.
	 * @param angle1 The degrees of one of the given angles.
	 * @param angle2 The degrees of the other given angle.
	 * @param angle3 The degres of the final given angle.
	 * @return The degrees of the missing angle.
	 */
	public static long missingInteriorAngle(long angle1, long angle2, long angle3) {
		return 360 - (angle1 + angle2 + angle3);
	}
}
