
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheridanmckisick
 */
public class Numbers {
    public static void checkPrimeNumbers1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number greater than zero");
        int number = input.nextInt();
        for (int i = 1; i <= number; ++i) {
            if (i == number) {
                System.out.println(number + " is a prime number.");
                return;
            }
            if(i > 1 && number % i == 0) {
                System.out.println(number + " is not prime, it's divisible by " + i + ".");
                return;
            }
        }
    }
    
    public static void checkPrimeNumbers2() {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a whole number greater than zero.");
            number = input.nextInt();
        } while (number < 1);
        for (int i = 1; i <= number; ++i) {
            if (i == number) {
                System.out.println(number + " is a prime number.");
                return;
            }
            if(i > 1 && number % i == 0) {
                System.out.println(number + " is not prime, it's divisible by " + i + ".");
                return;
            }
        }
    }
    
    public static void checkPrimeNumbers3() {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a whole number greater than zero.");
            number = input.nextInt();
        } while (number < 1);
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 2; i < number; ++i) {
            if (i != number && number % i == 0) {
                divisors.add(i);
            }
        }
        if (divisors.isEmpty()) {
            System.out.println("The number " + number + " is prime.");
        } else {
            System.out.println("The number " + number + " is divisible by:");
            System.out.println("・ 1");
            for (Integer divisor : divisors) {
                System.out.println("・ " + divisor);
            }
            System.out.println("・ " + number);
        }
    }
    
    public static void divideNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to use as a dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter a number to use as a divisor: ");
        int divisor = input.nextInt();
        int quotient = dividend / divisor;
        float quotientFloat = (float) dividend / divisor;
        int remainder = dividend % divisor;
        String mathProblem = dividend + " divided by " + divisor + " equals ";
        System.out.println(mathProblem + quotient + " with a remainder of " + remainder);
        System.out.println(mathProblem + quotientFloat);
        System.out.printf(mathProblem + " %.3f", quotientFloat);
    }
}
