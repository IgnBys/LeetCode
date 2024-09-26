class Solution {
    public int hIndex(int[] citations) {
// 6 5 3 1 0
        // 1 2 3 5 6
        Arrays.sort(citations);
        int h= 1;
        int more_h = 0;
        for (int i = citations.length-1; i>=0; i--){
            h=citations[i];
            if (more_h >= h){
                break;
            }
            more_h++;
            
        }
        return more_h;
    }
}