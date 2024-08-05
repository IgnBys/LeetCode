class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char last_char = 'a';
        Map<Character, Integer> hashMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
                );
        for (char symbol: s.toCharArray()){
            if(last_char == 'I' && (symbol=='V' || symbol=='X')){
                sum+=hashMap.get(symbol)-2;
            } else if (last_char == 'X' && (symbol=='L' || symbol=='C')) {
                sum+=hashMap.get(symbol)-20;
            } else if (last_char == 'C' && (symbol=='D' || symbol=='M')) {
                sum+=hashMap.get(symbol)-200;
            }else{
                sum += hashMap.get(symbol);
                last_char = symbol;
            }

        }
        return sum;
    }
}