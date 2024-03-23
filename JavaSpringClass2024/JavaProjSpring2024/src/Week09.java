/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week09
    Programmer: Sheridan McKisick
    Date: March 23, 2024
    Synposis: Week nine's assignment
*/

public class Week09 {
    public static void runWeek(boolean run) {
        if (run) {
            System.out.println("Attempting to launch temperature converter GUI...");
            TemperatureConverterGUI gui = new TemperatureConverterGUI();
        } else {
            System.out.println("Skipping week nine...");
        }
    }
}
