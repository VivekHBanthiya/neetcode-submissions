class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;
        while(i<j){
            int a = heights[i];
            int b = heights[j];
            max = Math.max((Math.min(a, b)*(j-i)), max);

            if(a<b){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
