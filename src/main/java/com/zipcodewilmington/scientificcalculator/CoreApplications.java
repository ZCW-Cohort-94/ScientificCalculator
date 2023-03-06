package com.zipcodewilmington.scientificcalculator;
import com.sun.tools.javac.Main;

import java.util.Scanner;
public class CoreApplications extends MainApplication {
    public Integer num1, num2, value;
    String str2 = trungsCalculator();
    String num1Str;
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    ScientificApplications scienceApps = new ScientificApplications();
//    Core Features


    //    Clear the display *
    public static void clearDisplay() {
        trungsCalculator();
    }

    //    Add, subtract, multiply, and divide the value on the display by a given number
    public Integer calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer to calculate");

        //gets the first number of an input
        try{
            num1Str = in.nextLine();
            num1 = Integer.parseInt(num1Str);
        }catch(Exception e){
            System.out.println("Enter an integer!!");
            calculate();
        }
        stringBuilder.append(num1Str);
        stringBuilder2.append(num1Str);
        str2 = str2.replaceAll("0.0", stringBuilder.toString());
        System.out.println(str2);

        //get the user operator
        System.out.println("Enter an operator: +,-,*,/ or \"ac\" to clear");
        String operator = in.nextLine();
        if(operator.equals("ac")) {
            clearDisplay();
        }else{
            stringBuilder.append(operator);
            str2 = str2.replaceAll(stringBuilder2.toString(), stringBuilder.toString());
            System.out.println(str2);
            switch (operator) {
                case "ac":
                    clearDisplay();
                    break;
                case "+":
                    //get second number
                    System.out.println("Please enter another number");
                    num2 = in.nextInt();
                    stringBuilder2.setLength(0);
                    value = Math.addExact(num1, num2);
                    stringBuilder2.append(value);
                    System.out.println(str2.replaceAll(stringBuilder.toString(), stringBuilder2.toString()));
                    stringBuilder.setLength(0);
                    stringBuilder2.setLength(0);
                    scienceApps.doAgain();
                    break;
                case "-":
                    System.out.println("Please enter another number");
                    num2 = in.nextInt();
                    stringBuilder2.setLength(0);
                    value = Math.subtractExact(num1,num2);
                    stringBuilder2.append(value);
                    System.out.println(str2.replaceAll(stringBuilder.toString(), stringBuilder2.toString()));
                    stringBuilder.setLength(0);
                    stringBuilder2.setLength(0);
                    scienceApps.doAgain();
                    break;
                case "*":
                    System.out.println("Please enter another number");
                    num2 = in.nextInt();
                    stringBuilder2.setLength(0);
                    value = num1*num2;
                    stringBuilder2.append(value);
                    System.out.println(str2.replaceAll(stringBuilder.toString(), stringBuilder2.toString()));
                    stringBuilder.setLength(0);
                    stringBuilder2.setLength(0);
                    scienceApps.doAgain();
                    break;
                case "/":
                    System.out.println("Please enter another number");
                    //double num1Doub = num1;
                    num2 = in.nextInt();
                    stringBuilder2.setLength(0);
                //    Update the display to Err if an error occurs (eg: Division by zero) *
                    if(num2 == 0) {
                        errorMessage();
                    }else {
                    value = num1 / num2;
                    stringBuilder2.append(value);
                    System.out.println(str2.replaceAll(stringBuilder.toString(), stringBuilder2.toString()));
                    stringBuilder.setLength(0);
                    stringBuilder2.setLength(0);
                    scienceApps.doAgain();
                        break;
                    }
            }
        }
        return 0;
    } // end of calculate

    //    Errors must be cleared before any other operation can take place *
    public String errorMessage()
    {
        String errorMessage = "Err";
        str2 = str2.replaceAll(stringBuilder.toString(), errorMessage);
        System.out.println(str2);
        Scanner in = new Scanner(System.in);
        String clear = in.nextLine();
        if(clear.equals("ac")) {
            clearDisplay();
        }else{
            errorMessage();
        }
        return errorMessage;
    }
}



//    Invert the sign of the number on the display (switch between positive and negative)





