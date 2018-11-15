package com.gohooljava.com;

public class Main {

    public static void main(String[] args) {

         //for loop while loop

        int i = 0;

        while (i < 5) {

            System.out.println(" Counting.. " + i);
            i++;
        }
        
        for (int h = 0; h < 20; h++) {

           //remainder ( %) - if h/4 has no remainder do logic
            if ( h % 4 == 0) {

                System.out.println( h + " is a multiple of 4 ");
            }
        }

	  //Basic operations
        //Addition = +
        //Subtraction "-"
        //Multiplication "*"
        //Division "/"

       int firstNum1 = 34;
       int secondNum2 = 3;

       //Addition
       System.out.println("The sum is " + (firstNum1 + secondNum2));

       //Subtraction
       System.out.println("The result is " + (firstNum1 - secondNum2));

        //Multiplication
       System.out.println("The result is " + (firstNum1 * secondNum2));

        //Division
       System.out.println("The result is " + (firstNum1 / secondNum2));

        // ==== Relational Operators ===
        /*
           - == comparison, not assignment
           - != NOT equal
           - > greater than
           - < less than
           - >= Greater than or equal
           - <= Less than or equal

           ==== Logical Operators =====
            - AND ( && ) == both "sides" need to be TRUE in order for the whole expression to return true
            - OR ( || )
            - NOT ( ! )
         */

//        double firstNum = 10;
//        double secondNum = 3;
//        double result = 0;
//
//        boolean isOld = true;
//        boolean isYoung = false;
//
//
//        if ( (isOld && !isYoung) && (firstNum < secondNum)  ) {
//
//            System.out.println("Horray!!");
//
//        }else {
//
//            System.out.println("Not right!");
//
//        }

//        result = firstNum % secondNum;
//
//        // If statements
//        if (firstNum <= secondNum) {
//
//
//            System.out.println("The remainder is " + result );
//
//        }else {
//
//            System.out.println("Numbers aren't equal");
//
//        }


    }
}
