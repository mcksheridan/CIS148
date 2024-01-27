/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheridanmckisick
 */
public class RollDice {
    private static int randomInt(int low, int high) {
        int result = (int)(Math.random() * (high - low + 1)) + low;
        return result;
    }
    public static void rollDice() {
        int totalRolls = 20;
        System.out.println("Let's roll the dice " + totalRolls + " times!");
        int roll;
        int i = 0;
        while (i < totalRolls) {
            roll = randomInt(1, 6);
            System.out.println("Roll " + ++i + ": " + roll);
        }
    }
}