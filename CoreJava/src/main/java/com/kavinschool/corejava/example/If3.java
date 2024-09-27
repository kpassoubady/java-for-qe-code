package com.kavinschool.corejava.example;

public class If3 {

	 public static void main(String args[]) {
	        int keith = 5, ken = 15, kavin = 10;
	        int max = 0;

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
