import java.util.Scanner;

public class CommonLoopErrors {
  public static void main(String[] args) {

     int i = 3; 

  switch(i) {
    case 0:  i = 15; 
             break;
    case 1:  i = 5 * i;
    case 2:  i = -i; 
             break;
    case 3:  i = 40;
    default: i = 0; 
             break;
  }
  System.out.println(i)
}