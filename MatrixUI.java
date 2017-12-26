import java.util.Scanner;
import java.util.Arrays;
import Matrix.Matrix;
import Utilities.Utilities;

public class MatrixUI{
   public static void main(String[] args) {
   		Scanner input_rows = new Scanner(System.in);
	 	Scanner input_columns = new Scanner(System.in);
	 	System.out.println("Enter the number of rows [1-5]");
	 	rows = Integer.parseInt(input_rows.next());
	 	while (rows < 1 || rows > 5){
	 		 System.out.println("Invalid number of rows, enter a number that is 1-5");
	 		 System.out.println("Enter the number of rows [1-5]");
	 		 rows = Integer.parseInt(input_rows.next());
	 		 continue;
	 	} 

	 	System.out.println("Enter the number of columns [1-5]");
	 	columns = Integer.parseInt(input_columns.next());
	 	while (columns < 1 || columns > 5){
	 		 System.out.println("Invalid number of columns, enter a number that is 1-5");
	 		 System.out.println("Enter the number of columns [1-5]");
	 		 columns = Integer.parseInt(input_columns.next());
	 		 continue;
	 	}

	 	Matrix  m1 = new Matrix(rows, columns);
	 	System.out.println("");
	 }
}