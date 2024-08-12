class Solution {
    public boolean isPalindrome(String s) {
        s= String.join("", s.split("[\\p{Punct}\\s]+")).toLowerCase();
        String new_s = new StringBuilder(s).reverse().toString();
        if (new_s.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}