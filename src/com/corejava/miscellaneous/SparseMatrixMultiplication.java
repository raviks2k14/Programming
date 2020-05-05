package com.corejava.miscellaneous;

public class SparseMatrixMultiplication {

	public int[][] multiply(int[][] A, int[][] B) {

		int[][] resultMatrix = new int[A.length][B[0].length];

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = A.length;
		int colEnd = B[0].length;
		int sum = 0;

		for (int i = rowStart; i < rowEnd; i++) {
			for (int j = colStart; j < colEnd; j++) {
				int colPointer = 0;
				int rowPointer = 0;
				while (rowPointer < B.length && colPointer < A[0].length) {
					int data = A[i][colPointer] * B[rowPointer][j];
					sum += data;
					resultMatrix[i][j] = sum;
					rowPointer++;
					colPointer++;
				}
				sum = 0;
			}
		}

		return resultMatrix;
	}

	public static void main(String[] args) {
		SparseMatrixMultiplication smm = new SparseMatrixMultiplication();
		int[][] matrix1 = new int[][] { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] matrix2 = new int[][] { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		int[][] resultMatrix = smm.multiply(matrix1, matrix2);
		int rowCount = resultMatrix.length;
		int colCount = resultMatrix[0].length;

		for (int i = 0; i < rowCount; i++) {
			System.out.println("\n");
			for (int j = 0; j < colCount; j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
		}
	}

}
