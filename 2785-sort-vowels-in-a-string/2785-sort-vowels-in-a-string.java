class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr= new ArrayList<>();
        String x="AEIOUaeiou";
        for(char ch:s.toCharArray()){
            if(x.indexOf(ch)!=-1){
                arr.add(ch);
            }
        }
        if(arr.size()==0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(arr);
        int i=0;
        for(char ch:s.toCharArray()){
            if(x.indexOf(ch)!=-1){
                sb.append(arr.get(i));
                i++;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}