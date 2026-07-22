class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=0;
        for(int num:arr1){
            if(max<num){
                max=num;
            }
        }
        int freq[] = new int[max+1];
        for(int num:arr1){
            freq[num]++;
        }
        int j=0;
        int ans[]= new int[arr1.length];
        for(int i=0;i<arr2.length;i++){ 
            int n=freq[arr2[i]];
            while(n>0){
                ans[j++]=arr2[i];
                n--;
                freq[arr2[i]]--;
            }
        }
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                ans[j++]=i;
                freq[i]--;
            }
        }
        return ans;
    }
}