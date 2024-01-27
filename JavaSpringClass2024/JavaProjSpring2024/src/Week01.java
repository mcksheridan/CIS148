/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheridanmckisick
 */
public class Week01 {
    
    public static void runWeek (boolean run) {
        if (run) {
            Numbers.checkPrimeNumbers1();
            Numbers.checkPrimeNumbers2();
            Numbers.checkPrimeNumbers3();
            Numbers.divideNumbers();
        } else {
            System.out.println("Skipping week one...");
        }
    }
}
