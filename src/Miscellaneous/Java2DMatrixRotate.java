package Miscellaneous;

public class Java2DMatrixRotate {

	public void rotate(int[][] matrix) {

		if (matrix == null) {
			System.out.println("Invalid matrix");
		}

		int colCount = 0;
		int rowCount = 0;

		if (matrix[0].length == 1 && matrix.length > 1) {
			colCount = 1;
			rowCount = matrix.length;
		}

		if (matrix.length == 1 && matrix[0].length > 1) {
			rowCount = 1;
			colCount = matrix[0].length;
		}

		if (matrix.length > 1 && matrix[0].length > 1) {
			colCount = matrix[0].length;
			rowCount = matrix.length;
		}
		
		if (matrix.length == 1 && matrix[0].length == 1) {
			colCount = 1;
			rowCount = 1;
		}

		int[] dataArray = new int[rowCount * colCount];
		int dataArrayCount = 0;

		int limit = dataArray.length / rowCount;

		for (int colPointer = 0; colPointer < colCount; colPointer++) {
			for (int rowPointer = rowCount - 1; rowPointer >= 0; rowPointer--) {
				dataArray[dataArrayCount] = matrix[rowPointer][colPointer];
				dataArrayCount++;
			}
		}

		int finalRowPointer = 0;
		int finalColPointer = 0;

		for (int j = 0; j < dataArray.length; j++) {
			if (finalColPointer < limit) {
				matrix[finalRowPointer][finalColPointer] = dataArray[j];
				finalColPointer++;
			} else {
				finalRowPointer++;
				finalColPointer = 0;
				matrix[finalRowPointer][finalColPointer] = dataArray[j];
				finalColPointer++;
			}
		}

		for (int rowPointer = 0; rowPointer < rowCount; rowPointer++) {
			if (rowPointer != 0) {
				System.out.println("\n");
			}
			for (int colPointer = 0; colPointer < colCount; colPointer++) {
				System.out.print(" " + matrix[rowPointer][colPointer]);
			}
		}

	}

	public static void main(String[] args) {
		 //int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 //int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15,
		 //14, 12, 16 } };
		 int[][] matrix = {{1, 2, 3}};
		new Java2DMatrixRotate().rotate(matrix);
	}

}
