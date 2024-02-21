package com.excelon.activity;

public class Program1 {

	public static void main(String[] args) {
		int num=456;
		int digit1 = num / 100; // Extracting hundreds place digit
        int remaining = num % 100;
        int digit2 = remaining / 10; // Extracting tens place digit
        int digit3 = remaining % 10;
		int sum=digit1+digit2+digit3;
		System.out.println("Sum of three digits: " +sum);

	}

}
