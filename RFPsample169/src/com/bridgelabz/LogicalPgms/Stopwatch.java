package com.bridgelabz.LogicalPgms;

import java.util.Scanner;

public class Stopwatch {
    static double start=0, stop=0;
    static void starttime(){
        start = System.currentTimeMillis();
        System.out.println("started at" +start);
    }
    static void stoptime(){
        stop = System.currentTimeMillis();
        System.out.println("stopped at" +stop);
    }
    static void elapsedtime(){
        System.out.println("elapsed time is" + (stop - start)/1000);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to start");
        sc.next();
        starttime();
        System.out.println("Enter to stop");
        sc.next();
        sc.close();
        stoptime();
        elapsedtime();
    }
}
