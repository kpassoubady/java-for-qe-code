/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

/**
 * The Interface ShapeColor.
 *
 * @author kangs
 */
public interface ShapeColor {
	
	/**
	 * Gets the color name.
	 *
	 * @return the color name
	 */
	int getColorName();

	/**
	 * Sets the color name.
	 *
	 * @param ColorName the new color name
	 * @throws com.kavinschool.shape.ColorRangeException the color range exception
	 */
	void setColorName(int ColorName) throws ColorRangeException;

	/**
	 * Reset color.
	 */
	void resetColor();
}
