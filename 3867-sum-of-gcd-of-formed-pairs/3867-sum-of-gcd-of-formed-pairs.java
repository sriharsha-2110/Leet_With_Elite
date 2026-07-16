class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pgcd[] = new int[n];
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            pgcd[i]=gcd(nums[i],max);

        }
        Arrays.sort(pgcd);
        long sum=0;
        int l=0;
        int r=n-1;
        while(l<r){
            sum+=gcd(pgcd[l],pgcd[r]);
            l++;r--;
            
        }
        return sum;
    }
}