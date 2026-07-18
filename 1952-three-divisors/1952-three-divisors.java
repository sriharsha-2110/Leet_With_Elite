class Solution {
    public boolean isThree(int n) {
        if(n<4)return false;
        int r=(int)Math.sqrt(n);
        if(r*r!=n)return false;
        for(int i=2;i*i<=r;i++){
            if(r%i==0)return false;
        }
        return true;
    }
}