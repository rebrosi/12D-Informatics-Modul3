package uti;


import java.util.Scanner;

public class SpyralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int rowBegnining = 0, columnBeginning = 0, rowLimit = rows, columnLimit = columns;
		while (rowBegnining < rowLimit && columnBeginning < columnLimit) {
			// Print the first row from the remaining rows
			for (int i = columnBeginning; i < columnLimit; ++i) {
				System.out.print(matrix[rowBegnining][i] + " ");
			}
			rowBegnining++;

			// Print the last column from the remaining
			// columns
			for ( int i = rowBegnining; i < rowLimit; ++i) {
				System.out.print(matrix[i][columnLimit - 1] + " ");
			}
			columnLimit--;

			// Print the last row from the remaining rows */
			if (rowBegnining < rowLimit) {
				for ( int i = columnLimit - 1; i >= columnBeginning; --i) {
					System.out.print(matrix[rowLimit - 1][i] + " ");
				}
				rowLimit--;
			}

			// Print the first column from the remaining
			// columns */
			if (columnBeginning < columnLimit) {
				for (int i = rowLimit - 1; i >= rowBegnining; --i) {
					System.out.print(matrix[i][columnBeginning] + " ");
				}
				columnBeginning++;
			}
		}

	}

}