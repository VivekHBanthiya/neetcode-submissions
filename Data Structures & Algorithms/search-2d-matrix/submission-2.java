class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // step 1: find correct row => 1st col is in increasing order
        int n = matrix.length; // row len
        int m = matrix[0].length; // col len
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int val = matrix[mid][0];
            if (val == target) {
                return true;
            } else if (val > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        // step 2: find correct col in jth row
        int k = j;
        if(k<0) return false;
        i = 0;
        j = m - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int val = matrix[k][mid];
            if (val == target) {
                return true;
            } else if (val > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }
}
