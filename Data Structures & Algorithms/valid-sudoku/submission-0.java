class Solution {
    public boolean isValidSudoku(char[][] board) {

        //valid row
        for(int row = 0; row<9; row++){
            Set<Integer> set = new HashSet<>();
            for(int col=0;  col<9; col++){
                char c = board[row][col];
                if(c == '.')continue;
                    int val = c - '0';

                    if(set.contains(val))return false;
                    else set.add(val);
            }
        }
        //valid col
        for(int col = 0; col<9; col++){
            Set<Integer> set = new HashSet<>();
            for(int row=0;  row<9; row++){
                char c = board[row][col];
                if(c == '.')continue;
                    int val = c - '0';
                    if(set.contains(val))return false;
                    else set.add(val);
            }
        }
        //valid smallBox
        for(int row = 0; row<9; row+=3){
            for(int col=0;  col<9; col+=3){
                int re = row+2;
                int ce = col+2;
                if(!validBox(re,ce, board)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean validBox(int re, int ce, char[][]board){
        Set<Integer> set = new HashSet<>();
        for(int i=re-2; i<=re; i++){
            for(int j = ce-2; j<=ce; j++){
                char c = board[i][j];
                if(c == '.') continue;
                int val = c - '0';

                if(set.contains(val)){
                    return false;
                }else{
                    set.add(val);
                }
            }
        }
        return true;
    }
}
