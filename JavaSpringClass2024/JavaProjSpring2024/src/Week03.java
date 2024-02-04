/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week03
    Programmer: Sheridan McKisick
    Date: February 3, 2024
    Synposis: Week three's assignment
*/
import java.util.Scanner;

public class Week03 {
    static Scanner sc = new Scanner(System.in);
    
    public static void runWeek(boolean run) {
        if (run) {
            System.out.println("Enter the amount of currency you would like to convert.");
            if (sc.nextDouble() > 0) {
                System.out.println("Greter than zero");
            }
            Double conversionInput = sc.nextDouble() > 0 || sc.nextDouble() < 0 ? sc.nextDouble() : 0.0;
            String currencies[] = {"CAD", "EUR", "GBP", "JPY", "ZAR"};
            CurrencyConversionRate rates = new CurrencyConversionRate();
            for (String element : currencies) {
                Double rate = 0.0;
                switch (element) {
                    case "CAD": rate = rates.cad;
                    break;
                    case "EUR": rate = rates.eur;
                    break;
                    case "GBP": rate = rates.gbp;
                    break;
                    case "JPY": rate = rates.jpy;
                    break;
                    case "ZAR": rate = rates.zar;
                    break; 
                }
                System.out.printf("%.2f", conversionInput);
                System.out.print(" " + element + "\t" + "USD");
                System.out.printf(" %.2f\n", rate * conversionInput);
            }
        } else {
            System.out.println("Skipping week three...");
        }
    }
}
