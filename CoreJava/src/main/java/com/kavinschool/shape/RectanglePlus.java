/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

/**
 * The Class RectanglePlus.
 *
 * @author kangs
 */
public class RectanglePlus extends Rectangle implements ShapeLabel, ShapeRainbowColor {

	/** The Constant NAME. */
	static final String NAME = "RectanglePlus";
	
	/** The Color. */
	private int Color;
	
	/** The Label. */
	private String Label;

	/**
	 * Instantiates a new rectangle plus.
	 *
	 * @param l the l
	 * @param b the b
	 */
	RectanglePlus(int l, int b) {
		super(l, b);
	}

	/**
	 * Instantiates a new rectangle plus.
	 *
	 * @param l the l
	 * @param b the b
	 * @param c the c
	 * @param text the text
	 */
	RectanglePlus(int l, int b, int c, String text) {
		super(l, b);
		Color = c;
		Label = text;
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
	public void setColorName(int ShapeColor) {
		Color = ShapeColor;
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
	 * @see com.kavinschool.shape.Rectangle#draw()
	 */
	/**
	 * <p>draw.</p>
	 */
	public void draw() {
		super.draw();
		System.out.println("Label: " + Label);
		System.out.println("Color: " + Color);
	}

	/**
	 * Draw.
	 *
	 * @param deep the deep
	 */
	public void draw(boolean deep) {
		this.draw();
		if (deep) {
			System.out.println("Area: " + super.area());
			System.out.println("Perimeter: " + super.perimeter());
		}

	}
}
