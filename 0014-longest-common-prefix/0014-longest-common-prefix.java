class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest_prefix = strs[0];
        for (int i= 1; i < strs.length; i++){
            while(strs[i].indexOf(longest_prefix)!=0){
                longest_prefix = longest_prefix.substring(0, longest_prefix.length() -1);
                if(longest_prefix.length()==0){
                    return longest_prefix;
                }
            }
            
        }
        return longest_prefix;
    }
}
