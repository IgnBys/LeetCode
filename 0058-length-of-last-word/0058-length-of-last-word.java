class Solution {
    public int lengthOfLastWord(String s) {
        int sum = 0;
        int help_sum = 0;
        char space =' ';
        for (int i=0; i<s.length();i++) {
            if (space==' ' && s.charAt(i) != space){
                help_sum++;
                if (help_sum == 1){
                    sum=0;
                }
                sum++;
            }
            else if(s.charAt(i) == space){
                help_sum =0;
                space = s.charAt(i);
            }
        }
        return sum;
    }
}