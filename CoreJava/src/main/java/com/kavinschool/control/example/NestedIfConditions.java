package com.kavinschool.control.example;

/**
 * <p>NestedIfConditions class.</p>
 *
 * @author kangs
 */
public class NestedIfConditions {

// Before: Nested if
//if (isValid(user)) {
//    if (hasPermission(user)) {
//        performAction(user);
//    }
//}

// After: Guard clause
//if (!isValid(user)) return;
//if (!hasPermission(user)) return;
//    performAction(user);

}
