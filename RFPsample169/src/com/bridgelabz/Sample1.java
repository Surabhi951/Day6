package com.bridgelabz;

    // JDK = > Java Development Kit
// JDK => JRE, compiler , debugger ,javadoc etc....
// JRE => Java Runtime Environment
// JRE => JVM (Java Virtual Machine) .....

// .java file (source file)
// compiler will take this .java file and compile the file and converts it into .class file
// .class file will have the byte code
// byte code is given to JVM which interprets this code into machine readable form and executes the code
// JVM is calling the main method

    public class Sample1 {

        public static void main(String[] args) {
            // selection statements
            // if-else  , if-else-if  , switch

            int x= 6;
            int y = 9;

            if(x >= 10 && y>=15){
                System.out.println("if ->" + x + " and " + y);
            }
            else if(x<5 || y<8){
                System.out.println("else-if ->" + x + " and " + y);
            }
            else {
                System.out.println("else ->" + x+ " and " + y);
            }


        }
    }



