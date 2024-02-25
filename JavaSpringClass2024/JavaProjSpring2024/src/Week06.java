/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week06
    Programmer: Sheridan McKisick
    Date: February 24, 2024
    Synposis: Week six's assignment
*/

public class Week06 {

    public static void runWeek(boolean run) {
        if (run) {
            Multiples multiplesOfTen = new Multiples(10);
            multiplesOfTen.printSum();
            Multiples multiplesOfOneThousand = new Multiples(1000);
            multiplesOfOneThousand.printSum();
        } else {
            System.out.println("Skipping week six...");
        }
    }
}
