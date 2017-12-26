import java.util.Scanner;

public class CounterLoop{
	public static void main(String [] args)
{
    int num;
    int number_of_scores = 0;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = keyboard.nextInt();

    int max = 0;
    int min = 0;
    int total = 0;

    while(num != 0)
    {
        number_of_scores++;
        total = total+num;

       
       
    	if(num != 0 && num < min)
   	 {
     	 min = num;
        }

         if(num > max)
        {
          max = num;
        }
        System.out.print("Enter a number: ");
        num = keyboard.nextInt();
    }
    System.out.println("Sum = " + total );
    System.out.println("Largest number = " + max);
    System.out.println("Smallest number = " + min);

    	if (num % 2 != 0) {
    		System.out.println("The sum is odd");
    	} 
    	else {
    		System.out.println("The sum is even");
    	}

	}
}