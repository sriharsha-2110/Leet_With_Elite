class Solution {
    public int pivotInteger(int n) {
        int x=n*(n+1)/2;
        int a=(int)Math.sqrt(x);

        if((a*a)==x){
            return a;
        }
        return -1;
    }
}