package com.bridgelabz;

public class SumExample {
    static void sum(){
        int x = 10;
        int y = 20;
        int sum = x+y;
        System.out.println("Sum is:" +sum);
    }

    static int multiply(int x,int y){
        int multiplication = x*y;
        return multiplication;
    }

    static int sub(int x,int y){
        int subtraction = x-y;
        return subtraction;
    }

    static int divide(int x,int y){
        int division = x/y;
        return division;
    }

    static void calculator(int data){
        int result = data+45;
        System.out.println("final:"+result);
    }

    public static void main(String[] args){
        sum();
        int result = multiply(3,7);
        System.out.println("multiplication is:"+result);
        calculator(result);
        int result2 = sub(6,8);
        System.out.println("subtraction is:"+result2);
        calculator(result2);
        int result3 = divide(18,2);
        System.out.println("division is:"+result3);
        calculator(result3);
    }
}
