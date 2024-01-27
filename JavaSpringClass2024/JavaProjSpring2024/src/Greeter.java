/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheridanmckisick
 */
import java.util.Scanner;

public class Greeter {
    static Scanner sc = new Scanner(System.in);
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void askAge() {
        System.out.println("How old are you?");
        int x = sc.nextInt();
        System.out.println("You are " + x + " years old.");
    }
    public void takeCard() {
        CardSuit suit = CardSuit.HEARTS;
        System.out.println("Your suit is " + suit);
    }
    public void getNumber() {
        System.out.println("Pick a number");
        int x = sc.nextInt();
        if ((x % 3 != 0 && x % 2 != 0) || x == 0)
            System.out.println("This number is not divisible by two or three...or it's a zero.");
        else
            System.out.println("This number is divisble by two or three.");
    }
}
