
import java.util.Scanner;
import java.util.Arrays;

public class Matrix{
	private int rows;
	private int columns;
	private int[][] matrix;

	public Matrix(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int[this.rows][this.columns];
		this.generateMatrix();

	}
	public void generateMatrix(){
	 	//int[][] matrix = new int[this.rows][this.columns];
	 	for (int i = 0; i < this.rows; i++)
	 		for (int j = 0; j < this.columns; j++)
	 			this.matrix[i][j] = (i * 10)+j;
	 	//return matrix;
	}
	public void printMatrix(){
	 	for (int i = 0; i < this.rows; i++){
	 		for (int j = 0; j < this.columns; j++){
	 			System.out.printf("%6d ", matrix[i][j]);
	 		}
	 	    System.out.print("\n");
		}
	}

	public void transpose(){
	 	Matrix matrixTransposed = new Matrix(this.columns, this.rows);
	 	for (int i = 0; i < this.rows; i++)
	 		for (int j = 0; j < this.columns; j++)
	 			matrixTransposed.matrix[j][i] = this.matrix[i][j];
	
	 	matrixTransposed.printMatrix();
	 }
	 public void columnSum(){
	 	for (int i = 0; i < this.columns; i++){
	 		int sum = 0;
	 		for (int j = 0; j < this.rows; j++){
	 			sum += matrix[j][i];
	 		}
	 		System.out.printf("%6d ", sum);

	 		
	 	}
	 	System.out.println("");

	 }
	 public void reverseRows(){
	 	Matrix matrixRowReversal = new Matrix(this.rows, this.columns);
	 	for (int i = 0; i < this.rows; i++){
	 		for (int j = 0; j < this.columns; j++)
	 			matrixRowReversal.matrix[i][j] = this.matrix[i][this.columns-1-j];
	 	}

	 	matrixRowReversal.printMatrix();
	 }

	public static void main(String[] args) {
   		Scanner input_rows = new Scanner(System.in);
	 	Scanner input_columns = new Scanner(System.in);
	 	System.out.println("Enter the number of rows [1-5]");
	 	int user_rows = Integer.parseInt(input_rows.next());
	 	while (user_rows < 1 || user_rows > 5){
	 		 System.out.println("Invalid number of rows, enter a number that is 1-5");
	 		 System.out.println("Enter the number of rows [1-5]");
	 		 user_rows = Integer.parseInt(input_rows.next());
	 		 continue;
	 	} 

	 	System.out.println("Enter the number of columns [1-5]");
	 	int user_columns = Integer.parseInt(input_columns.next());
	 	while (user_columns < 1 || user_columns > 5){
	 		 System.out.println("Invalid number of columns, enter a number that is 1-5");
	 		 System.out.println("Enter the number of columns [1-5]");
	 		 user_columns = Integer.parseInt(input_columns.next());
	 		 continue;
	 	}

	 	Matrix  m1 = new Matrix(user_rows, user_columns);
	 	m1.printMatrix();

	 	System.out.println("");
	 	System.out.println("T transpose - Rows become columns (and vice versa) ");
	 	System.out.println("C columnSum - Calculate the sum of the values in each column");
	 	System.out.println("R reverseRows - Reverse all elements in every row of the matrix");
	 	System.out.println("Q quit - Exit the program ");
	 	System.out.println("");

	 	
	 	Boolean loop = true;
	 	String menu = "";
	 	Scanner input = new Scanner(System.in);
	 	menu = input.next().toUpperCase();
	 	

	 	while (loop == true){
	 		switch (menu){
	 		 	case "T":
	 		 		m1.transpose();
	 		 		menu = "";
	 		 		break;
	 		 	case "C":
	 		 		m1.columnSum();
	 		 		menu = "";
	 		 		break;
	 		 	case "R":
	 		 		m1.reverseRows();
	 				menu = "";
	 				break;
	 		 	case "Q":
	 		 		loop = false;
	 		 		System.exit(0);
	 		 		break;
	 		 }
	 		System.out.println("T transpose - Rows become columns (and vice versa) ");
	 		System.out.println("C columnSum - Calculate the sum of the values in each column");
	 		System.out.println("R reverseRows - Reverse all elements in every row of the matrix");
	 		System.out.println("Q quit - Exit the program ");
	 		System.out.println("");
	 		menu = input.next().toUpperCase();
	 	}


	}
	

}
































