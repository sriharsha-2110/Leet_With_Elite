class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[]= new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int qx=queries[i][0];
            int qy=queries[i][1];
            int r=queries[i][2];
            int rs=r*r;
            int count=0;
            for(int[] point:points){
                int px=point[0];
                int py=point[1];
                if((px-qx)*(px-qx)+(py-qy)*(py-qy)<=rs){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}