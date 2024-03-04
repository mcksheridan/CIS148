/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Be the Compiler: Tape Deck
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Instantiates a new TapeDeck object, t
*/

public class TapeDeck {
    boolean canRecord = false;
    
    void playTape() {
        System.out.println("tape playing");
    }
    
    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String [] args) {
        
        // Initializing a new TapeDeck object "t" makes this code run
        TapeDeck t = new TapeDeck();
        
        t.canRecord = true;
        t.playTape();
        
        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}