/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

*/

class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board == null || word.length() == 0 || word == null) {
            return false;
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int count) {
        if(count == word.length()) {
            return true;
        }
        
        // edge cases
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '#';
        boolean left = dfs(board, word, i, j - 1, count + 1);
        boolean right = dfs(board, word, i, j + 1, count + 1);
        boolean top = dfs(board, word, i - 1, j, count + 1);
        boolean down = dfs(board, word, i + 1, j, count + 1);
        boolean found = left || right || top || down;
        board[i][j] = temp;
        return found ;
    }
}
