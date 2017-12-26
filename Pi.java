/* CS101 HW2 - Pi Calculations
	Name: Kimberly Mishra
	Date: 9/17/17
*/

// Declare the class and begin program
public class Pi {
	public static void main(String[] args) {

		// Declare variables
		double piAppx1, piAppx2 = 0.0;

		// Set  variables equal to pi approximations given
		piAppx1 = 4.00*(1-(1.00/3.00)+(1.00/5.00)-(1.00/7.00)+(1.00/9.00)-(1.00/11.00)+(1/13.00) - (1/15.00));
		piAppx2 = 4.00*(1-(1.00/3.00)+(1.00/5.00)-(1.00/7.00)+(1.00/9.00)-(1.00/11.00)+(1/13.00) - (1/15.00) + (1/16.00));

		// Print information program calclated
		System.out.println("\n Pi approx 1: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15) = "+ piAppx1);
		System.out.println("\n Pi approx 2: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 + 1/16) = "+ piAppx2);
	}
} 