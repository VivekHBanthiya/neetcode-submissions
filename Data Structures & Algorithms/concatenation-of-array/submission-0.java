class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        int i = 0;
        int j = nums.length;

        for(int a:nums){
            ans[i++] = a;
            ans[j++] = a;
        }

        return ans;
    }
}