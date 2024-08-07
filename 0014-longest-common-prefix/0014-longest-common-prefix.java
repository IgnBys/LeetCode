class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        String longest_prefix = "";
        for (int i= 1; i < strs.length; i++){
            for ( int j = 0; j<Math.min(common.length(), strs[i].length()); j++){
                if (common.charAt(j) == strs[i].charAt(j)){
                    longest_prefix += common.charAt(j);
                }
                else {
                    break;
                }
            }
            common = longest_prefix;
            longest_prefix = "";
            if (common.length() == 0){
                break;
            }
        }
        return common;
    }
}
