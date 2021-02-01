package Recursion;

public class NumberOfWaysToReachNSteps {

	// DP(Dynamic Programming) Recursion: Total Number of ways to reach n steps or
	// nth stair using step 1, 2 or 3
	// Uses Memoization(also Dynamic Programming) which caches the data and reuses
	// if founded once again

	static int[] memo;

	static int findNumberOfWays(int n) {

		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}

		if (memo[n] == -1) {
			memo[n] = findNumberOfWays(n - 1) + findNumberOfWays(n - 2) + findNumberOfWays(n - 3);
			return memo[n];
		} else {
			return memo[n];

		}

	}

	static void fillMemo(int dataToFill) {
		for (int i = 0; i < memo.length; i++) {
			memo[i] = dataToFill;
		}
	}

	public static void main(String[] args) {
		int numberOfSteps = 95;
		memo = new int[numberOfSteps + 1];
		fillMemo(-1);
		System.out.println(findNumberOfWays(numberOfSteps));
	}

}
