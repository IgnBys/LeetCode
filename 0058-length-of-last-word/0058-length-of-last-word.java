class Solution {
    public int lengthOfLastWord(String s) {
        int sum = 0;
        boolean check = false;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i)!=' '){
                sum++;
                check = true;
            }
            else if(check == true){
                break;
            }
        }
        return sum;
    }
}