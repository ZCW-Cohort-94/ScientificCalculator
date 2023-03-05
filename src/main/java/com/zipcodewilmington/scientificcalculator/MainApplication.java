package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    //variables
    public static void main(String[] args) {
        Console.println("The current value is 0");
//        String s = Console.getStringInput("Enter a function");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
////        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a double", d);


        Calculator mainCalc = new Calculator();
        boolean isOn = true;
        Console.println("Type ~ to exit. 😇");
        while (isOn) {
            String whatFunction = Console.getStringInput("Enter a function, press m to save");
            double number;

            switch (whatFunction) {
                case "~":
                    isOn = false;
                    return;
                case "+":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.addition(number);
                    break;
                case "-":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.subtraction(number);
                    break;
                case "/":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.division(number);
                    break;
                case "*":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.multiplication(number);
                    break;
                case "square":
                    mainCalc.square();
                    break;
                case "m":
                    mainCalc.m();
                    Console.println(mainCalc.savedValue + " has been saved.");
                    break;
                case ""
//                case "fdlksahg":
//                    mainCalc.dldlhv()
//
//                    break;
            } // switch ends

            Console.println("The value is now: %f", mainCalc.memoryValue);
        }

    } // void main

    // Main Calculator
    public static class Calculator {
        // this is the number on the screen of the calculator

        public double memoryValue = 0.0;
        public double savedValue = 0.0;
        public double testValue = 5;

        //Main Math
        public void addition(double x) {
            this.memoryValue += x;
        }

        public void subtraction(double x) {
            this.memoryValue -= x;
        }

        public void multiplication(double x) {
            this.memoryValue = memoryValue * x;
        }

        public void division(double x) {
            this.memoryValue = memoryValue / x;
        }

        public void square() {
            this.memoryValue = memoryValue * memoryValue;
        }

        public void m() {
            this.memoryValue = savedValue;
        }

//        public void mc(double x) {
//
//        }

        public void squareRoot(double x) {
            this.memoryValue = Math.sqrt(memoryValue);
        }

        public void inverse(double x) {
            this.memoryValue = (1 / memoryValue);
        }

        public void exponent(double x) {
            this.memoryValue = Math.pow(memoryValue, x);
        }

        public void switchSign(double x) {
            this.memoryValue = memoryValue * -1.0;
        }

        //Error
        public String err() {
            String message = "Err";
            return message;
        }
    }

        //Trig Functions
        public static class SciCalc {
            public double memoryValue = 0.0;
            public double savedValue = 0.0;
            public void sine(double x) {
                this.memoryValue = Math.sin(memoryValue);
            }

            public void cosine(double x) {
                this.memoryValue = Math.cos(memoryValue);
            }

            public void tangent(double x) {
                this.memoryValue = Math.tan(memoryValue);
            }

            // outputs in radians
            public void inverseSine(double x) {
                this.memoryValue = Math.asin(memoryValue);
            }

            public void inverseCosine(double x) {
                this.memoryValue = Math.acos(memoryValue);
            }

            public void inverseTangent(double x) {
                this.memoryValue = Math.atan(memoryValue);
            }

            //Log Functions
            public void log(double x) {
                this.memoryValue = Math.log10(memoryValue);
            }

            public void inverseLog(double x) {
                this.memoryValue = Math.pow(10, memoryValue);
            }

            public void naturalLog(double x) {
                this.memoryValue = Math.log(memoryValue);
            }

            public void inverseNatLog(double x) {
                this.memoryValue = Math.exp(memoryValue);
            }

            //Factorial
            public void factorial(double x) {
                double total = 1;
                for (double i = memoryValue; i >= 1; i--) {
                    total = (total * i);
                }
                this.memoryValue = total;
            }

            //Switch Units
            public void toDegrees(double x) {
                this.memoryValue = Math.toDegrees(memoryValue);
            }

            public void toRadians(double x) {
                this.memoryValue = Math.toRadians(memoryValue);
            }


            //Display Mode
//        public void toOctal() {
//           this.memoryValue = Double.toOctalString(memoryValue);
//        }
//
//        public void toBinary() {
//            this.memoryValue = Integer.toBinaryString(memoryValue);
//        }
//
//        public void binaryToDecimal() {
//            return Integer.parseInt(binary);
//        }
//
//        public String toHexa(int x) {
//            return Integer.toHexString(x);
//        }

            //Additional Functions
            public void cubed(double x) {
                this.memoryValue = Math.cbrt(memoryValue);
            }

            public String hello() {
                String message = "01134";
                return message;
            }
        } //Sci Calc

    public static class SciCalcSci {
        public double testValue = 5;
        public double savedValue = 0.0;
        public void sine(double x) {
            this.testValue = Math.sin(testValue);
        }

        public void cosine(double x) {
            this.testValue = Math.cos(testValue);
        }

        public void tangent(double x) {
            this.testValue = Math.tan(testValue);
        }

        // outputs in radians
        public void inverseSine(double x) {
            this.testValue = Math.asin(testValue);
        }

        public void inverseCosine(double x) {
            this.testValue = Math.acos(testValue);
        }

        public void inverseTangent(double x) {
            this.testValue = Math.atan(testValue);
        }

        //Log Functions
        public void log(double x) {
            this.testValue = Math.log10(testValue);
        }

        public void inverseLog(double x) {
            this.testValue = Math.pow(10, testValue);
        }

        public void naturalLog(double x) {
            this.testValue = Math.log(testValue);
        }

        public void inverseNatLog(double x) {
            this.testValue = Math.exp(testValue);
        }

        //Factorial
        public void factorial(double x) {
            double total = 1;
            for (double i = testValue; i >= 1; i--) {
                total = (total * i);
            }
            this.testValue = total;
        }

        //Switch Units
        public void toDegrees(double x) {
            this.testValue = Math.toDegrees(testValue);
        }

        public void toRadians(double x) {
            this.testValue = Math.toRadians(testValue);
        }


        //Display Mode
//        public void toOctal() {
//           this.testValue = Double.toOctalString(testValue);
//        }
//
//        public void toBinary() {
//            this.testValue = Integer.toBinaryString(testValue);
//        }
//
//        public void binaryToDecimal() {
//            return Integer.parseInt(binary);
//        }
//
//        public String toHexa(int x) {
//            return Integer.toHexString(x);
//        }

        //Additional Functions
        public void cubed(double x) {
            this.testValue = Math.cbrt(testValue);
        }

        public String hello() {
            String message = "01134";
            return message;
        }
    } //Sci Calc


} // class


