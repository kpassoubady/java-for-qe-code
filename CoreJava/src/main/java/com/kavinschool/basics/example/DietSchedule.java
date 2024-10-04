package com.kavinschool.basics.example;

/**
 * <p>DietSchedule class.</p>
 *
 * @author kangs
 */
public class DietSchedule {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        int option = (int) (Math.random() * 8.0);
        System.out.println("Option:" + option);

        switch (option) {
            case 1: System.out.println("Monday");
            case 2: System.out.println("Tuesday");
            case 4: System.out.println("Thursday");
            case 6: System.out.println("Saturday");
                    System.out.println(" Vegetarian");
                    break;
            case 3: System.out.println("Wednesday");
            case 5: System.out.println("Friday");
            case 7: System.out.println("Sunday");
                    System.out.println(" Non Vegetarian");
                    break;
            default: System.out.println("Are you on earth?");
                    break;
        }
    }
}
