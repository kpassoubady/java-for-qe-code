/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

/**
 * The Class Cuboid.
 *
 * @author kangs
 */
public class Cuboid extends Shape3D {

	/** The length. */
	double height, width, length;
	
	/** The Constant NAME. */
	static final String NAME = "Cubiod";

	/**
	 * Instantiates a new cuboid.
	 *
	 * @param height the height
	 * @param width the width
	 * @param length the length
	 */
	Cuboid(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;

		count();
		count3D();
		assignUniqueID();
	}

	/**
	 * Instantiates a new cuboid.
	 *
	 * @param h the h
	 * @param w the w
	 * @param l the l
	 */
	Cuboid(int h, int w, int l) {
		height = h;
		width = w;
		length = l;

		count();
		count3D();
		assignUniqueID();

	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#area()
	 */
	/**
	 * <p>area.</p>
	 *
	 * @return a double
	 */
	public double area() {
		return 2 * (height * width + width * length + length * height);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape3D#volume()
	 */
	/**
	 * <p>volume.</p>
	 *
	 * @return a double
	 */
	public double volume() {
		return height * width * length;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#perimeter()
	 */
	/**
	 * <p>perimeter.</p>
	 *
	 * @return a double
	 */
	public double perimeter() {
		return 2 * (length + width + height);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#draw()
	 */
	/**
	 * <p>draw.</p>
	 */
	public void draw() {
		System.out.println("Name:" + NAME);
		System.out.println("Type: " + type);
		System.out.println("ID: " + id);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#count()
	 */
	/**
	 * <p>count.</p>
	 */
	protected void count() {
		Shape3D.totalShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape3D#count3D()
	 */
	/**
	 * <p>count3D.</p>
	 */
	protected void count3D() {
		Cuboid.total3dShapes++;
	}

	/* (non-Javadoc)
	 * @see com.kavinschool.shape.Shape#assignUniqueID()
	 */
	/**
	 * <p>assignUniqueID.</p>
	 */
	protected void assignUniqueID() {
		id = Shape.totalShapes * 10000;
	}

}
