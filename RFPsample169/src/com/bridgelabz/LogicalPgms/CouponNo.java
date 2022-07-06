package com.bridgelabz.LogicalPgms;

public class CouponNo {
    public static void main(String[] args){
        char[] chars = "abcdefghijklmnop135654535".toCharArray();

        int max = 100000000;

        double d = Math.random();
        int random = (int) (d * max);
        String sb = "";
        System.out.println("random double " + d + " random at start " + random);

        while (random > 0) {
            sb = sb + (chars[random % chars.length]);
            random /= chars.length;
            System.out.println(random + "  " + random % chars.length + " sb is " + sb);
        }

        String CouponNo = sb.toString();
        System.out.println("Coupon Number: " + CouponNo);
    }
}
