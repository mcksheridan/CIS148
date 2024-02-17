/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week04
    Programmer: Sheridan McKisick
    Date: February 3, 2024
    Synposis: Week four's assignment
*/

public class Week04 {    
    public static void runWeek(boolean run) {
        if (run) {
            Week_4_Literals literals = new Week_4_Literals();
            Week_4_Processes.printInfo(literals.speech);
        } else {
            System.out.println("Skipping week four...");
        }
    }
}
