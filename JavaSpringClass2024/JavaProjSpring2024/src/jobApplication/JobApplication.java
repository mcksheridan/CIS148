/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

/*
    Program Name: Job Application
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for defining/formatting/printing a job application
*/

public class JobApplication {
   String name;
   String address;
   PhoneNumber phone;
   Salary desiredSalary;
   boolean graduatedHS;
   boolean hasUSWorkAuthorization;
   Education[] educationalHistory;
   Reference[] references;
   Work[] workHistory;
   boolean canContactMostRecentJob;
   
   public JobApplication(
           String name,
           String address,
           PhoneNumber phone,
           Salary desiredSalary,
           boolean graduatedHS,
           boolean hasUSWorkAuthorization,
           Education[] educationalHistory,
           Reference[] references,
           Work[] workHistory,
           boolean canContactMostRecentJob
   ) {
       this.name = name;
       this.address = address;
       this.phone = phone;
       this.desiredSalary = desiredSalary;
       this.graduatedHS = graduatedHS;
       this.hasUSWorkAuthorization = hasUSWorkAuthorization;
       this.educationalHistory = educationalHistory;
       this.references = references;
       this.workHistory = workHistory;
       this.canContactMostRecentJob = canContactMostRecentJob;
   }
   
   public String formatBoolean(boolean booleanValue) {
       if (booleanValue == true) {
           return "Yes";
       }
       
       return "No";
   }
   
   public void printApplication() {
       System.out.println("PERSONAL DATA");
       System.out.println("Name: \t" + name);
       System.out.println("Address: \t" + address);
       System.out.println("Phone: \t" + phone.getPhoneNumber());
       System.out.println("Desired Salary: \t" + desiredSalary.getSalary());
       System.out.println(
               "Graduated High School: \t"
               + formatBoolean(graduatedHS)
       );
       System.out.println(
               "Authorized to Work in the US: \t"
               + formatBoolean(hasUSWorkAuthorization)
       );

       System.out.println("\nEDUCATIONAL HISTORY");
       for (Education education: educationalHistory) {
           education.printEducation();
       }
       
       System.out.println("\nREFERENCES");
       for (Reference reference: references) {
           reference.printReference();
       }
       
       System.out.println("\nWORK HISTORY");
       for (int i = 0; i < workHistory.length; i++) {
           workHistory[i].printWork();
           if (i == 0) {
               System.out.println(
                       "\nYou can contact this employer: "
                       + formatBoolean(canContactMostRecentJob)
                       + "\n"
               );
           }
       }
       
       System.out.print("\n");
   }
}
