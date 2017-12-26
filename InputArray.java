//#!/usr/bin/java

import java.util.Scanner;
import java.util.Arrays;

public class Matrix{

	 public static void main(String[] args){
	 	int rows;
	 	int columns;
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

	 	int[][] matrix = generateMatrix(rows, columns);
		printMatrix(matrix);
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
	 		 		transpose(matrix);
	 		 		printMatrix(transpose(matrix));
	 		 		menu = "";
	 		 		break;
	 		 	case "C":
	 		 		columnSum(matrix);
	 		 		menu = "";
	 		 		break;
	 		 	case "R":
	 		 		reverseRows(matrix);
	 				printMatrix(reverseRows(matrix));
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
	 public static int[][] generateMatrix(int m, int n){
	 	int[][] matrix = new int[m][n];
	 	for (int i = 0; i < m; i++)
	 		for (int j = 0; j < n; j++)
	 			matrix[i][j] = (i * 10)+j;
	 	return matrix;
	 }

	 public static int[][] printMatrix(int[][] matrix){
	 	int m = matrix.length;
	 	int n = matrix[0].length;

	 	for (int i = 0; i < m; i++){
	 		for (int j = 0; j < n; j++){
	 			System.out.printf("%6d ", matrix[i][j]);
	 		}
	 	    System.out.print("\n");
	 	}
	 	return matrix;

	 }
	 public static int[][] transpose(int[][] matrix){
	 	int m = matrix.length;
	 	int n = matrix[0].length;
	 	int matrixTransposed[][] = new int[n][m];
	 	for (int i = 0; i < m; i++)
	 		for (int j = 0; j < n; j++)
	 			matrixTransposed[j][i] = matrix[i][j];

	 	
	 	return matrixTransposed;
	 }
	 public static int[][] columnSum(int[][] matrix){
	 	int m = matrix.length;
	 	int n = matrix[0].length;
	 	for (int i = 0; i < n; i++){
	 		int sum = 0;
	 		for (int j = 0; j < m; j++){
	 			sum += matrix[j][i];
	 		}
	 		System.out.printf("%6d ", sum);

	 		
	 	}
	 	System.out.println("");
	 	return matrix;
	 }
	 public static int[][] reverseRows(int[][] matrix){
	 	int m = matrix.length;
	 	int n = matrix[0].length;
	 	int matrixRowReversal[][] = new int[m][n];
	 	for (int i = 0; i < m; i++){
	 		for (int j = 0; j < n; j++)
	 			matrixRowReversal[i][j] = matrix[i][n-1-j];
	 	}

	 	return matrixRowReversal;
	 }
}