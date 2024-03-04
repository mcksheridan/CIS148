
import jobApplication.JobApplication;
import jobApplication.Education;
import jobApplication.PhoneNumber;
import jobApplication.Reference;
import jobApplication.Salary;
import jobApplication.Work;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week07
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Week seven's assignment
*/

public class Week07 {

    public static void runWeek(boolean run) {
        if (run) {
            Education school = new Education(
                    "Manchester Community College",
                    "A.S.",
                    "Manchester, NH"
            );
            Education[] educationalHistory = {school};
            
            Salary myDesiredSalary = new Salary("100000");
            Salary startSalary1 = new Salary("80000");
            Salary endSalary1 = new Salary("95000");
            Salary startSalary2 = new Salary("60000");
            Salary endSalary2 = new Salary("70000");
            
            PhoneNumber myPhoneNumber = new PhoneNumber("5551234567");
            PhoneNumber referencePhoneNumber = new PhoneNumber("5552345678");
            PhoneNumber previousJobPhone1 = new PhoneNumber("5553456789");
            PhoneNumber previousJobPhone2 = new PhoneNumber("5559876543");
            
            Reference reference = new Reference(
                "Jane Doe",
                "Concord, NH",
                referencePhoneNumber,
                "Supervisor"
            );
            Reference[] references = {reference};

            Work previousJob1 = new Work(
                    "Manager",
                    "1/1/22",
                    "2/1/24",
                    "ABC Company",
                    "John Smith",
                    previousJobPhone1,
                    "Portsmouth, NH",
                    "- Manage things",
                    "Company downsizing",
                    startSalary1,
                    endSalary1
            );
            Work previousJob2 = new Work(
                    "Jr. Manager",
                    "1/1/18",
                    "1/1/22",
                    "XYZ Corporation",
                    "Sally Johnson",
                    previousJobPhone2,
                    "Nashua, NH",
                    "- Manage things, but in a more junior-ish way",
                    "End of contract",
                    startSalary2,
                    endSalary2
            );
            Work[] workHistory = {previousJob1, previousJob2};
            
            JobApplication jobApp = new JobApplication(
                    "Sheridan McKisick",
                    "Manchester, NH",
                    myPhoneNumber,
                    myDesiredSalary,
                    true,
                    true,
                    educationalHistory,
                    references,
                    workHistory,
                    true
            );
            
            jobApp.printApplication();
        } else {
            System.out.println("Skipping week seven...");
        }
    }
}
