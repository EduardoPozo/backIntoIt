import java.util.Scanner;

/**
 * Author: Eduardo Pozo
 * Date Created: 5/8/2017
 * Last Updated: 5/8/2017
 * Purpose: Create a simple calculator.
 * Improvements that can be made: Add try/catch statements to prevent wrong user input, or validate user input.
 */
public class main {

    public static void main(String[] args) {
        //Declare argument variables
        double argumentOne;
        double argumentTwo;
        double result = 0;
        String operator;

        String[] operatorList = {"+", "-", "*", "/", "%"};
        Scanner readInput = new Scanner(System.in);


        System.out.println("Welcome to my basic calculator program. \n I only support addition, subtraction," +
                            " integer multiplication, and integer division");
        System.out.println("Please enter integer one.");
        argumentOne = readInput.nextInt();
        System.out.println("Please enter intger two.");
        argumentTwo = readInput.nextInt();
        System.out.println("Lastly, enter the operator you would like to utilize.");
        operator = readInput.next();

        //Find operator, perform operation
        switch(operator) {
            case "+":   result = argumentOne + argumentTwo;
                        break;
            case "-":   result = argumentOne - argumentTwo;
                        break;
            case "*":   result = argumentOne * argumentTwo;
                        break;
            case "/":   result = argumentOne / argumentTwo;
                        break;
            case "%":   result = argumentOne % argumentTwo;
                        break;
            default:    System.out.println("Invalid format");
        }
        System.out.println(result);
    }

}