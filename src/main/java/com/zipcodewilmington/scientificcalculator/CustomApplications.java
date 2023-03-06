package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;


public class CustomApplications {

    public String operation;
    public int inputNumber1;
    public int inputNumber2;

    public void getInputNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Operation:");
        System.out.println("Least Common multiple [LCM]");
        System.out.println("Greatest Common Divisor [GCD]");
        operation = in.nextLine();

        //Enter Numbers
        System.out.println("Enter the first number");
        inputNumber1 = in.nextInt();
        System.out.println("Enter the Second number");
        inputNumber2 = in.nextInt();
        this.calculate();
    }

    public int calculate() {
        int gcd = 1;
        int lcm;
        for (int i = 1; i <= inputNumber1 && i <= inputNumber2; i++) {
            if (inputNumber1 % i == 0 && inputNumber2 % i == 0) {
                gcd = i;
            }
        }
        switch (operation.toLowerCase()) {
            case "lcm":
                lcm = (inputNumber1 * inputNumber2) / gcd;
                System.out.println("Least Common multiple [LCM] of " + inputNumber1 + " and "
                        + inputNumber2 + " is " + lcm);
                return lcm;

                case "gcd":
                System.out.println("Greatest Common Divisor [GCD] of " + inputNumber1 + " and "
                        + inputNumber2 + " is " + gcd);
                return gcd;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        CustomApplications calc1 = new CustomApplications();
        calc1.getInputNumbers();
        //calc1.calculate();
    }
}








