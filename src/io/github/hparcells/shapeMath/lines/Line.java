package io.github.hparcells.shapeMath.lines;

/**
 * All Line and Graph Based Math.
 * 
 * @author Hunter Parcells
 */
public class Line {
	/**
	 * Checks if the lines are parallel and returns the answer accordingly.
	 * @param x1 X position of the first point of line 1.
	 * @param y1 Y position of the first point of line 1.
	 * @param x2 X position of the second point of line 1.
	 * @param y2 Y position of the second point of line 1.
	 * @param x3 X position of the first point of line 2.
	 * @param y3 Y position of the first point of line 2.
	 * @param x4 X position of the second point of line 2.
	 * @param y4 Y position of the second point of line 2.
	 * @return True if the lines are parallel, else it returns false.
	 */
	public static boolean isParallel(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		double slope1 = (y2 - y1) / (x2 - x1);
		double slope2 = (y4 - y3) / (x4 - x3);
		
		if(slope1 == slope2) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Checks if the lines are perpendicular given both slopes and returns the answer accordingly.
	 * @param slope1 The slope of the first line.
	 * @param slope2 The slope of the second line.
	 * @return True if the lines are perpendicular, else it returns false.
	 */
	public static boolean isPerpendicular(double slope1, double slope2) {
		double finalSlope1 = 1 / -slope1;
		
		if(finalSlope1 == slope2) {
			return true;
		}else {
			return false;
		}
	}
}
