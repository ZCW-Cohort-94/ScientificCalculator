package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console; //not sure if i need to since it's in the same package
import java.util.zip.CheckedOutputStream;
import com.zipcodewilmington.scientificcalculator.BasicCalculator; //not sure if i need to since it's in the same package
import com.zipcodewilmington.scientificcalculator.ScientificCalculator; //not sure if i need to since it's in the same package

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

        public static void main(String[] args) {
        // Console console = new Console(); //instantiate the console class so i can use it. have to instantiate it because it's not static. not necessary since it's a static class


            Integer firstUserInput =  Console.getIntegerInput("Give me the first number to add");
            Integer secondUserInput =  Console.getIntegerInput("Give me the second number to add");
            int answer = BasicCalculator.addition(firstUserInput, secondUserInput);

            Console.println(String.valueOf(answer));

            //maybe some kind of switch case to choose which mathematical function






/*
        Console.println("Welcome to our calculator!");
        Console.println("Please select an operation:");
        Console.println("1. Addition");
        Console.println("2. Subtraction");
        Console.println("3. Multiplication");
        Console.println("4. Division");
        Console.println("1. Addition");
        Console.println("1. Addition");

*/


/*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

 */
    }
}
