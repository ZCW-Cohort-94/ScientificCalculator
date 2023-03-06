package com.zipcodewilmington.scientificcalculator;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    // 1. Make while loop to ensure the application runs 24/7 until the user quits
// 2. Make an instruction for if the user enters "quit", Break the while loop
// 3. Every iteration of the while loop will ask the user for the scanner input.
// 4. Check the user input, see if they entered a number or an operator
// 5. Have an if statement that checks operator, maybe the if statement will be long and check every single operator
    // Such as : Add/Divide/ Cos/ Log.. etc
// 6. Every operator will do something special with it's own logic.
    // For instance : Add will expect a secondary value, Prompt the user to enter second value and press "=" when done
    // Every operator will return the result
// 7. At the end of the while loop, the display will be shown to the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double display = 0;
        String operator = "";

        ScientificFeatures scientificFeatures = new ScientificFeatures();
        Calculator calculator = new Calculator();

        while (true) {
            // Ask user for scanner.
            // 3. Every iteration of the while loop will ask the user for the scanner input.
            if (scientificFeatures.scientificDisplay.equals("binary")) {
                System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(display)));
            } else if (scientificFeatures.scientificDisplay.equals("hex")) {
                System.out.println(Double.toHexString(display));
            } else if (scientificFeatures.scientificDisplay.equals("octal")) {
                System.out.println(Integer.toOctalString((int)Math.round(display)));
            } else {
                System.out.println(display + "");
            }
            // 4. Check the user input, see if they entered a number or an operator
            String userInput = sc.nextLine();
            // 2. Make an instruction for if the user enters "quit", Break the while loop
            if (userInput.equals("quit")) {
                System.out.println("Calculator app will now quit.");
                break;
            } else if (userInput.equals("clr")) {
                display = 0;
                System.out.println(display);
            }
            //if the user enters a double then make display = new double value
            if (isNumeric(userInput)) {
                display = Double.parseDouble(userInput);
                //    checks userInput between calc and scientific and match userinput to whatever i put in as a string
            }
            display = scientificFeatures.run(userInput, display);
            display = calculator.run(userInput, display);

        //concat two int into one store into display
        }
        //if user enters another number into the display field, then concat/append both doubles into one
        // 5. Have an if statement that checks operator, maybe the if statment will be
        // really long and check for every single operator
        // Such as : Add/Divide/ Cos/ Log.. etc
        // else if (isNumeric(userInput) == false) {
        //     scientificFeatures.run(userInput);
        //} else if (isNumeric(userInput) == false) {
        //    calculator.run(userInput);
        //}
        System.out.println(display);
    }
    // 6. Every operator will do something special with it's own logic.
    // For instance : Add will expect a secondary value, Prompt the user to enter in
    // a second value and press "=" when done
    // Every operator will return the result
    // 7. At the end of the while loop, the display will be shown to the user.

    // (this is the last line System.out.println(display))
    public static boolean isNumeric(String userInput) { //change method name to paruse userinput
        try {
            Double.parseDouble(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
