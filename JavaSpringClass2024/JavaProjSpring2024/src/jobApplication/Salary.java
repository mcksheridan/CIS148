/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobApplication;

import java.util.ArrayList;

/*
    Program Name: Salary
    Programmer: Sheridan McKisick
    Date: March 3, 2024
    Synposis: Class for formatting and returning (or printing) a salary.
*/

public class Salary {
    String salary;
    
    public Salary(String salary) {
        this.salary = salary;
    }
    
    public String formatSalary() {
        int salaryLength = salary.length();

        // Three digit salaries don't need a comma
        if (salaryLength < 4) {
            return "$" + salary;
        }
       
        // Placeholder for salary numbers
        ArrayList<Character> salaryArray = new ArrayList<>();
       
        int i = salaryLength - 1;
       
        // Starting the array at the end because commas are placed at
        // intervals of every three digits from the end, not from the beginning
        while (i > -1) {
            salaryArray.addFirst(salary.charAt(i));
           
            // If it's not the final (i.e. first) value AND
            // if its place in the number is the start of a set of three
            if ((i > 0) && ((salaryLength - i) % 3 == 0)) {
                salaryArray.addFirst(',');
            }
            i--;
        }
       
       String salaryWithCommas = "";
       
       for (Character salaryChar: salaryArray) {
           salaryWithCommas += salaryChar;
       }
       
       return "$" + salaryWithCommas;
    }
    
    public String getSalary() {
        return formatSalary();
    }
    
    public void printSalary() {
        System.out.print(formatSalary());
    }
}
