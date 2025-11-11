import java.util.*;

class Main {
    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.'},
                          {'.','.','.','.'},
                          {'.','.','.','.'},
                          {'.','.','.','.'}}; 
        queen(board,0);
        System.out.println(Arrays.deepToString(board));
    }

    static void queen(char[][] board,int row){
        if(row==board.length){
            return;
        }
        for(int i=0;i<board[row].length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                queen(board,row+1,ans);
                board[row][i]='.';
            }
        }
    }

    static boolean isSafe(char[][] board,int row,int col){
            for(int i=row,j=col;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                        return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        }
        return true;
    }


