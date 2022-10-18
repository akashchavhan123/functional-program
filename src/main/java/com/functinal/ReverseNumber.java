package com.functinal;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome To Reverse Number Program");
        // INPUT number
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You entered "+number);
        // Reverse the number
        int reverse = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            reverse = reverse * 10 + tempNumber % 10;
            tempNumber /= 10;
        }
        // Show Reverse number
        System.out.println(number+"s revers number is "+reverse);
        scanner.close();
    }
}
