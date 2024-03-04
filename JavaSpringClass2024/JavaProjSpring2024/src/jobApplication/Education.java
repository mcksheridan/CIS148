/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

/*
    Program Name: Education
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for defining and printing an educational item.
*/

public class Education {
    String name;
    String degree;
    String address;
    
    public Education(String name, String degree, String address) {
        this.name = name;
        this.degree = degree;
        this.address = address;
    }
    
    public void printEducation() {
        System.out.print("School Name: ");
        System.out.print(name);
        System.out.print("\tDegree: ");
        System.out.print(degree);
        System.out.print("\tAddress: ");
        System.out.println(address);
    }
}
