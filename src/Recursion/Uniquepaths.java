package Recursion;

public class Uniquepaths {

	public int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];

		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}

		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
		}

		return dp[m - 1][n - 1];
	}

	public int recursiveUniquePaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;

		return recursiveUniquePaths(m - 1, n) + recursiveUniquePaths(m, n - 1);

	}

	public int uniquePaths(int[][] matrix) {
		int[][] dp = matrix;

		for (int i = 0; i < dp.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
		}

		for (int i = 0; i < dp.length; i++) {
			if (i > 0) {
				if (dp[i][0] != -1 && dp[i - 1][0] != -1) {
					dp[i][0] = 1;
				}
			} else {
				if (dp[i][0] != -1) {
					dp[i][0] = 1;
				}
			}

		}

		for (int j = 0; j < dp[0].length; j++) {

			if (j > 0) {
				if (dp[0][j] != -1 && dp[0][j - 1] != -1) {
					dp[0][j] = 1;
				}
			} else {
				if (dp[0][j] != -1) {
					dp[0][j] = 1;
				}
			}

		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				if (dp[i][j] != -1) {
					if (dp[i - 1][j] == -1) {
						dp[i][j] = dp[i][j - 1];
					} else if (dp[i][j - 1] == -1) {
						dp[i][j] = dp[i - 1][j];
					} else if (dp[i - 1][j] == -1 && dp[i][j - 1] == -1) {
						dp[i][j] = 0;
					} else {
						dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
					}
				}
			}
		}

//		for (int i = 0; i < dp.length; i++) {
//			System.out.println("\n");
//			for (int j = 0; j < dp[i].length; j++) {
//				System.out.print(" " + dp[i][j]);
//			}
//		}

		return dp[dp.length - 1][dp[0].length - 1];
	}

	public static void main(String[] args) {
		Uniquepaths obj = new Uniquepaths();
		int[][] matrix = new int[][] { { 0, 0, 0, 0 }, { -1, -1, 0, 0 }, { -1, 0, 0, 0 } };
		System.out.println("\n" + obj.uniquePaths(5, 10));
		System.out.println("\n" + obj.recursiveUniquePaths(5, 10));

		// System.out.println("\n" + obj.uniquePaths(matrix));
	}

}
