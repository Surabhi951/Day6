package com.bridgelabz.LogicalPgms;

import java.util.Scanner;

public class ReverseNO {
    public static void main(String[] args){
        int n, r;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            System.out.print(r);
            n = n/10;
        }
    }
}
