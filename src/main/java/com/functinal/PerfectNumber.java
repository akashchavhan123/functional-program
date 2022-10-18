package com.functinal;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Welcome To Perfect Number Program");

        // INPUT Positive Number
        System.out.print("Enter positive number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) number = -number;
        System.out.println("You entered "+number);
        // Calculate Divisors Sum
        int divisorSum = 0;
        for (int divisor = 1; divisor <= number / 2; divisor++) if (number % divisor == 0) divisorSum += divisor;
        // Check is Perfect Number or Not
        if (divisorSum == number) System.out.println(number+" is perfect number");
        else System.out.println(number+" is not perfect number");
        scanner.close();
    }

}
