package com.kavinschool.shape;

// What are static classes in Java?
// A static class is a class that is a nested class and marked as static.

// What are the features of a static class?
// A static class can have static variables, static methods, and static blocks.

/**
 * <p>StaticClassExample class.</p>
 *
 * @author kangs
 */
public class StaticClassExample {
    // Static class can have static variables
    private static final int staticVariable = 10;

    // Static class can have static blocks
    static {
        System.out.println("StaticClassExample static block");
    }

    // class can have inner static class
    private static class InnerStaticClass {
        // Static class can have static variables
        private static final int innerStaticVariable = 20;
    }

    // Static class can have static methods
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("StaticClassExample");
        System.out.println("staticVariable = " + staticVariable);
        System.out.println("InnerStaticClass.innerStaticVariable = " + InnerStaticClass.innerStaticVariable);
    }
}
