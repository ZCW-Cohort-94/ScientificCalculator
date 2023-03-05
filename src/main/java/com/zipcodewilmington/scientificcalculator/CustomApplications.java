package com.zipcodewilmington.scientificcalculator;

import org.codehaus.plexus.util.StringUtils;

import java.util.Scanner;


public class CustomApplications {

    String operation;
    int inputNumber1;
    int inputNumber2;

    public void getNumbers() {
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

    public void calculate() {
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

                break;
            case "gcd":

                System.out.println("Greatest Common Divisor [GCD] of " + inputNumber1 + " and "
                        + inputNumber2 + " is " + gcd);
                break;
        }
    }

    public static void main(String[] args) {
        CustomApplications calc1 = new CustomApplications();
        calc1.getNumbers();
        //calc1.calculate();
    }
}








