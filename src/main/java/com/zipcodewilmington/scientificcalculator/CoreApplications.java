package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class CoreApplications {
    Integer num1, num2, value;
    char operator;
//    Core Features
//    All calculators should have the following features:
//    A state, representing the value currently displayed on the calculator (default 0) *
        public int defaultState() {
//          String defaultState = "0";
            int defaultState = 0;
            int displayNumber = defaultState;
            return displayNumber;
        }

//    Get the current number on the display *


//    Clear the display *
        public static void clearDisplay() {
            //defaultState();
        }

//    Change the number on the display *
        public Integer getNumbers() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number");
            num1 = in.nextInt();
            System.out.println("Enter the operator (+,-,*,/,^,r (for root),i (for inverse), e (for exponent)");
            operator = in.next().charAt(0);
            //if statement here if they choose an operator that requires a second number
            System.out.println("Enter the second number");
            num2 = in.nextInt();
            return 0;
        }


//    Add, subtract, multiply, and divide the value on the display by a given number
        public Integer calculate()
        {
            switch(operator)
            {
                // performs addition between numbers
                case '+':
                    value = Math.addExact(num1,num2);
                    break;
                    // performs subtraction between numbers
                case '-':
                    value = Math.subtractExact(num1,num2);
                    break;

                    // performs multiplication between numbers
                case '*':
                    value = Math.multiplyExact(num1,num2);
                    break;

                    // performs division between numbers
                case '/':
                    value = Math.floorDiv(num1,num2);
                    break;

                case 'r':
                    //value = Math.sqrt((double)num1);
                    break;

                    default:
                        errorMessage();
                        break;
            }
            return value;
        }

//    Calculate the square (x2) and square root (√x) of the number on the display *
//    Calculate variable exponentiation (xy)
//    Calculate the inverse of the number on the display (1/x) *
//    Invert the sign of the number on the display (switch between positive and negative)



//    Update the display to Err if an error occurs (eg: Division by zero) *
//    Errors must be cleared before any other operation can take place *
    public String errorMessage()
    {
         String errorMessage = "Err";
         return errorMessage;
    }



}
