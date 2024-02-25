import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week06
    Programmer: Sheridan McKisick
    Date: February 24, 2024
    Synposis: For a given number, find (and sum) the natural numbers below it that are multiples of 3 or 5.
*/

public class Multiples {
    int limit;
    
    public Multiples(int limit) {
        this.limit = limit;
    }
    
    public ArrayList getMultiples() {
        ArrayList<Integer> multiples = new ArrayList<>();
        int i = 3;
        while (i < limit) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                multiples.add(i);
            }
            i += 1;
        }
        return multiples;
    }
    
    public int getSum(ArrayList<Integer> numberList) {
        int sum = 0;
        for (int number: numberList) {
            sum += number;
        }
        return sum;
    }
    
    public void printSum() {
        System.out.println("The sum of all natural numbers less than " + limit +
                " that are multiples of three and/or five is:\n" +
                getSum(getMultiples()));
    }
}
