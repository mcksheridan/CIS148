/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: MenuItem
    Programmer: Sheridan McKisick
    Date: February 17, 2024
    Synposis: Methods for creating menu items and printing ingredients/items
*/

public class MenuItem {
    int number;
    String name;
    String[] ingredients;
    double price;
    
    MenuItem(String name, double price, String ...ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    MenuItem(int number, String name, double price, String ...ingredients) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    public void printIngredients() {
        System.out.println("Here's what your sandwich comes with:");
        for (String ingredient: ingredients) {
            System.out.println("- " +  ingredient);
        }
    }
    
    public void printItem(int number) {
        System.out.printf(number + " - " + name + " ($%.2f)%n", price);
    }
    
    public void printItem() {
        System.out.printf("- " + name + " ($%.2f)%n", price);
    }
}
