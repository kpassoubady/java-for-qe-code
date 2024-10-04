package com.kavinschool.basics.example;

/**
 * <p>If4 class.</p>
 *
 * @author kangs
 */
public class If4 {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        int keith = 5, ken = 10, kavin = 15;
        int max = 0;

        //Simple If
        if (keith > ken) {
            System.out.println("Keith has more money than Ken");
        }
		
        //Simple If
		if (keith < ken) {
		            System.out.println("Ken has more money than Keith");
		}

        // if-else clause
        if (keith > ken) {
            System.out.println("Keith has more money than Ken");
            max = keith;
        } else {
            max = ken;
            System.out.println("Ken has more money than Keith");
        }
		
        System.out.println("The maximum value between Keith and Ken is:" + max);

        //if else-if and nested if-else
        if (keith > ken) {
            System.out.println("Keith has more money than Ken");
            max = keith;
        } else if (kavin > ken) {
            max = kavin;
            System.out.println("Kavin has more money than Ken");
        } else if (kavin < ken) {
            max = ken;
            System.out.println("Ken has more money than Keith");
		}
		else if (keith == ken) {
            max = keith;
            System.out.println("Keith and Ken has same money");
            
            if (max == kavin) {
                System.out.println("Kavin has equal money with Ken and Kavin");
            }
            else {
                System.out.println("Kavin is not having equal money with rest of them");
            }
        }
        System.out.println("The maximum value between Keith, Ken and Kavin is:" + max);

    }
}
