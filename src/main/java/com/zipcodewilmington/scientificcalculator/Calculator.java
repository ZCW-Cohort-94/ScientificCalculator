package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.MainApplication.isNumeric;

public class Calculator {
    String yValueInput = "";
    double mem = 0;
    double yValue = 0;
    double result = 0;
    Scanner scanner = new Scanner(System.in);

    public double add(double display) {
        System.out.println("Enter second number: ");
        yValueInput = scanner.nextLine();
        if (yValueInput.equals("MRC")) {
            result = add(display, mem);
            return result;
        } else if (isNumeric(yValueInput)) { //checks if its a number
            yValue = Double.parseDouble(yValueInput);//parses string as double
            result = add(display, yValue);//this is logic line
            return result; //result of x + y and returns it calc.run();
        }
        return result;
    }

    public double sub(double display) {//**need to add 2nd input like add**
        System.out.println("Enter second number: ");
        yValueInput = scanner.nextLine();
        if (isNumeric(yValueInput)) { //checks if its a number
            yValue = Double.parseDouble(yValueInput);//parses string as double
            result = display - yValue;//this is logic line
            return result; //result of x + y and returns it calc.run();
        }
        return result;
    }

    public double mul(double display) {//**need to add 2nd input like add**
        System.out.println("Enter second number: ");
        yValueInput = scanner.nextLine();
        if (isNumeric(yValueInput)) { //checks if its a number
            yValue = Double.parseDouble(yValueInput);//parses string as double
            result = display * yValue;//this is logic line
            return result; //result of x + y and returns it calc.run();
        }
        return result;
    }

    public double div(double display) {//**need to add 2nd input like add**
        System.out.println("Enter second number: ");
        yValueInput = scanner.nextLine();
        if (isNumeric(yValueInput)) { //checks if its a number
            yValue = Double.parseDouble(yValueInput);//parses string as double
            if (yValue == 0) {
                System.out.println("Err");
            }
            result = display / yValue;//this is logic line
            return result; //result of x + y and returns it calc.run();
        }
        return result;
    }

    public double sq(double display) {
        result = display * display;//logic line
        return result; //return line
    }

    public double sqRoot(double display) {
        result = sqrt(display);
        return result;
    }

    public double exp(double display) {//**need to add 2nd input like add**
        result = Math.pow(display, yValue);
        return result;
    }
    public double inv(double display) {
            result = 1 / display;
            return result;
    }
    public double neg(double display) {
        result = -1 * display;//logic line
        return result;
    }

    //method provides a way to do something with display value based on user input
    public double store(double display) {
        mem = display;
        System.out.println("Stored current display.");
        return mem;
    }

    public double storeClear(double display) {
        mem = 0;
        System.out.println("Memory cleared.");
        return display;
    }

    public double storeRecall(double display) {
        System.out.println("Stored value used.");
        return mem;
    }

    public double run(String userInput, double display) {
        if (userInput.equals("+")) {
            this.add(display);
            return result;
        } else if (userInput.equals("-")) {
            this.sub(display);
            return result;
        } else if (userInput.equals("*")) {
            this.mul(display);
            return result;
        } else if (userInput.equals("/")) {
            this.div(display);
            return result;
        } else if (userInput.equals("sq")) {
            this.sq(display);
            return result;
        } else if (userInput.equals("M+")) {
            this.store(display);
            return mem;
        } else if (userInput.equals("MC")) {
            this.storeClear(display);
            return mem;
        } else if (userInput.equals("MRC")) {
            this.storeRecall(display);
            return mem;
        } else if (userInput.equals("sqrt")) {
            this.sqRoot(display);
            return result;
        } else if (userInput.equals("^")) {
            this.exp(display);
            return result;
        } else if (userInput.equals("inv")) {
            this.inv(display);
            return result;
        } else if (userInput.equals("neg")) {
            this.neg(display);
            return result;
        }
        return display;
    }

    //for testing
    public double add(double x, double y) {
        return x + y;
    }

    public double sqrt(double x) {
        return Math.sqrt(x);
    }
}



