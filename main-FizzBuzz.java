/**
 * Author: Eduardo Pozo
 * Created on: 5/10/2017
 * Last modified: 5/10/2017
 * Purpose: Exercise
 * Write a program that prints the numbers from 1 to 100. but for multiples of three print "Fizz" instead of the number
 * and for the multiples of five print "Buzz". For numbers which are multiples of both three and fizz print FizBuzz"
 */
public class main {
    public static void main(String[] args) {
        //for loop, check with mod, first test for FizzBuz, otherwise check for others.
        for(int counter = 1; counter <= 100; counter ++) {
            if(counter % 3 == 0 && counter % 5 == 0)
                System.out.println("FizzBuzz");
            else if(counter % 5 == 0)
                System.out.println("Buzz");
            else if(counter % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(counter);
        }
    }
}
