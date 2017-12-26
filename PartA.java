import java.util.Scanner;

public class PartA {
  public static void main(String[] args) {
  	int answer = 1;
 	Scanner input = new Scanner(System.in);
 	while (answer == 1) {
 	System.out.print("Do you want to play again? \n" +
 	"[type 1 for yes, and 0 for no]\n");
 	answer = input.nextInt();
	 }
 	System.out.println("Thank you for playing!");
 	}
 }