/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

import java.io.Serial;

/**
 * The Class ColorRangeException.
 *
 * @author kangs
 */
public class ColorRangeException extends Exception {

	/** The Constant serialVersionUID. */
	@Serial
	private static final long serialVersionUID = 8224930501456280322L;

	/**
	 * Instantiates a new color range exception.
	 *
	 * @param ErrorMsg the error msg
	 */
	public ColorRangeException(String ErrorMsg) {
		super(ErrorMsg);
	}

}
