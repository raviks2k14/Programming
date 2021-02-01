package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class JavaMatrixSpiral {

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();
		if (matrix.length == 0)
			return ans;
		int rowBegin = 0, rowEnd = matrix.length - 1;
		int colBegin = 0, colEnd = matrix[0].length - 1;
		while (rowBegin <= rowEnd && colBegin <= colEnd) {
			for (int colCount = colBegin; colCount <= colEnd; colCount++)
				ans.add(matrix[rowBegin][colCount]);
			for (int rowCount = rowBegin + 1; rowCount <= rowEnd; rowCount++)
				ans.add(matrix[rowCount][colEnd]);
			for (int c = colEnd - 1; c > colBegin; c--)
				ans.add(matrix[rowEnd][c]);
			for (int r = rowEnd; r > rowBegin; r--)
				ans.add(matrix[r][colBegin]);
			rowBegin++;
			rowEnd--;
			colBegin++;
			colEnd--;
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		List<Integer> ans = spiralOrder(a);

		for (Integer i : ans) {
			System.out.print(i + "  ");
		}
	}

}
