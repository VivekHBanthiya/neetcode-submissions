class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        //nums = {1,2,4,8}
        //expected ans = {64, 32, 16, 8}
        arr1[0] = nums[0]; //arr1 = {1,}
        arr2[n-1] = nums[n-1];//arr2 = {,8}
        for(int i=1;i<n; i++){
            arr1[i] =  nums[i]*arr1[i-1];  //arr1 = {1,2,8,64}
        }
        for(int j=n-2; j>=0; j--){
            arr2[j] = nums[j]*arr2[j+1]; //arr2 = {64,64,32,8}
        }
        int[] ans = new int[n];
        ans[0] = arr2[1]; //{64,_,_,}
        ans[n-1] = arr1[n-2];//{0,_,_,8}
        for(int i=1; i<n-1; i++){
            ans[i] = arr1[i-1]*arr2[i+1]; 
        }
        return ans;
    }
}
