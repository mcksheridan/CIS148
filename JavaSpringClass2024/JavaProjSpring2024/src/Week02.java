/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheridanmckisick
 */
public class Week02 {
    
    public static void runWeek(boolean run) {
        if (run) {
            Greeter myGreeterObject = new Greeter();
            myGreeterObject.sayHello();
            myGreeterObject.askAge();
            myGreeterObject.takeCard();
            myGreeterObject.getNumber();
            RollDice.rollDice();
        } else {
            System.out.println("Skipping week two...");
        }
    }
}
