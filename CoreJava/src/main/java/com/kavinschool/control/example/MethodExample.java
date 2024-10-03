package com.kavinschool.control.example;

public class MethodExample {

// Before: A method doing multiple things
//	public void processOrder(Order order) {
//	    validate(order);  // Responsibility 1: Validation
//	    calculateDiscount(order);  // Responsibility 2: Business logic for discount
//	    sendConfirmation(order);  // Responsibility 3: Send confirmation email
//	}
 

// After: Refactor into smaller methods
//public void processOrder(Order order) {
//    OrderValidator validator = new OrderValidator();
//    DiscountCalculator discountCalculator = new DiscountCalculator();
//    ConfirmationService confirmationService = new ConfirmationService();
//
//    if (validator.validate(order)) {  // Delegating validation
//        discountCalculator.applyDiscount(order);  // Delegating discount calculation
//        confirmationService.sendOrderConfirmation(order);  // Delegating confirmation
//    }
//}

}
