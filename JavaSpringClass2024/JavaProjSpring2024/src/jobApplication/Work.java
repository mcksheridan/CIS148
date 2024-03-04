/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

/*
    Program Name: Work
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for defining and printing a previous job.
*/

public class Work {
    String title;
    String startDate;
    String endDate;
    String companyName;
    String supervisorName;
    PhoneNumber phone;
    String address;
    String duties;
    String reasonForLeaving;
    Salary startSalary;
    Salary endSalary;
    
    public Work(
        String title,
        String startDate,
        String endDate,
        String companyName,
        String supervisorName,
        PhoneNumber phone,
        String address,
        String duties,
        String reasonForLeaving,
        Salary startSalary,
        Salary endSalary
    ) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.companyName = companyName;
        this.supervisorName = supervisorName;
        this.phone = phone;
        this.address = address;
        this.duties = duties;
        this.reasonForLeaving = reasonForLeaving;
        this.startSalary = startSalary;
        this.endSalary = endSalary;
    }
    
    public void printWork() {
        System.out.print("Title: ");
        System.out.print(title);
        System.out.print("\tStarting Date: ");
        System.out.print(startDate);
        System.out.print("\tEnding Date: ");
        System.out.print(endDate);
        System.out.print("\nCompany Name: ");
        System.out.print(companyName);
        System.out.print("\tSupervisor Name: ");
        System.out.print(supervisorName);
        System.out.print("\tPhone Number: ");
        phone.printPhoneNumber();
        System.out.print("\nAddress: ");
        System.out.print(address);
        System.out.print("\nDuties:\n");
        System.out.print(duties);
        System.out.print("\nReason for Leaving: ");
        System.out.print(reasonForLeaving);
        System.out.print("\tStarting Salary: ");
        startSalary.printSalary();
        System.out.print("\tEnding Salary: ");
        endSalary.printSalary();
    }
}
