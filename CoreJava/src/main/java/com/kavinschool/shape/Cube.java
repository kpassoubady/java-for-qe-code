/*
 * Kangeyan Passoubady
 * (c) Kavin School -2024
 */
package com.kavinschool.shape;

/**
 * The Class Cube.
 *
 * @author kangs
 */
public class Cube extends Shape3D {

	   /** The side. */
   	double side;
	    
    	/** The Constant NAME. */
    	static final String NAME = "Cube";

	    /**
    	 * Instantiates a new cube.
    	 *
    	 * @param s the s
    	 */
    	Cube(int s) {
	        side = s;
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
	        return 6 * side * side;
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
	        return side * side * side;
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
	        return 12 * side;
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
	        System.out.println("Side: " + side);
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
	        Cube.total3dShapes++;
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

	    /* (non-Javadoc)
    	 * @see java.lang.Object#finalize()
    	 */
//    	@Override
//	    protected void finalize() {
//	        System.out.println("Finalizing " + id);
//	    }
}
