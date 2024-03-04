/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

/*
    Program Name: Reference
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for defining and printing a reference.
*/

public class Reference {
    String name;
    String address;
    PhoneNumber phone;
    String relationship;
    
    public Reference(
            String name,
            String address,
            PhoneNumber phone,
            String relationship
    ) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.relationship = relationship;
    }
    
    public void printReference() {
        System.out.print("Name: ");
        System.out.print(name);
        System.out.print("\tAddress: ");
        System.out.print(address);
        System.out.print("\tPhone: ");
        phone.printPhoneNumber();
        System.out.print("\tRelationship: ");
        System.out.println(relationship);
    }
}
