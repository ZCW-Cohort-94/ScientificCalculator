package com.zipcodewilmington.scientificcalculator;

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

    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double display = 0;
        ScientificFeatures scientificFeatures = new ScientificFeatures();
        Calculator calculator = new Calculator();

        while (true) {
            // Ask user for scanner.
            // 3. Every iteration of the while loop will ask the user for the scanner input.
            System.out.println(display + "");
            // 4. Check the user input, see if they entered a number or an operator
            String userInput = sc.nextLine();
            this.isNumeric(userInput);
            // 2. Make an instruction for if the user enters "quit", Break the while loop
            if (userInput == "quit") {
                System.out.println("Calculator app will now quit.");
                break;
            } else {
                //if the user enters a double then make display = new double value
                   if (userInput == a number){
                       display = userInput;
                       //if user enters another number into the display field, then concat/append both doubles into one
                       if (userInput a 2nd number){
                           display = this.concat(userInput, userInput2);
                    }
                }
                // 5. Have an if statement that checks operator, maybe the if statment will be
                // really long and check for every single operator
                // Such as : Add/Divide/ Cos/ Log.. etc
                   else if (userInput.equals(operator)){
                    scientificFeatures.run(userInput);
                } else if (userInput.equals(operator)) {
                    calculator.run(userInput);
                }
            }
            // 6. Every operator will do something special with it's own logic.
            // For instance : Add will expect a secondary value, Prompt the user to enter in
            // a second value and press "=" when done
            // Every operator will return the result
            // 7. At the end of the while loop, the display will be shown to the user.

            // (this is the last line System.out.println(display))
            System.out.println(display);
        }

    }

    public static boolean isNumeric(String userInput) {
        try {
            Double.parseDouble(userInput);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public int concat(int a, int b)
    {

        // Convert both the integers to string
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);

        // Concatenate both strings
        String s = s1 + s2;

        // Convert the concatenated string
        // to integer
        int c = Integer.parseInt(s);

        // return the formed integer
        return c;
    }
}
