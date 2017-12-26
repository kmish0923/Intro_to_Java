import java.util.Scanner;

public class FixedCommonLoopErrors {
  public static void main(String[] args) {

    Scanner go = new Scanner(System.in);

    System.out.println("\nFix for Common Error #2: Off by one");
    // If you are trying to loop only 10 times...
    for (int i = 0 ; i <= 9 ; i++) {
      System.out.println("   I = " + i);
    }  // off-by-one errors!

    System.out.print("\nPress the enter key to continue ...");
    go.nextLine();


    System.out.println("\nFix for Common Error #4: Infinite loop - forgot braces (Ctrl-C to stop it)");
    int count = 0;
    while (count < 20)
      count ++ ;
      System.out.println("   Count is: " + count);
    
  }
}
