class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows=9;
        int cols=9;
        for(int i=0; i < rows; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();
            for(int j=0; j < cols; j++) {
                char rowBox = board[i][j];
                if(rowBox != '.' && !rowSet.add(rowBox)) {
                    return false;
                }
                char colBox = board[j][i];
                if(colBox != '.' && !columnSet.add(colBox)) {
                    return false;
                }
            }
        }
        for(int i=0; i< rows; i+=3) {
            for(int j=0;j<cols; j+=3) {
                if(!valid(board, i,j, i+2,j+2)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean valid(char[][] board, int x1, int y1, int x2, int y2) {
        Set<Character> set = new HashSet<>();
        for(int i=x1; i<=x2; i++) {
            for(int j=y1; j<=y2; j++) {
                char c = board[i][j];
                if(c != '.' && !set.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*
array.length rows
array[0].length columns
but we know its 9x9

use a set to check rows
use a set to check columns
use a set to check 3x3 boxes

0,0 to 2,2 | 0,3 to 5,2 | 0,6 to 2,8

need a method to check each separate box
after we have validated that the rows and columns are good for the entire board
need to traverse through the array once more
and then create the boxes for it
we can do a single for loop
because we know it will be three each.

board=[
[".",".","4", ".",".",".", "6","3","."],
[".",".",".", ".",".",".", ".",".","."],
["5",".",".", ".",".",".", ".","9","."],

[".",".",".", "5","6",".", ".",".","."],
["4",".","3", ".",".",".", ".",".","1"],
[".",".",".", "7",".",".", ".",".","."],

[".",".",".", "5",".",".", ".",".","."],
[".",".",".", ".",".",".", ".",".","."],
[".",".",".", ".",".",".", ".",".","."]]
*/