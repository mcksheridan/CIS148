
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week05
    Programmer: Sheridan McKisick
    Date: February 17, 2024
    Synposis: Week five's assignment
*/

public class Week05 {
    static Scanner sc = new Scanner(System.in);
    
    public static void runWeek(boolean run) {
        if (run) {
            // Array list to hold items that a user orders
            ArrayList<MenuItem> order = new ArrayList<>();
            
            System.out.println("Welcome to McDonald's!");
            System.out.println("Here's our menu:");
            
            MenuItem bigMac = new MenuItem(1, "Big Mac", 4.35,
                    "beef", "Big Mac sauce", "sesame seed bun", "pickles",
                    "lettuce", "onion", "American cheese");
            MenuItem quarterPounder = new MenuItem(2, "Quarter Pounder with Cheese", 4.40,
                    "beef", "onions", "pickles", "American cheese",
                    "sesame seed bun");
            MenuItem mcNuggets = new MenuItem(6, "10 pc. Chicken McNuggets", 4.35,
                    "white meat chicken");
            MenuItem filetOFish = new MenuItem(7, "Filet-O-Fish", 4.05,
                    "fish", "American cheese", "tartar sauce");
            MenuItem fries = new MenuItem("Fries", 2.20);
            MenuItem coke = new MenuItem("Coca-Cola", 1.00);
            
            // Create menu from items with combo numbers
            MenuItem[] comboMenu = {bigMac, quarterPounder, mcNuggets, filetOFish};
            
            // Print the combo menu
            for (MenuItem combo: comboMenu) {
                // Print with the "useComboNumber" boolean paramter
                combo.printItem(combo.number);
            }
                    
            System.out.println("Please enter the number of the menu item you want.");
            int comboChoice = sc.nextInt();  
            
            for (MenuItem combo: comboMenu) {
                if (combo.number == comboChoice) {
                    order.add(combo);
                    combo.printIngredients();
                    break;
                }
            }
            
            System.out.println("Would you like to add fries?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int fryChoice = sc.nextInt();
            
            if (fryChoice == 1) {
                order.add(fries);
            }
            
            System.out.println("Would you like to add a Coke?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int cokeChoice = sc.nextInt();
            
            if (cokeChoice == 1) {
                order.add(coke);
            }
            
            // The total price of all items the user has ordered
            double total = 0;
            
            System.out.println("You ordered:");
            
            for (MenuItem item: order) {
                item.printItem();
                // Add the price of an ordered item to the total
                total = total + item.price;
            }
            
            System.out.printf("Your total is: $%.2f%n", total);
        } else {
            System.out.println("Skipping week five...");
        }
    }
}
