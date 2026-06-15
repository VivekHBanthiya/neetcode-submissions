class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Integer>> row = new HashMap<>();
        Map<Integer, HashSet<Integer>> col = new HashMap<>();
        Map<Integer, HashSet<Integer>> smallBox = new HashMap<>();



        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if(c == '.')continue;
                int val = c - '1';
                int boxKey = (i/3)*3 + (j/3);

                if(!row.containsKey(i)) row.put(i, new HashSet<Integer>());
                if(!col.containsKey(j)) col.put(j, new HashSet<Integer>());
                if(!smallBox.containsKey(boxKey)) smallBox.put(boxKey, new HashSet<Integer>());

                HashSet<Integer> rowSet = row.get(i);
                HashSet<Integer> colSet = col.get(j);
                HashSet<Integer> smallBoxSet = smallBox.get(boxKey);

                if(rowSet.contains(val) || colSet.contains(val) || smallBoxSet.contains(val)){
                    return false;
                }
                rowSet.add(val);
                colSet.add(val);
                smallBoxSet.add(val);
            }
        }
        return true;
    }
}
