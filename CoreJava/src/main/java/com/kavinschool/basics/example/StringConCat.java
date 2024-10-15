package com.kavinschool.basics.example;

public class StringConCat {
	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println("str1 + str2 = " + str3);
        System.out.println("str1 + str2 = " + str1 + str2);
        System.out.println("str1 + str2 = " + str1.concat(str2));
       
	}

}
