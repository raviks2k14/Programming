package Arrays;

public class RotateMatrix {

	static void rotateMatrix(int[][] inputMatrix) {

		int[][] srcMatrix = inputMatrix;

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = srcMatrix.length - 1;
		int colEnd = srcMatrix[0].length - 1;
		int backupNo = -1;

		System.out.println("Before\n");

		for (int j = 0; j <= rowEnd; j++) {
			System.out.println("\n");
			for (int i = 0; i <= colEnd; i++) {
				System.out.print(" " + srcMatrix[j][i]);
			}			
		}
		

		while (rowStart < rowEnd && colStart < colEnd) {
			for (int i = colStart; i + 1 <= colEnd; i++) {
				if (backupNo != -1) {
					int temp = srcMatrix[rowStart][i + 1];
					srcMatrix[rowStart][i + 1] = backupNo;
					backupNo = temp;
				} else {
					backupNo = srcMatrix[rowStart][i + 1];
					srcMatrix[rowStart][i + 1] = srcMatrix[rowStart][i];
				}

			}

			for (int j = rowStart; j + 1 <= rowEnd; j++) {
				if (backupNo != -1) {
					int temp = srcMatrix[j + 1][colEnd];
					srcMatrix[j + 1][colEnd] = backupNo;
					backupNo = temp;
				} else {
					backupNo = srcMatrix[j + 1][colEnd];
					srcMatrix[j + 1][colEnd] = srcMatrix[j][colEnd];
				}
			}

			for (int i = colEnd; i - 1 >= colStart; i--) {
				if (backupNo != -1) {
					int temp = srcMatrix[rowEnd][i - 1];
					srcMatrix[rowEnd][i - 1] = backupNo;
					backupNo = temp;
				} else {
					backupNo = srcMatrix[rowEnd][i - 1];
					srcMatrix[rowEnd][i - 1] = srcMatrix[rowEnd][i];
				}

			}

			for (int i = rowEnd; i - 1 >= rowStart; i--) {

				if (backupNo != -1) {
					int temp = srcMatrix[i - 1][colStart];
					srcMatrix[i - 1][colStart] = backupNo;
					backupNo = temp;
				} else {
					backupNo = srcMatrix[i - 1][colStart];
					srcMatrix[i - 1][colStart] = srcMatrix[i][colStart];
				}

			}

			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
		}

		System.out.println("\nAfter\n");
		
		for (int j = 0; j <= srcMatrix.length - 1; j++) {
			System.out.println("\n");
			for (int i = 0; i <= srcMatrix[0].length - 1; i++) {
				System.out.print(" " + srcMatrix[j][i]);
			}			
		}

		

	}

	public static void main(String[] args) {
		int[][] inputMatrix = { { 8, 5}, { 9, 8}, { 1, 4}, { 9, 3} };
		rotateMatrix(inputMatrix);
	}

}
