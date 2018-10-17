/**
 * This program allows the user to create their own matrix then manipulate it.
 * @author YunSeo (Jennifer) Kim
 * @version March 21, 2016
 *
 */
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//choosing the number of rows
		System.out.print("Choose a number between 1 and 5 for the number of rows: ");
		int row = input.nextInt();
		if (row < 1 || row > 5) {
			System.out.println("");
			System.out.println("The number of rows is not within the range of 1 and 5.");
			System.exit(0);
		}
		
		//choosing the number of columns
		System.out.print("Choose a number between 1 and 5 for the number of columns: ");
		int column = input.nextInt();
		if (column < 1 || column > 5) {
			System.out.println("");
			System.out.println("The number of columns is not within the range of 1 and 5.");
			System.exit(0);
		}
		
		//creates new matrix
		int [][] inputMatrix = new int [row][column];
		
		//filling the array with random numbers between -10 and 10
		for (int r = 0; r < inputMatrix.length; r++) {
			for (int c = 0; c < inputMatrix[r].length; c++) {
				inputMatrix[r][c] = (int)(Math.random() * 21) - 10;
			}
		}
		
		System.out.println(" ");
		//print out random matrix
		System.out.println("This is your random matrix: ");
		printMatrix(inputMatrix);
		
		String choice;
		do {
			System.out.println("");
			System.out.println("Choose an item from the following menu: ");
			System.out.println("H horizontal flip - each row is reversed "
					+ "\nV vertical flip - each column is reversed"
					+ "\nT transpose - rows become columns (and vice versa)"
					+ "\nR rowMax - find largest value in each row"
					+ "\nC columnSum - find sum of the values in each column"
					+ "\nQ quit");
		
			//get user input choice of menu
			choice = input.next();
		
			//horizontal flip
			if (choice.equalsIgnoreCase("h")) {
				System.out.println(" ");
				System.out.println("Horizontal Flip: ");
				int [][] horizArray = horizontalFlip(inputMatrix);
				printMatrix(horizArray);
			}
			
			//vertical flip
			else if (choice.equalsIgnoreCase("v")) {
				System.out.println(" ");
				System.out.println("Vertical Flip: ");
				int [][] vertArray = verticalFlip(inputMatrix);
				printMatrix(vertArray);
			}
			
			//transpose
			else if (choice.equalsIgnoreCase("t")) {
				System.out.println(" ");
				System.out.println("Transpose: ");
				int [][] transArray = transpose(inputMatrix);
				printMatrix(transArray);
			}
			
			//maximum of row
			else if (choice.equalsIgnoreCase("r")) {
				System.out.println(" ");
				System.out.println("Row Max: ");
				int [] maxArray = rowMax(inputMatrix);
				for (int i = 0; i < maxArray.length; i++) {
					System.out.print(maxArray[i] + " ");
				}
				System.out.println();
			}
			
			//sum of column
			else if (choice.equalsIgnoreCase("c")) {
				System.out.println(" ");
				System.out.println("Sums: ");
				int [] maxArray = columnSum(inputMatrix);
				for (int i = 0; i < maxArray.length; i++) {
					System.out.print(maxArray[i] + " ");
				}
				System.out.println();
			}
			
			else if (!choice.equalsIgnoreCase("q")){
				System.out.println(" ");
				System.out.println("This is not one of the menu options. Please try again.");
			}
		}
		
		while (! choice.equalsIgnoreCase("q"));
	}

	
	
	/**
	 * This program flips a matrix horizontally.
	 * @param matrix 2d that the user determines the size of
	 * @return 2d array that is flipped horizontally
	 */
	public static int[][] horizontalFlip (int [][] matrix) {
		int [][] horizMatrix = new int [matrix.length][matrix[0].length];
		for (int col = 0; col < horizMatrix[0].length; col++) {
			for (int row = 0; row < horizMatrix.length; row++) {
				horizMatrix[row][col] = matrix[matrix.length - row - 1][col];
			}
		}
		return horizMatrix;
	}
	
	/**
	 * This program flips a matrix vertically.
	 * @param matrix 2d that the user determines the size of
	 * @return 2d array that is flipped vertically
	 */
	public static int[][] verticalFlip (int [][] matrix) {
		int [][] vertMatrix = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < vertMatrix.length; row++) {
			for (int col = 0; col < vertMatrix[row].length; col++) {
				vertMatrix[row][col] = matrix[row][matrix[row].length - col - 1];
			}
		}
		return vertMatrix;
	}
	
	/**
	 * This program transposes, or changes the rows into columns (and vice versa), a matrix.
	 * @param matrix 2d that user determines the size of
	 * @return 2d array that is transposed
	 */
	public static int [][] transpose (int [][]matrix){
		int [][] transMatrix = new int [matrix[0].length][matrix.length];
			for (int row = 0; row < transMatrix.length; row++) {
				for (int col = 0; col < transMatrix[row].length; col++) {
					transMatrix[row][col] = matrix [col][row];
				}
			}
		return transMatrix;
	}
	
	/**
	 * This program calculates the maximum of each row of a matrix.
	 * @param matrix 2d that user determines the size of
	 * @return a single dimensional array with the maximums
	 */
	public static int [] rowMax (int [][] matrix) {
		int max;
		int [] maximums = new int [matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			max = matrix [row][0];
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] > max) {
					max = matrix[row][col];
				}
			}
			maximums[row] = max;
		}
		return maximums;
	}
	
	/**
	 * This program calculates the sum of each column.
	 * @param matrix 2d that the user determines the size of
	 * @return 1d matrix with sums
	 */
	public static int [] columnSum (int [][] matrix) {
		int sum = 0;
		int [] sums = new int [matrix[0].length];
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 0; row < matrix.length; row ++) {
				sum = sum + matrix[row][col];
			}
			sums[col] = sum;
			sum = 0;
		}
		return sums;
	}
	
	
	/** 
	 * This program prints a matrix
	 * @param matrix 2d that the user determines the size of
	 */
	public static void printMatrix (int [][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%4d ", matrix[row][col]);
			}
			System.out.println();
		}
	}

}
