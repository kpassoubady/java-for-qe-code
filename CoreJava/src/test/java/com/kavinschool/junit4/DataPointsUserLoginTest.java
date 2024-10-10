package com.kavinschool.junit4;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

class User {
    private String userId;
    private String password;

    public User(String userId, String password) {
        super();
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", password=" + password + "]";
    }
}

@RunWith(Theories.class)
public class DataPointsUserLoginTest {

    @DataPoint
    public static User user1 = new User("Student1", "Student1@Kavin~School");

	@DataPoint
    public static User user2 = new User("Student2", "Student2@Kavin~School");

	@DataPoint
    public static User user3 = new User("Student3", "Student3@Kavin~School");

    @Theory
    public void testLogin(User curUser) throws Exception {
        System.out.println(curUser);
        Assert.assertNotNull("User Id should not be null", curUser.getUserId());
        Assert.assertNotNull("Password should not be null", curUser.getPassword());
    }
}
