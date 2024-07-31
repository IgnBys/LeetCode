class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int k = nums[0];
        for (int num: nums) {
            if(count == 0){
                k=num;
                count=1;
            } else if (k==num) {
                count++;
            }
            else{
                count--;
            }
        }
        return k;
    }
}