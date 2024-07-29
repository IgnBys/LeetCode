class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int val = -101;
        for (int i =0; i<nums.length;i++){
            if(val!=nums[i]){
                nums[k]=nums[i];
                val = nums[i];
                k++;
            }
        }
        return k;
    }
}