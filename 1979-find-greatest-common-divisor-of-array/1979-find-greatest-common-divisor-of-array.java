class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int n=nums.length-1;
        int a=nums[0];
        int b=nums[0];
        while(n>=0){
            if(a<nums[n]){
                a=nums[n];
            }
            if(b>nums[n]){
                b=nums[n];
            }
            n--;
        }
        return gcd(a,b);
    }
}