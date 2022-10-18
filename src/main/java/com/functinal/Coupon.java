package com.functinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Coupon {
    public static ArrayList<Integer> coupons = new ArrayList<Integer>(500);

    public static void generateCoupon () {
        while (true) {
            int crrCoupon = (int) Math.floor(Math.random() * 10000);
            if (!coupons.contains(crrCoupon) && 1000 <= crrCoupon && crrCoupon <= 9999) {
                coupons.add(crrCoupon);
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Coupon Program");

        // Input how many coupons to generate
        System.out.print("How many coupons you have to genrate : ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCoupons = scanner.nextInt();
        if (numberOfCoupons < 0) numberOfCoupons = -numberOfCoupons;
        System.out.println("You have to genrate "+numberOfCoupons+" coupons");
        // Generate coupon number of times
        for (int i = 0; i < numberOfCoupons; i++) generateCoupon();
        System.out.println("Genrated coupons are");
        for (int i = 0; i < numberOfCoupons; i++) System.out.println(coupons.get(i));
        scanner.close();
    }
}
