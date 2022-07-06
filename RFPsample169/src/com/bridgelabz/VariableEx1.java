package com.bridgelabz;

public class VariableEx1 {

// Types of Variables => Local , Instance , Static

    // Local
    // Local variables can be accessed only within the block where it is declared.
    // It is mandatory for me to initialize



    static void m1(int var5){
        System.out.println(var5);
//        System.out.println(x);
//        System.out.println(l);
    }


    public static void main(String[] args) {
        int y;  // declaration
        int x = 10;   // declaration + initialization
        long l = 2147483648L;
        float f = 21474835666.54123f;
        double d= 2012.54123234545;
//        System.out.println(args[0]);
        boolean b = true;
//        System.out.println(y);

        int var5 = 9;
        m1(var5);
        int var1=6;
        int var2 = 9;

        int var3;
        if(var1 >= 10 && var2>=15){
            int w = 10;
            var3 = 300;
            System.out.println(var3);
            System.out.println("if ->" + var1 + " and " + var2);
            System.out.println(x);
            System.out.println(l);
            System.out.println(b);
//            System.out.println(e);
        } else {
            int e = 20;
            System.out.println(e);
//            System.out.println(w);
            var3 = 400;

        }
          System.out.println(var3);
//        System.out.println(w);
//        System.out.println(e);


//       System.out.println(var3);
    }
}
