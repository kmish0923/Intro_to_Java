

import java.util.Scanner;
import java.util.Arrays;

public class Matrix{
	private int rows;
	private int columns;
	private int[][] matrix;


	public Matrix(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.matrix = this.generateMatrix();
		this.printMatrix();

	}
	public int[][] generateMatrix(){
	 	int[][] matrix = new int[this.rows][this.columns];
	 	for (int i = 0; i < this.rows; i++)
	 		for (int j = 0; j < this.columns; j++)
	 			matrix[i][j] = (i * 10)+j;
	 	return matrix;
	}
	public int[][] printMatrix(){
	 	int m = this.matrix.length;
	 	int n = this.matrix[0].length;

	 	for (int i = 0; i < m; i++){
	 		for (int j = 0; j < n; j++){
	 			System.out.printf("%6d ", matrix[i][j]);
	 		}
	 	    System.out.print("\n");
		}
	}


}

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































