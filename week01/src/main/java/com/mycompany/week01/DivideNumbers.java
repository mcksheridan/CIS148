/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week01;

import java.util.Scanner;

/**
 *
 * @author sheridanmckisick
 */
public class DivideNumbers {

    public static void main(String[] args) {
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
