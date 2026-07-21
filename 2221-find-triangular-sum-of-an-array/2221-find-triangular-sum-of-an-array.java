class Solution {
    public int triangularSum(int[] nums) {
       
        for(int i=0;i<nums.length-1;i++){
            int n=nums.length-1;
            for(int j=0;j<n;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
            n--;
        }
        return nums[0];
    }
}