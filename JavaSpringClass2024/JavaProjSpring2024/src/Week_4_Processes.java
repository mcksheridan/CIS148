/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Week 4 Processes
    Programmer: Sheridan McKisick
    Date: February 8, 2024
    Synposis: Assorted methods for handling the string from this week.
*/

public class Week_4_Processes {
    public static int countVowels(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // Convert text to lowercase so vowels match vowels[] characters
        String lowerCaseText = text.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < lowerCaseText.length(); i++) {
              for (char vowel: vowels) {
                  if (lowerCaseText.charAt(i) == vowel) {
                      // Increase count if the character is a vowel
                      vowelCount += 1;
                      // Then, stop traversing the vowels array
                      break;
                  }
              }
        }
        return vowelCount;
    }
    
    public static int countWords(String text) {
        String trimmedText = text.trim();
        String[] wordArray = trimmedText.split("\\s+");
        int wordCount = wordArray.length;
        return wordCount;
    }
    
    public static String[] getMiddleTenWordsArray(String text) {
        // Trim and split text to remove all whitespace
        String[] wordArray = text.trim().split("\\s+");
        int wordCount = wordArray.length;
        // The location of the middle word
        int midPoint = wordCount / 2;
        int startPoint = midPoint - 5;
        int endPoint = midPoint + 5;
        // Placeholder for ten words
        String[] middleWordsArray = new String[10];
        for (int i = startPoint; i < endPoint; i++) {
            // i - startPoint will equal a value between 0 and 9
            middleWordsArray[i - startPoint] = wordArray[i];
        }
        return middleWordsArray;
    }
    
    public static void printInfo(String text) {
        System.out.println("Number of vowels: " + countVowels(text));
        System.out.println("Number of words: " + countWords(text));
        System.out.print("Middle ten words: " + "\" ");
        for (String word: getMiddleTenWordsArray(text)) {
            System.out.print(word + " ");
        }
        System.out.println("\"");
    }
}
