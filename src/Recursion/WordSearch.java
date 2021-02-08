package Recursion;

public class WordSearch {

	public boolean exist(char[][] board, String word) {
		int rows = board.length;
		int columns = board[0].length;
		boolean result = false;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (dfs(board, word, i, j, 0)) {
					result = true;
				}
			}
		}

		return result;

	}

	public boolean dfs(char[][] board, String word, int i, int j, int k) {
		int rows = board.length;
		int columns = board[0].length;

		if (i < 0 || j < 0 || i >= rows || j >= columns) {
			return false;
		}

		if (board[i][j] == word.charAt(k)) {
			board[i][j] = '#';
			if (k == word.length() - 1) {
				return true;
			} else if (dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1)
					|| dfs(board, word, i, j - 1, k + 1) || dfs(board, word, i, j + 1, k + 1)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		WordSearch wsObj = new WordSearch();
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(wsObj.exist(board, "EES"));
	}

}
