/***************************************************

  Name: Kimberly Mishra
  Date: 10/1/17
  Homework #7
  
  Program name:        HexUtility
  Program description: Accepts hexadecimal numbers as input.
                       Valid input examples: F00D, 000a, 1010, FFFF, bye, BYE
                       Enter BYE (case insensitive) to exit the program.
  
****************************************************/

import java.util.Scanner;

public class HexUtility {

  public static void main(String[] args) {

    // Maximum length of input string
    final byte INPUT_LENGTH = 4;

    String userInput = "";                   // Initialize to null string
    Scanner input = new Scanner(System.in);

    // Process the inputs until BYE is entered
    do {
      // Input a 4 digit hex number
      System.out.print("\nEnter a hexadecimal string, or enter BYE to quit:  ");
      userInput = input.next().toUpperCase();

      // Process the input
      switch (userInput) {

        case "BYE": 
             break;
            
        default:       
                        if (userInput.length() != INPUT_LENGTH) {
                          // Input length is incorrect
                          System.out.printf("      The input %s is the wrong length, it should be %d characters long.\n", userInput, INPUT_LENGTH);
                          continue;
                        }

                        // Input length is correct
                        if (isValidHex(userInput)) {  //Call method isValidHex
                          // The input is a valid hexadecimal string
                          System.out.printf("      The input %s is a valid hexadecimal value.\n", userInput);
                        }

                        else {
                          // String is either the wrong length or is not a valid hexadecimal string
                          System.out.printf("      The input %s is not a valid hexadecimal value.\n", userInput);
                        }
                        break;
        }
    } while (!userInput.equals("BYE"));

    // Exit the program
    System.out.println("\nGoodbye!");
    input.close();
  }
 
  // Method to validate the input.
  // This method returns true or false to the caller (main).
  // This method accepts one parameter - the user input.
  public static boolean isValidHex(String userIn) {
    boolean isValid = false;
        
    // The length is correct, now check that all characters are legal hexadecimal digits
    for (int i = 0; i < 4; i++) {
      char thisChar = userIn.charAt(i);

      // Is the character a decimal digit (0..9)? If so, advance to the next character
      if (Character.isDigit(thisChar)) {
        isValid = true;
      }

      else {
        // Character is not a decimal digit (0..9), is it a valid hexadecimal digit (A..F)?
        if (thisChar >= 'A' && thisChar <= 'F') {
          isValid = true;
        }
        else {
          // Found an invalid digit, no need to check other digits, exit this loop
          isValid = false;
          break;
        }
      }
    }
        
    // Returns true if the string is a valid hexadecimal string, false otherwise
    return isValid;
  }
}