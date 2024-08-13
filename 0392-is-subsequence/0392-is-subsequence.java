class Solution {
    public boolean isSubsequence(String s, String t) {
        String subsequence = "";
        int j = 0;
        if(s.length() < t.length()){
           for( int i = 0; i< t.length() && j<s.length(); i++){
                if (t.charAt(i) == s.charAt(j)){
                    subsequence += s.charAt(j);
                    j++;
                }
            } 
        }
        else{
            for( int i = 0; i< s.length() && j<t.length(); i++){
                if (t.charAt(j) == s.charAt(i)){
                    subsequence += t.charAt(j);
                    j++;
                }
           }            
        }
        if(s.equals(subsequence)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}