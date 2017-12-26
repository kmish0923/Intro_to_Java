//package hw24;

import java.io.File;

//TODO: Provide the necessary imports here
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileRW_CityData_skeleton {
  
  public static void main(String[] args) {
    System.out.println("Get city names from user and write them to a file ('end' to end):");
    writeUserInputsToFile();
    
    System.out.println("\nRead city names from the file - output them to console and backup file:");
    outputFileToConsoleAndNewFile();
  }
  
  public static void writeUserInputsToFile() {
     // File object to define the file to write to
  	 Scanner input = new Scanner(System.in);
     String directory = "data/";
     String filename  = "city_database.txt";
     File dataFile = new File(directory + filename);
     File path = new File(directory);
     if (!path.exists()) {
         if (!path.mkdirs()) {
             System.out.println("Error creating directory.");
             System.exit(1);
         }
     }

    // PrintWriter to write to the file
    // Note that the PrintWriter might fail if the file doesn't exist
    // therefore we have to place a try / catch block around it
    try {
      // create the PrintWriter - this will create the file for us 
      // (or clobber it if it already exists)
      PrintWriter myWriter = new PrintWriter(dataFile);

      // Continually ask the user for city names
      while (true) {
        // get a city name
        System.out.print("\tCity name: ");
        String name = input.nextLine();

        // if the user enters the sentinel value then we can end
        if (name.equals("end")) {
          input.close();
          break;
        }

        // put this String into our file
        myWriter.println(name);
      }

      myWriter.close();
      System.out.println("All done reading user inputs!");
    }

    // If there's an exception (i.e. the file doesn't exist) we can
    // handle it here
    catch (FileNotFoundException e) {
      System.out.println("Issue opening the file in question for writing!");
    }
  }
  
  public static void outputFileToConsoleAndNewFile() {

      // File object to define the file to write to
      File inFile = new File("data/city_database.txt");
      File newFile  = new File("data/city_db_backup.txt");
      
      //TODO: Create Scanner to read from the file: inFile
      try{
	     Scanner fileContents = new Scanner(inFile);

      //TODO: Write data read from file to a backup file: newFile
	     PrintWriter myWriter = new PrintWriter(newFile);
	     int iterator = 1;
	     while (fileContents.hasNextLine()) {
	     	String line = fileContents.nextLine();
	     	line = iterator + " - " + line;
	     	myWriter.println(line);
      
      //TODO: Write the same data to the console
	     	System.out.println( line);
	     	iterator++;
	  	 }
	  	 myWriter.close();
      //TODO: When written, the data should be formatted as (# - city name):
      /*
         1 - NYC
         2 - Athens
         3 - LA
         4 - Chicago
         5 - Austin
      */
      }
      catch (FileNotFoundException e) {
	  	System.out.println("Issue opening the file in question for writing!");
      }      
    }
}
