class Solution {
    public int lengthOfLastWord(String s) {
        int sum = 0;
        int help_sum = 0;
        char space =' ';
        for (char letter: s.toCharArray()) {
            if (space==' ' && letter != space){
                help_sum++;
                if (help_sum == 1){
                    sum=0;
                }
                sum++;
            }
            else if(letter == space){
                help_sum =0;
                space = letter;
            }
        }
        return sum;
    }
}