/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Be the Compiler: DVDPlayer
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Adds a new recordDVD() method to the DVDPlayer class
*/

class DVDPlayer {
    boolean canRecord = false;
    
    // Adding a playDVD method allows this to compile
    void playDVD() {
        System.out.println("DVD playing");
    }
    
    void recordDVD() {
        System.out.println("DVD recording");
    }
}

class DVDPlayerTestDrive {
    public static void main(String [] args) {
        
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
