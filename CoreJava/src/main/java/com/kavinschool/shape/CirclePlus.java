/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

/**
 * The Class CirclePlus.
 *
 * @author kangs
 */
public class CirclePlus extends Circle implements ShapeColor, ShapeLabel {

	/** The Constant NAME. */
	static final String NAME = "CirclePlus";

	/** The Color. */
	private int Color;
	
	/** The Label. */
	private String Label;

	/**
	 * Instantiates a new circle plus.
	 *
	 * @param r the r
	 */
	CirclePlus(int r) {
		super(r);
	}

	/**
	 * Instantiates a new circle plus.
	 *
	 * @param radius the radius
	 * @param CircleColor the circle color
	 * @param CircleLabel the circle label
	 * @throws ColorRangeException the color range exception
	 */
	CirclePlus(double radius, int CircleColor, String CircleLabel) throws ColorRangeException {
		super(radius);
		setShapeLabel(CircleLabel);
		setColorName(CircleColor);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#getColorName()
	 */
	/**
	 * <p>getColorName.</p>
	 *
	 * @return a int
	 */
	public int getColorName() {
		return Color;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#setColorName(int)
	 */
	/** {@inheritDoc} */
	public void setColorName(int ColorName) throws ColorRangeException {
		Color = ColorName;
		if (Color < 0 || Color > 255)
			throw new ColorRangeException("An out of range color value was specified");
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeColor#resetColor()
	 */
	/**
	 * <p>resetColor.</p>
	 */
	public void resetColor() {
		Color = 0;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#setShapeLabel(java.lang.String)
	 */
	/** {@inheritDoc} */
	public void setShapeLabel(String ShapeLabel) {
		Label = ShapeLabel;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#getShapeLabel()
	 */
	/**
	 * <p>getShapeLabel.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getShapeLabel() {
		return Label;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.ShapeLabel#resetLabel()
	 */
	/**
	 * <p>resetLabel.</p>
	 */
	public void resetLabel() {
		Label = "";
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Circle#draw()
	 */
	/**
	 * <p>draw.</p>
	 */
	public void draw() {
		super.draw();
		System.out.println("Label: " + Label);
		System.out.println("Color: " + Color);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Circle#draw(boolean)
	 */
	/** {@inheritDoc} */
	public void draw(boolean deep) {
		this.draw();
		if (deep) {
			System.out.println("Area: " + super.area());
			System.out.println("Perimerter: " + super.perimeter());
		}

	}
}
