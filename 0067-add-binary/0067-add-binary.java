class Solution {
    public String addBinary(String a, String b) {
        String answer = "";
        String help_number = "0";
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        for(int i = maxLength-1; i >=0 ; i--){
            if(a.charAt(i)+b.charAt(i)+help_number.charAt(0)==147){
                answer = "1" + answer;
                help_number = "1";
            }
            else if(a.charAt(i)+b.charAt(i)+help_number.charAt(0)==146){
                answer = "0" + answer;
                help_number = "1";
            }
            else if(a.charAt(i)+b.charAt(i)+help_number.charAt(0)==145){
                answer = "1" + answer;
                help_number = "0";
            }
            else{
                answer = "0" + answer;
                help_number = "0";
            }
            if(i==0 && help_number.equals("1")){
                answer = "1" + answer;
            }
        }
        return answer;
    }
}