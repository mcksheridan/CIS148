/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

/*
    Program Name: Phone Number
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for formatting and returning (or printing) phone numbers.
*/

public class PhoneNumber {
    String number;
    
    public PhoneNumber(String number) {
        this.number = number;
    }
    
    public String formatPhoneNumber() {
        return "(" + number.substring(0, 3) + ")"
               + " " + number.substring(3, 6) + "-"
               + number.substring(6);
    }
    
    public String getPhoneNumber() {
        return formatPhoneNumber();
    }
    
    public void printPhoneNumber() {
        System.out.print(formatPhoneNumber());
    }
}
