package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import org.codehaus.plexus.util.cli.Commandline;

public class ScientificFeatures {
    String display = "default";
    String mode = "radians";
    double result;
    double num1;
    double num2;
    String operator;
    double mem = 0;
    Scanner sc = new Scanner(System.in);

    public ScientificFeatures(){

    }
    //this method should get current display and switch to next default mode
    public void switchDisplayMode() {
        if (display.equals("default")) {
            display = "binary";
        } else if (display.equals("binary")) {
            display = "octal";
        } else if (display.equals("octal")) {
            display = "decimal";
        } else if (display.equals("decimal")) {
            display = "hexadecimal";
        } else if (display.equals("hexadecimal"))
            display = "default";
    }

    //method provides a way to switch displays manually
    public void switchDisplayMode(String display) {
        if (!display.equals("default") && !display.equals("binary")
                && !display.equals("octal")
                && !display.equals("decimal")
                && !display.equals("hexadecimal")) {
            throw new IllegalArgumentException("Enter correct value.");
        } else {
            this.display = display;
        }
    }

    //method provides a way to do something with display value based on user input
    public double storeValue(String memKey, double currentlyOnDisplay) {
        if (memKey.equals("M+")) {
            mem = currentlyOnDisplay;
        } else if (memKey.equals("MC")) {
            mem = 0;
        } else if (memKey.equals("MRC")) {
            return mem;
        }

        return mem;
    }

    //gets user input and spits out sin value
    public double sin(double userInput) {
        result = Math.sin(userInput);
        return result;
    }

    //gets user input and spits out cos value
    public double cos(double userInput) {
        result = Math.cos(userInput);
        return result;
    }

    //gets user input and spits out tan value
    public double tan(double userInput) {
        result = Math.tan(userInput);
        return result;
    }

    //gets user input and spits out inverse sin value
    public double invSin(double userInput) {
        result = Math.asin(userInput);
        return result;
    }

    //gets user input and spits out inverse cos value
    public double invCos(double userInput) {
        result = Math.acos(userInput);
        return result;
    }

    //gets user input and spits out inverse tan value
    public double invTan(double userInput) {
        result = Math.atan(userInput);
        return result;
    }

    //switches units from degrees to radians
    public void switchUnitsMode() {
        if (mode.equals("degrees")) {
            mode = "radians";
        } else if (mode.equals("radians")) {
            mode = "degrees";
        }
    }

    //method to switch modes manually and exits program if user enters invalid response
    public void switchUnitsMode(String mode) {
            if (!mode.equals("degrees") && !display.equals("radians")) {
                throw new IllegalArgumentException("Enter correct value.");
            } else {
                this.mode = mode;
            }
        }


        //gets user input and uses log base 10 function on number
        public double log(double userInput) {
            result = Math.log10(userInput);
            return result;
        }

        //gets user input and uses ln on number
        public double invLog(double userInput) {
            //result = Math.(userInput);
            return result;
        }

    //gets user input and
    public double ln(double userInput) {
        result = Math.log(userInput);
        return result;
    }

    public double invLn(double userInput) {
      //  result = Math.(userInput);
        return result;
    }


    public double factorialFunc(double userInput) {
        for (int i = 0; i <= userInput; i++) {
            result *= i;
        }
        return result;
    }

    public void run(String userInput) {
        if (operator.equals("cycled")) {
            this.switchDisplayMode();
        } else if (operator.equals("dmode")) {
            System.out.println("Please choose display mode: ");
            display = sc.nextLine();
            this.switchDisplayMode(display);
        } else if (operator.equals("cycleu")) {
            this.switchUnitsMode();
        }else if (operator.equals("umode")) {
            System.out.println("Please choose display mode: ");
            mode = sc.nextLine();
            this.switchUnitsMode(mode);
        } else if (operator.equals("sin")) {
            this.sin();
        } else if (operator.equals("cos")) {
            this.cos();
        } else if (operator.equals("tan")) {
            this.tan();
        } else if (operator.equals("invsin")) {
            this.invSin();
        } else if (operator.equals("invcos")) {
            this.invCos();
        } else if (operator.equals("invtan")) {
            this.invTan();
        }
    }
}
